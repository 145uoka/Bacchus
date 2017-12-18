package  com.Bacchus.app.components;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 候補日管理DTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class CandidateDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 候補日管理番号 */
    private Integer candidateNo;

    /** イベント管理番号 */
    private int eventNo;

    /** 開始日時 */
    private LocalDateTime eventStartDatetime;

    /** 終了日時 */
    private LocalDateTime eventEndDatetime;

    /** 開始年月日 */
    private String startDate;

    /** 開始時分 */
    private String startTime;

    /** 表示用開始日時 */
    private String eventStartDatetimeDisplay;

    /** 表示用終了日時 */
    private String eventEndDatetimeDisplay;

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
     * イベント管理番号の取得。
     *
     * @return イベント管理番号
     */
    public int getEventNo() {
        return this.eventNo;
    }

    /**
     * イベント管理番号を設定。
     *
     * @param eventNo イベント管理番号
     */
    public void setEventNo(int eventNo) {
        this.eventNo = eventNo;
    }

    /**
     * 開始日時の取得。
     *
     * @return 開始日時
     */
    public LocalDateTime getEventStartDatetime() {
        return this.eventStartDatetime;
    }

    /**
     * 開始日時を設定。
     *
     * @param eventStartDatetime 開始日時
     */
    public void setEventStartDatetime(LocalDateTime eventStartDatetime) {
        this.eventStartDatetime = eventStartDatetime;
    }

    /**
     * 終了日時の取得。
     *
     * @return 終了日時
     */
    public LocalDateTime getEventEndDatetime() {
        return this.eventEndDatetime;
    }

    /**
     * 終了日時を設定。
     *
     * @param eventEndDatetime 終了日時
     */
    public void setEventEndDatetime(LocalDateTime eventEndDatetime) {
        this.eventEndDatetime = eventEndDatetime;
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
     * 表示用開始日時の取得。
     *
     * @return 表示用開始日時
     */
    public String getEventStartDatetimeDisplay() {
        return this.eventStartDatetimeDisplay;
    }

    /**
     * 表示用開始日時を設定。
     *
     * @param eventStartDatetimeDisplay 表示用開始日時
     */
    public void setEventStartDatetimeDisplay(String eventStartDatetimeDisplay) {
        this.eventStartDatetimeDisplay = eventStartDatetimeDisplay;
    }

    /**
     * 表示用終了日時の取得。
     *
     * @return 表示用終了日時
     */
    public String getEventEndDatetimeDisplay() {
        return this.eventEndDatetimeDisplay;
    }

    /**
     * 表示用終了日時を設定。
     *
     * @param eventEndDatetimeDisplay 表示用終了日時
     */
    public void setEventEndDatetimeDisplay(String eventEndDatetimeDisplay) {
        this.eventEndDatetimeDisplay = eventEndDatetimeDisplay;
    }

}
