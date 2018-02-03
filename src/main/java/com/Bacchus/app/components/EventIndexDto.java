package  com.Bacchus.app.components;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * イベント一覧DTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EventIndexDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント_T.イベント管理番号 */
    private Integer eventNo;

    /** イベント_T.補助フラグ */
    private Integer auxiliaryFlg;

    /** イベント_T.候補日管理番号 */
    private Integer candidateNo;

    /** イベント_T.イベント詳細 */
    private String eventDetail;

    /** イベント_T.イベント区分 */
    private String eventTypeId;

    /** イベント_T.イベント参加費 */
    private Integer eventEntryFee;

    /** イベント_T.イベント名 */
    private String eventName;

    /** イベント_T.場所 */
    private String eventPlace;

    /** イベント_T.URL */
    private String eventUrl;

    /** イベント_T.確定フラグ */
    private Integer fixFlg;

    /** イベント_T.店舗名 */
    private String storeName;

    /** イベント_T.電話番号 */
    private String tell;

    /** ユーザー_T.権限レベル */
    private Integer authLevel;

    /** ユーザー_T.Eメール */
    private String email;

    /** ユーザー_T.名前(名) */
    private String firstName;

    /** ユーザー_T.苗字(氏) */
    private String lastName;

    /** ユーザー_T.Lineフラグ */
    private Integer lineFlg;

    /** ユーザー_T.LineID */
    private String lineId;

    /** ユーザー_T.LINEユーザ名 */
    private String lineUserName;

    /** ユーザー_T.ログインID */
    private String loginId;

    /** ユーザー_T.暗号化PWD */
    private String password;

    /** ユーザー_T.user_id */
    private Integer userId;

    /** ユーザー_T.ユーザー名 */
    private String userName;

    /** ユーザー_T.ユーザー区分ID */
    private Integer userTypeId;

    /** 候補日_T.終了日時 */
    private LocalDateTime eventEndDatetime;

    /** 候補日_T.開始日時 */
    private LocalDateTime eventStartDatetime;

    /** 候補日_T.開始年月日 */
    private String startDate;

    /** 候補日_T.開始時分 */
    private String startTime;


    /** 汎用コード_M.名称 */
    private String eventTypeName;

    /** 汎用コード_M.表示順 */
    private Integer orderNum;


    /** 参加人数 */
    private Long entryCount;

    /** 表示用開始日時 */
    private String eventStartDatetimeDisplay;

    public Integer getEventNo() {
        return eventNo;
    }

    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    public Integer getAuxiliaryFlg() {
        return auxiliaryFlg;
    }

    public void setAuxiliaryFlg(Integer auxiliaryFlg) {
        this.auxiliaryFlg = auxiliaryFlg;
    }

    public Integer getCandidateNo() {
        return candidateNo;
    }

    public void setCandidateNo(Integer candidateNo) {
        this.candidateNo = candidateNo;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public String getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Integer getEventEntryFee() {
        return eventEntryFee;
    }

    public void setEventEntryFee(Integer eventEntryFee) {
        this.eventEntryFee = eventEntryFee;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Integer getFixFlg() {
        return fixFlg;
    }

    public void setFixFlg(Integer fixFlg) {
        this.fixFlg = fixFlg;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Integer getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getLineFlg() {
        return lineFlg;
    }

    public void setLineFlg(Integer lineFlg) {
        this.lineFlg = lineFlg;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineUserName() {
        return lineUserName;
    }

    public void setLineUserName(String lineUserName) {
        this.lineUserName = lineUserName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public LocalDateTime getEventEndDatetime() {
        return eventEndDatetime;
    }

    public void setEventEndDatetime(LocalDateTime eventEndDatetime) {
        this.eventEndDatetime = eventEndDatetime;
    }

    public LocalDateTime getEventStartDatetime() {
        return eventStartDatetime;
    }

    public void setEventStartDatetime(LocalDateTime eventStartDatetime) {
        this.eventStartDatetime = eventStartDatetime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Long getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(Long entryCount) {
        this.entryCount = entryCount;
    }

    public String getEventStartDatetimeDisplay() {
        return eventStartDatetimeDisplay;
    }

    public void setEventStartDatetimeDisplay(String eventStartDatetimeDisplay) {
        this.eventStartDatetimeDisplay = eventStartDatetimeDisplay;
    }
}
