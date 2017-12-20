package com.Bacchus.app.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.form.event.EventCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.dbflute.cbean.CandidateTCB;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * イベント登録画面のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventCreateService {

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	EventTBhv eventTBhv;

	@Autowired
	CandidateTBhv candidateTbhv;

	@Autowired
	CommonService commonService;

	/**
	 * イベント新規登録するメソッド.
	 *
	 * @param form form
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void store(EventCreateForm form) {

		// 登録データの生成
		EventT eventT = new EventT();
		eventT.setEventNo(eventTBhv.selectNextVal());
		eventT.setEventName(form.getEventName());
		eventT.setEventDetail(form.getEventDetail());
		eventT.setEventPlace(form.getEventPlace());
		eventT.setEventUrl(form.getEventUrl());
		eventT.setTell(form.getTell());
		eventT.setEventEntryFee(form.getEventEntryFee());
		eventT.setAuxiliaryFlg(form.getAuxiliaryFlg());
		eventT.setStoreName(form.getStoreName());
		eventT.setEntryPeople(form.getEntryPeople());
		eventT.setEventDiv(form.getEventDiv());
		eventT.setUserId(form.getUserId());

		// 登録
		eventTBhv.insert(eventT);


		// 候補日が選択されていた場合true
		if (!(form.getStartDate()[0].equals("YYYY/MM/DD"))) {

			// 候補日をセットするDtoリストの準備
			List<CandidateT> candidateList = new ArrayList<CandidateT>();

			// 候補日の数だけDtoリストにセットする
			for (int i = 0; i < form.getStartDate().length; i++) {

				CandidateT candidateT = new CandidateT();

				candidateT.setStartDate(form.getStartDate()[i]);
				candidateT.setCandidateNo(candidateTbhv.selectNextVal());
				candidateT.setEventNo(eventT.getEventNo());
				candidateList.add(candidateT);
			}

			// 複数件登録処理
			candidateTbhv.batchInsert(candidateList);
		}


		// 未確定ボタンが選択されていない場合true
		if (!(form.getFixFlg() == null || form.getFixFlg().equals(""))) {

			EventT event = new EventT();

			event.setEventNo(eventT.getEventNo());
			event.setFixFlg(1);

			// 候補日テーブルから登録したイベントの候補日を取得
			CandidateTCB cb = new CandidateTCB();
			cb.query().setEventNo_Equal(eventT.getEventNo());
			List<CandidateT> candidateList = candidateTbhv.readList(cb);

			// 確定ラジオボタンを選択した候補日の候補日番号をセット
			for (CandidateT candidate : candidateList) {

				// CandidateTのイベント候補日が確定選択した候補日と一致すればtrue
				if (candidate.getStartDate().equals(form.getStartDate()[form.getFixFlg()])) {

					//確定候補日の候補日番号をセット
					event.setCandidateNo(candidate.getCandidateNo());
				}
				// 登録
				eventTBhv.update(event);
			}

		} else {

			//未確定の場合fixFlgに0をセット
			EventT event = new EventT();
			event.setEventNo(eventT.getEventNo());
			event.setFixFlg(0);

			// 登録
			eventTBhv.update(event);
		}

	}

	/**
	 * 幹事の項目名のセット。
	 *
	 * @param form
	 * @return 幹事の項目名
	 */
	public List<LabelValueDto> userNamePullDown() {
		UserTCB cb = new UserTCB();
		cb.query().addOrderBy_UserId_Asc();
		List<UserT> userTList = userTBhv.readList(cb);

		List<LabelValueDto> userIdSelectList = new ArrayList<LabelValueDto>();

		LabelValueDto labelValueDto = new LabelValueDto();
		labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
		labelValueDto.setValue("");

		userIdSelectList.add(labelValueDto);

		for (UserT userT : userTList) {

			LabelValueDto dto = new LabelValueDto();
			dto.setValue(userT.getUserId());
			dto.setLabel(userT.getLastName() + userT.getFirstName());
			userIdSelectList.add(dto);

		}
		return userIdSelectList;

	}
}
