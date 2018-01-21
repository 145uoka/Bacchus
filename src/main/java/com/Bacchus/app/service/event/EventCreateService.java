package com.Bacchus.app.service.event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.form.event.EventCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.cbean.CandidateTCB;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;

/**
 * イベント登録画面のサービスクラス。
 *
 * @author sagawa_k
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class EventCreateService {

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    EventTBhv eventTBhv;

    @Autowired
    CandidateTBhv candidateTbhv;

    @Autowired
    CommonService commonService;

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    /**
     * イベント新規登録をするメソッド.
     *
     * @param form
     *            EventCreateForm
     * @throws ParseException
     */
    public void store(EventCreateForm form) throws ParseException {

        // 登録データの生成
        EventT eventT = new EventT();
        eventT.setEventNo(eventTBhv.selectNextVal());
        eventT.setEventName(form.getEventName());
        eventT.setEventDetail(form.getEventDetail());
        eventT.setEventPlace(form.getEventPlace());
        eventT.setEventUrl(form.getEventUrl());
        eventT.setTell(form.getTell());
        eventT.setStoreName(form.getStoreName());
        eventT.setEventDiv(form.getEventDiv());

        // 経費補助の項目が選択されている場合true
        if (StringUtils.isNotEmpty(form.getAuxiliaryFlg())) {
            eventT.setAuxiliaryFlg(Integer.parseInt(form.getAuxiliaryFlg()));
        }

        // 幹事項目が選択されている場合true
        if (StringUtils.isNotEmpty(form.getUserId())) {
            eventT.setUserId(Integer.parseInt(form.getUserId()));
        }

        // 参加費
        if (StringUtils.isNotEmpty(form.getEventEntryFee())) {
            eventT.setEventEntryFee(Integer.parseInt(form.getEventEntryFee()));
        }

        // 登録
        eventTBhv.insert(eventT);

        // 候補日の数だけDtoリストにセットする
        List<CandidateT> candidateList = new ArrayList<CandidateT>();

        for (int i = 0; i < form.getStartDate().length; i++) {

            //候補日が空白でなければtrue
            if (StringUtils.isNotEmpty(form.getStartDate()[i])) {

                CandidateT candidateT = new CandidateT();
                String startDateYYYYMDDD = form.getStartDate()[i].replace("/", "");                candidateT.setStartDate(startDateYYYYMDDD);
                if (StringUtils.isNotEmpty(form.getStartDate()[i])) {
                    // 日時フォーマット文字列  yyyy/MM
                    SimpleDateFormat df = new SimpleDateFormat(DateUtil.DATE_TIME_FORMAT_YYYYMMDD);

                    Date startDate = df.parse(form.getStartDate()[i]);
                    String str = new SimpleDateFormat(DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM).format(startDate);
                    candidateT.setEventStartDatetime(DateUtil.convertToLocalDateTime(str, DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM));
                }
                candidateT.setCandidateNo(candidateTbhv.selectNextVal());                candidateT.setEventNo(eventT.getEventNo());                candidateList.add(candidateT);

            }
        }

        if (CollectionUtils.isNotEmpty(candidateList)) {
            // 複数件登録処理
            candidateTbhv.batchInsert(candidateList);
        }

        // 未確定ボタンが選択されていない場合true
        if (StringUtils.isNotEmpty(form.getFixFlg())) {

            EventT event = new EventT();

            event.setEventNo(eventT.getEventNo());
            event.setFixFlg(Flag.ON.getIntegerValue());

            // 候補日テーブルから登録したイベントの候補日を取得
            CandidateTCB cb = new CandidateTCB();
            cb.query().setEventNo_Equal(eventT.getEventNo());

            // 確定ラジオボタンを選択した候補日の候補日番号をセット
            String fixDate = form.getStartDate()[Integer.parseInt(form.getFixFlg())].replace("/", "");
            for (CandidateT candidate : candidateList) {

                // CandidateTのイベント候補日が確定選択した候補日と一致すればtrue
                if (StringUtils.isNotEmpty(form.getFixFlg()))
                    if (StringUtils.equals(candidate.getStartDate(), fixDate)) {

                        // 確定候補日の候補日番号をセット
                        event.setCandidateNo(candidate.getCandidateNo());
                    }
                // 登録
                eventTBhv.update(event);
            }

        } else {

            // 未確定の場合fixFlgに0をセット
            EventT event = new EventT();
            event.setEventNo(eventT.getEventNo());
            event.setFixFlg(Flag.OFF.getIntegerValue());

            // 登録
            eventTBhv.update(event);
        }

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_03_0001,
                new Object[] { eventT.getEventNo(), eventT.getEventName() });

    }


    /**
     *
     * 確定ボタンが選択された候補日の未入力判定.
     *
     * @param form form
     *
     * @return 未入力ならtrue 入力されていたらfalse
     */
    public boolean isFixCandidate(EventCreateForm form) {

        //未確定ボタンが選択されていない場合true
        if (StringUtils.isNotEmpty(form.getFixFlg())) {

            //確定ボタンが選択されている日付が空白の時true
            if (StringUtils.isEmpty(form.getStartDate()[Integer.parseInt(form.getFixFlg())])) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * 幹事の項目名のセット.
     *
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
