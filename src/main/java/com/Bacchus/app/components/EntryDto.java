package  com.Bacchus.app.components;

import java.io.Serializable;

/**
 * 参加DTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EntryDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 参加ID */
    private Long entryId;

    /** 候補日管理番号 */
    private Integer candidateNo;

    /** ユーザID */
    private int userId;

    /** 参加区分 */
    private Integer entryDiv;

    /** 参加区分表示名称 */
    private String entryDivDisp;

    /**
     * 参加IDの取得。
     *
     * @return 参加ID
     */
    public Long getEntryId() {
        return this.entryId;
    }

    /**
     * 参加IDを設定。
     *
     * @param entryId 参加ID
     */
    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

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
     * ユーザIDの取得。
     *
     * @return ユーザID
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * ユーザIDを設定。
     *
     * @param userId ユーザID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 参加区分の取得。
     *
     * @return 参加区分
     */
    public Integer getEntryDiv() {
        return this.entryDiv;
    }

    /**
     * 参加区分を設定。
     *
     * @param entryDiv 参加区分
     */
    public void setEntryDiv(Integer entryDiv) {
        this.entryDiv = entryDiv;
    }

    /**
     * 参加区分表示名称の取得。
     *
     * @return 参加区分表示名称
     */
    public String getEntryDivDisp() {
        return this.entryDivDisp;
    }

    /**
     * 参加区分表示名称を設定。
     *
     * @param entryDivDisp 参加区分表示名称
     */
    public void setEntryDivDisp(String entryDivDisp) {
        this.entryDivDisp = entryDivDisp;
    }

}
