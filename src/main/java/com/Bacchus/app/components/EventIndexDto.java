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
    private String eventDiv;

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

    /** 汎用コード_M.コードID */
    private Integer codeId;

    /** 汎用コード_M.コード区分 */
    private String codeDiv;

    /** 汎用コード_M.コード */
    private String code;

    /** 汎用コード_M.名称 */
    private String name;

    /** 汎用コード_M.表示順 */
    private Integer orderNumber;

    /** 汎用コード_M.備考 */
    private String remarks;

    /** 参加人数 */
    private Long entryCount;

    /** 表示用開始日時 */
    private String eventStartDatetimeDisplay;

    /**
     * イベント_T.イベント管理番号の取得。
     *
     * @return イベント_T.イベント管理番号
     */
    public Integer getEventNo() {
        return this.eventNo;
    }

    /**
     * イベント_T.イベント管理番号を設定。
     *
     * @param eventNo イベント_T.イベント管理番号
     */
    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    /**
     * イベント_T.補助フラグの取得。
     *
     * @return イベント_T.補助フラグ
     */
    public Integer getAuxiliaryFlg() {
        return this.auxiliaryFlg;
    }

    /**
     * イベント_T.補助フラグを設定。
     *
     * @param auxiliaryFlg イベント_T.補助フラグ
     */
    public void setAuxiliaryFlg(Integer auxiliaryFlg) {
        this.auxiliaryFlg = auxiliaryFlg;
    }

    /**
     * イベント_T.候補日管理番号の取得。
     *
     * @return イベント_T.候補日管理番号
     */
    public Integer getCandidateNo() {
        return this.candidateNo;
    }

    /**
     * イベント_T.候補日管理番号を設定。
     *
     * @param candidateNo イベント_T.候補日管理番号
     */
    public void setCandidateNo(Integer candidateNo) {
        this.candidateNo = candidateNo;
    }

    /**
     * イベント_T.イベント詳細の取得。
     *
     * @return イベント_T.イベント詳細
     */
    public String getEventDetail() {
        return this.eventDetail;
    }

    /**
     * イベント_T.イベント詳細を設定。
     *
     * @param eventDetail イベント_T.イベント詳細
     */
    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    /**
     * イベント_T.イベント区分の取得。
     *
     * @return イベント_T.イベント区分
     */
    public String getEventDiv() {
        return this.eventDiv;
    }

    /**
     * イベント_T.イベント区分を設定。
     *
     * @param eventDiv イベント_T.イベント区分
     */
    public void setEventDiv(String eventDiv) {
        this.eventDiv = eventDiv;
    }

    /**
     * イベント_T.イベント参加費の取得。
     *
     * @return イベント_T.イベント参加費
     */
    public Integer getEventEntryFee() {
        return this.eventEntryFee;
    }

    /**
     * イベント_T.イベント参加費を設定。
     *
     * @param eventEntryFee イベント_T.イベント参加費
     */
    public void setEventEntryFee(Integer eventEntryFee) {
        this.eventEntryFee = eventEntryFee;
    }

    /**
     * イベント_T.イベント名の取得。
     *
     * @return イベント_T.イベント名
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * イベント_T.イベント名を設定。
     *
     * @param eventName イベント_T.イベント名
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * イベント_T.場所の取得。
     *
     * @return イベント_T.場所
     */
    public String getEventPlace() {
        return this.eventPlace;
    }

    /**
     * イベント_T.場所を設定。
     *
     * @param eventPlace イベント_T.場所
     */
    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    /**
     * イベント_T.URLの取得。
     *
     * @return イベント_T.URL
     */
    public String getEventUrl() {
        return this.eventUrl;
    }

    /**
     * イベント_T.URLを設定。
     *
     * @param eventUrl イベント_T.URL
     */
    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    /**
     * イベント_T.確定フラグの取得。
     *
     * @return イベント_T.確定フラグ
     */
    public Integer getFixFlg() {
        return this.fixFlg;
    }

    /**
     * イベント_T.確定フラグを設定。
     *
     * @param fixFlg イベント_T.確定フラグ
     */
    public void setFixFlg(Integer fixFlg) {
        this.fixFlg = fixFlg;
    }

    /**
     * イベント_T.店舗名の取得。
     *
     * @return イベント_T.店舗名
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * イベント_T.店舗名を設定。
     *
     * @param storeName イベント_T.店舗名
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * イベント_T.電話番号の取得。
     *
     * @return イベント_T.電話番号
     */
    public String getTell() {
        return this.tell;
    }

    /**
     * イベント_T.電話番号を設定。
     *
     * @param tell イベント_T.電話番号
     */
    public void setTell(String tell) {
        this.tell = tell;
    }

    /**
     * ユーザー_T.権限レベルの取得。
     *
     * @return ユーザー_T.権限レベル
     */
    public Integer getAuthLevel() {
        return this.authLevel;
    }

    /**
     * ユーザー_T.権限レベルを設定。
     *
     * @param authLevel ユーザー_T.権限レベル
     */
    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }

    /**
     * ユーザー_T.Eメールの取得。
     *
     * @return ユーザー_T.Eメール
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * ユーザー_T.Eメールを設定。
     *
     * @param email ユーザー_T.Eメール
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ユーザー_T.名前(名)の取得。
     *
     * @return ユーザー_T.名前(名)
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * ユーザー_T.名前(名)を設定。
     *
     * @param firstName ユーザー_T.名前(名)
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * ユーザー_T.苗字(氏)の取得。
     *
     * @return ユーザー_T.苗字(氏)
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * ユーザー_T.苗字(氏)を設定。
     *
     * @param lastName ユーザー_T.苗字(氏)
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * ユーザー_T.Lineフラグの取得。
     *
     * @return ユーザー_T.Lineフラグ
     */
    public Integer getLineFlg() {
        return this.lineFlg;
    }

    /**
     * ユーザー_T.Lineフラグを設定。
     *
     * @param lineFlg ユーザー_T.Lineフラグ
     */
    public void setLineFlg(Integer lineFlg) {
        this.lineFlg = lineFlg;
    }

    /**
     * ユーザー_T.LineIDの取得。
     *
     * @return ユーザー_T.LineID
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * ユーザー_T.LineIDを設定。
     *
     * @param lineId ユーザー_T.LineID
     */
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    /**
     * ユーザー_T.LINEユーザ名の取得。
     *
     * @return ユーザー_T.LINEユーザ名
     */
    public String getLineUserName() {
        return this.lineUserName;
    }

    /**
     * ユーザー_T.LINEユーザ名を設定。
     *
     * @param lineUserName ユーザー_T.LINEユーザ名
     */
    public void setLineUserName(String lineUserName) {
        this.lineUserName = lineUserName;
    }

    /**
     * ユーザー_T.ログインIDの取得。
     *
     * @return ユーザー_T.ログインID
     */
    public String getLoginId() {
        return this.loginId;
    }

    /**
     * ユーザー_T.ログインIDを設定。
     *
     * @param loginId ユーザー_T.ログインID
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * ユーザー_T.暗号化PWDの取得。
     *
     * @return ユーザー_T.暗号化PWD
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * ユーザー_T.暗号化PWDを設定。
     *
     * @param password ユーザー_T.暗号化PWD
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ユーザー_T.user_idの取得。
     *
     * @return ユーザー_T.user_id
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * ユーザー_T.user_idを設定。
     *
     * @param userId ユーザー_T.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ユーザー_T.ユーザー名の取得。
     *
     * @return ユーザー_T.ユーザー名
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * ユーザー_T.ユーザー名を設定。
     *
     * @param userName ユーザー_T.ユーザー名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * ユーザー_T.ユーザー区分IDの取得。
     *
     * @return ユーザー_T.ユーザー区分ID
     */
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * ユーザー_T.ユーザー区分IDを設定。
     *
     * @param userTypeId ユーザー_T.ユーザー区分ID
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * 候補日_T.終了日時の取得。
     *
     * @return 候補日_T.終了日時
     */
    public LocalDateTime getEventEndDatetime() {
        return this.eventEndDatetime;
    }

    /**
     * 候補日_T.終了日時を設定。
     *
     * @param eventEndDatetime 候補日_T.終了日時
     */
    public void setEventEndDatetime(LocalDateTime eventEndDatetime) {
        this.eventEndDatetime = eventEndDatetime;
    }

    /**
     * 候補日_T.開始日時の取得。
     *
     * @return 候補日_T.開始日時
     */
    public LocalDateTime getEventStartDatetime() {
        return this.eventStartDatetime;
    }

    /**
     * 候補日_T.開始日時を設定。
     *
     * @param eventStartDatetime 候補日_T.開始日時
     */
    public void setEventStartDatetime(LocalDateTime eventStartDatetime) {
        this.eventStartDatetime = eventStartDatetime;
    }

    /**
     * 候補日_T.開始年月日の取得。
     *
     * @return 候補日_T.開始年月日
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * 候補日_T.開始年月日を設定。
     *
     * @param startDate 候補日_T.開始年月日
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 候補日_T.開始時分の取得。
     *
     * @return 候補日_T.開始時分
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * 候補日_T.開始時分を設定。
     *
     * @param startTime 候補日_T.開始時分
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 汎用コード_M.コードIDの取得。
     *
     * @return 汎用コード_M.コードID
     */
    public Integer getCodeId() {
        return this.codeId;
    }

    /**
     * 汎用コード_M.コードIDを設定。
     *
     * @param codeId 汎用コード_M.コードID
     */
    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    /**
     * 汎用コード_M.コード区分の取得。
     *
     * @return 汎用コード_M.コード区分
     */
    public String getCodeDiv() {
        return this.codeDiv;
    }

    /**
     * 汎用コード_M.コード区分を設定。
     *
     * @param codeDiv 汎用コード_M.コード区分
     */
    public void setCodeDiv(String codeDiv) {
        this.codeDiv = codeDiv;
    }

    /**
     * 汎用コード_M.コードの取得。
     *
     * @return 汎用コード_M.コード
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 汎用コード_M.コードを設定。
     *
     * @param code 汎用コード_M.コード
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 汎用コード_M.名称の取得。
     *
     * @return 汎用コード_M.名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 汎用コード_M.名称を設定。
     *
     * @param name 汎用コード_M.名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 汎用コード_M.表示順の取得。
     *
     * @return 汎用コード_M.表示順
     */
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * 汎用コード_M.表示順を設定。
     *
     * @param orderNumber 汎用コード_M.表示順
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 汎用コード_M.備考の取得。
     *
     * @return 汎用コード_M.備考
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * 汎用コード_M.備考を設定。
     *
     * @param remarks 汎用コード_M.備考
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 参加人数の取得。
     *
     * @return 参加人数
     */
    public Long getEntryCount() {
        return this.entryCount;
    }

    /**
     * 参加人数を設定。
     *
     * @param entryCount 参加人数
     */
    public void setEntryCount(Long entryCount) {
        this.entryCount = entryCount;
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

}
