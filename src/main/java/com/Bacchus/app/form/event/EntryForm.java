package com.Bacchus.app.form.event;

import java.io.Serializable;

/**
 * 参加可否登録用Form。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EntryForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 候補日管理番号 */
    private Integer candidateNo;

    /** 開始年月日 */
    private String startDate;

    /** 開始時分 */
    private String startTime;

    /** 参画区分 */
    private String entryDiv;

    /**
     * 候補日管理番号の取得。
     *
     * @return 候補日管理番号
     */
    public Integer getCandidateNo() {
        return this.candidateNo;
    }

    /**
     * 候補日管理番号を設定。
     *
     * @param candidateNo 候補日管理番号
     */
    public void setCandidateNo(Integer candidateNo) {
        this.candidateNo = candidateNo;
    }

    /**
     * 開始年月日の取得。
     *
     * @return 開始年月日
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * 開始年月日を設定。
     *
     * @param startDate 開始年月日
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 開始時分の取得。
     *
     * @return 開始時分
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * 開始時分を設定。
     *
     * @param startTime 開始時分
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 参画区分の取得。
     *
     * @return 参画区分
     */
    public String getEntryDiv() {
        return this.entryDiv;
    }

    /**
     * 参画区分を設定。
     *
     * @param entryDiv 参画区分
     */
    public void setEntryDiv(String entryDiv) {
        this.entryDiv = entryDiv;
    }

}
