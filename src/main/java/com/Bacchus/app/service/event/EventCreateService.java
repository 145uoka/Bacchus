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
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
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
	CommonService commonService;

	/**
	 * 新規登録。
	 *
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void store(EventCreateForm form) {

		// 登録データの生成
		EventT eventT = new EventT();
		eventT.setEventName(form.getEventName());
		eventT.setEventDetail(form.getEventDetail());
		eventT.setEventPlace(form.getEventPlace());
		eventT.setEventUrl(form.getEventUrl());
		eventT.setTell(form.getTell());
		eventT.setEventEntryFee(form.getEventEntryFee());
		eventT.setAuxiliaryFlg(form.getAuxiliaryFlg());
		eventT.setFixFlg(form.getFixFlg());
		eventT.setCandidateNo(form.getCandidateNo());
		eventT.setStoreName(form.getStoreName());
		eventT.setEntryPeople(form.getEntryPeople());
		eventT.setEventDiv(form.getEventDiv());
		eventT.setUserId(form.getUserId());

		// 登録
		eventTBhv.insert(eventT);

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
