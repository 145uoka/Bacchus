package com.Bacchus.app.service.entry;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.form.entry.EntryForm;
import com.Bacchus.app.form.entry.EntryRegisterForm;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.dbflute.cbean.CandidateTCB;
import com.Bacchus.dbflute.cbean.EntryTCB;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.dbflute.exentity.EventT;

/**
 * 参加可否登録のサービスクラス。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntryService extends AbstractService {

    @Autowired
    EventTBhv eventTBhv;

    @Autowired
    CandidateTBhv candidateTBhv;

    @Autowired
    EntryTBhv entryTBhv;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void registerEntry(EntryRegisterForm form, Integer eventNo, Integer userId) {

        List<EntryForm> entryFormList = form.getEntryFormList();

        List<EntryT> registerEntryTList = new ArrayList<EntryT>();

        for (EntryForm entryForm : entryFormList) {
            if (StringUtils.isNotBlank(entryForm.getEntryDiv())) {
                EntryT entryT = new EntryT();
                entryT.setCandidateNo(entryForm.getCandidateNo());
                entryT.setUserId(userId);
                entryT.setEntryDiv(Integer.valueOf(entryForm.getEntryDiv()));

                registerEntryTList.add(entryT);
            }
        }

        ListResultBean<CandidateT> candidateTList = findRegisterCandidateTList(eventNo);

        List<Integer> candidateNoList = new ArrayList<Integer>();

        for (CandidateT candidateT : candidateTList) {
            candidateNoList.add(candidateT.getCandidateNo());
        }

        ListResultBean<EntryT> deleteEntryTList = findRegisterEntryTList(userId, candidateNoList);

        entryTBhv.batchDelete(deleteEntryTList);
        entryTBhv.batchInsert(registerEntryTList);
    }

    public ListResultBean<EntryT> findRegisterEntryTList(Integer userId, List<Integer> candidateNoList) {

        EntryTCB entryTCB = new EntryTCB();
        entryTCB.query().setUserId_Equal(userId);
        entryTCB.query().setCandidateNo_InScope(candidateNoList);
        ListResultBean<EntryT> entryTList = entryTBhv.readList(entryTCB);
        return entryTList;
    }

    public ListResultBean<EntryT> findEntryByCandidateNoList(List<Integer> candidateNoList) {

        EntryTCB entryTCB = new EntryTCB();
        entryTCB.setupSelect_UserT();
        entryTCB.setupSelect_CandidateT();
        entryTCB.query().queryCandidateT().innerJoin();
        entryTCB.query().queryUserT().innerJoin();
        entryTCB.query().setCandidateNo_InScope(candidateNoList);
        entryTCB.query().addOrderBy_UserId_Asc();
        entryTCB.query().queryCandidateT().addOrderBy_EventEndDatetime_Asc();
        ListResultBean<EntryT> entryTList = entryTBhv.readList(entryTCB);
        return entryTList;
    }

    public ListResultBean<CandidateT> findRegisterCandidateTList(Integer eventNo) {
        CandidateTCB candidateTCB = new CandidateTCB();
        candidateTCB.query().setEventNo_Equal(eventNo);
        candidateTCB.setupSelect_EventT();
        candidateTCB.query().queryEventT().innerJoin();
        candidateTCB.query().addOrderBy_StartDate_Asc();
        candidateTCB.query().addOrderBy_StartTime_Asc();

        ListResultBean<CandidateT> candidateTList = candidateTBhv.readList(candidateTCB);
        return candidateTList;
    }

    public EventDto findEventByPK(int eventNo) {

        EventDto result = null;

        OptionalEntity<EventT> eventT = eventTBhv.selectByPK(eventNo);

        if (eventT.isPresent() && eventT != null) {
            result = new EventDto();
            result.setAuxiliaryFlg(eventT.get().getAuxiliaryFlg());
            result.setCandidateNo(eventT.get().getCandidateNo());
            result.setEntryPeople(eventT.get().getEntryPeople());
            result.setEventDetail(eventT.get().getEventDetail());
            result.setEventDiv(eventT.get().getEventDiv());
            result.setEventEntryFee(eventT.get().getEventEntryFee());
            result.setEventName(eventT.get().getEventName());
            result.setEventNo(eventT.get().getEventNo());
            result.setEventPlace(eventT.get().getEventPlace());
            result.setEventUrl(eventT.get().getEventUrl());
            result.setFixFlg(eventT.get().getFixFlg());
            result.setStoreName(eventT.get().getStoreName());
            result.setTell(eventT.get().getTell());
            result.setUserId(eventT.get().getUserId());
        }

        return result;
    }

}
