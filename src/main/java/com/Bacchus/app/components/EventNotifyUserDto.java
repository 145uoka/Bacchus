package  com.Bacchus.app.components;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * イベント通知対象ユーザーDTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EventNotifyUserDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ユーザー_T.userId */
    private Integer userId;

    /** ユーザー_T.ログインID */
    private Integer loginId;

    /** ユーザー_T.Lineフラグ */
    private Integer lineFlg;

    /** ユーザー_T.LineID */
    private Integer lineId;

    /** ユーザー_T.LINEユーザ名 */
    private String lineUserName;

    /** ユーザー_T.ユーザー名 */
    private String userName;

    /** ユーザー_T.苗字(氏) */
    private String lastName;

    /** ユーザー_T.名前(名) */
    private String firstName;

    /** ユーザー_T.Eメール */
    private String email;

    /** ユーザー_T.暗号化PWD */
    private String password;

    /** ユーザー_T.ユーザー区分ID */
    private Integer userTypeId;

    /** ユーザー_T.権限レベル */
    private Integer authLevel;

    /** ユーザー区分_M.ユーザー区分名称 */
    private String userTypeName;

    /** ユーザー区分_M.補助金額 */
    private String subsidyAmount;

    /** イベント通知_T.イベント通知番号 */
    private Integer eventNotifyNo;

    /** イベント通知_T.イベント管理番号 */
    private Integer eventNo;

    /** イベント通知_T.通知日時 */
    private LocalDateTime notifyDatetime;

    /** イベント通知_T.表示用通知日時 */
    private String notifyDatetimeDisplay;

    /**
     * ユーザー_T.userIdの取得。
     *
     * @return ユーザー_T.userId
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * ユーザー_T.userIdを設定。
     *
     * @param userId ユーザー_T.userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ユーザー_T.ログインIDの取得。
     *
     * @return ユーザー_T.ログインID
     */
    public Integer getLoginId() {
        return this.loginId;
    }

    /**
     * ユーザー_T.ログインIDを設定。
     *
     * @param loginId ユーザー_T.ログインID
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
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
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * ユーザー_T.LineIDを設定。
     *
     * @param lineId ユーザー_T.LineID
     */
    public void setLineId(Integer lineId) {
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
     * ユーザー区分_M.ユーザー区分名称の取得。
     *
     * @return ユーザー区分_M.ユーザー区分名称
     */
    public String getUserTypeName() {
        return this.userTypeName;
    }

    /**
     * ユーザー区分_M.ユーザー区分名称を設定。
     *
     * @param userTypeName ユーザー区分_M.ユーザー区分名称
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    /**
     * ユーザー区分_M.補助金額の取得。
     *
     * @return ユーザー区分_M.補助金額
     */
    public String getSubsidyAmount() {
        return this.subsidyAmount;
    }

    /**
     * ユーザー区分_M.補助金額を設定。
     *
     * @param subsidyAmount ユーザー区分_M.補助金額
     */
    public void setSubsidyAmount(String subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    /**
     * イベント通知_T.イベント通知番号の取得。
     *
     * @return イベント通知_T.イベント通知番号
     */
    public Integer getEventNotifyNo() {
        return this.eventNotifyNo;
    }

    /**
     * イベント通知_T.イベント通知番号を設定。
     *
     * @param eventNotifyNo イベント通知_T.イベント通知番号
     */
    public void setEventNotifyNo(Integer eventNotifyNo) {
        this.eventNotifyNo = eventNotifyNo;
    }

    /**
     * イベント通知_T.イベント管理番号の取得。
     *
     * @return イベント通知_T.イベント管理番号
     */
    public Integer getEventNo() {
        return this.eventNo;
    }

    /**
     * イベント通知_T.イベント管理番号を設定。
     *
     * @param eventNo イベント通知_T.イベント管理番号
     */
    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    /**
     * イベント通知_T.通知日時の取得。
     *
     * @return イベント通知_T.通知日時
     */
    public LocalDateTime getNotifyDatetime() {
        return this.notifyDatetime;
    }

    /**
     * イベント通知_T.通知日時を設定。
     *
     * @param notifyDatetime イベント通知_T.通知日時
     */
    public void setNotifyDatetime(LocalDateTime notifyDatetime) {
        this.notifyDatetime = notifyDatetime;
    }

    /**
     * イベント通知_T.表示用通知日時の取得。
     *
     * @return イベント通知_T.表示用通知日時
     */
    public String getNotifyDatetimeDisplay() {
        return this.notifyDatetimeDisplay;
    }

    /**
     * イベント通知_T.表示用通知日時を設定。
     *
     * @param notifyDatetimeDisplay イベント通知_T.表示用通知日時
     */
    public void setNotifyDatetimeDisplay(String notifyDatetimeDisplay) {
        this.notifyDatetimeDisplay = notifyDatetimeDisplay;
    }

}
