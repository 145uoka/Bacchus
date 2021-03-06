package com.Bacchus.app.components;

import java.io.Serializable;

/**
 * イベントDTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EventDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント管理番号 */
    private int eventNo;

    /** イベント名 */
    private String eventName;

    /** イベント詳細 */
    private String eventDetail;

    /** 場所 */
    private String eventPlace;

    /** 場所URLエンコード済み */
    private String eventPlaceUrlEncode;

    /** URL */
    private String eventUrl;

    /** 電話番号 */
    private String tell;

    /** イベント参加費 */
    private Integer eventEntryFee;

    /** 補助フラグ */
    private Integer auxiliaryFlg;

    /** 補助フラグ表示名称 */
    private String auxiliaryFlgDisplay;

    /** 確定フラグ */
    private Integer fixFlg;

    /** 候補日管理番号 */
    private Integer candidateNo;

    /** 店舗名 */
    private String storeName;

    /** 参加人数 */
    private Integer entryPeople;

    /** イベント区分 */
    private Integer eventTypeId;

    /** 幹事ユーザID */
    private Integer userId;

    /** 幹事ユーザDto */
    private UserDto userDto;

    private EventTypeDto eventTypeDto;

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
     * イベント名の取得。
     *
     * @return イベント名
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * イベント名を設定。
     *
     * @param eventName イベント名
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * イベント詳細の取得。
     *
     * @return イベント詳細
     */
    public String getEventDetail () {
        return this.eventDetail;
    }

    /**
     * イベント詳細を設定。
     *
     * @param eventDetail  イベント詳細
     */
    public void setEventDetail (String eventDetail ) {
        this.eventDetail  = eventDetail;
    }

    /**
     * 場所の取得。
     *
     * @return 場所
     */
    public String getEventPlace () {
        return this.eventPlace;
    }

    /**
     * 場所を設定。
     *
     * @param eventPlace  場所
     */
    public void setEventPlace (String eventPlace ) {
        this.eventPlace  = eventPlace;
    }

    /**
     * URLの取得。
     *
     * @return URL
     */
    public String getEventUrl () {
        return this.eventUrl;
    }

    /**
     * URLを設定。
     *
     * @param eventUrl  URL
     */
    public void setEventUrl (String eventUrl ) {
        this.eventUrl  = eventUrl;
    }

    /**
     * 電話番号の取得。
     *
     * @return 電話番号
     */
    public String getTell() {
        return this.tell;
    }

    /**
     * 電話番号を設定。
     *
     * @param tell 電話番号
     */
    public void setTell(String tell) {
        this.tell = tell;
    }

    /**
     * イベント参加費の取得。
     *
     * @return イベント参加費
     */
    public Integer getEventEntryFee() {
        return this.eventEntryFee;
    }

    /**
     * イベント参加費を設定。
     *
     * @param eventEntryFee イベント参加費
     */
    public void setEventEntryFee(Integer eventEntryFee) {
        this.eventEntryFee = eventEntryFee;
    }

    /**
     * 補助フラグの取得。
     *
     * @return 補助フラグ
     */
    public Integer getAuxiliaryFlg () {
        return this.auxiliaryFlg;
    }

    /**
     * 補助フラグを設定。
     *
     * @param auxiliaryFlg  補助フラグ
     */
    public void setAuxiliaryFlg (Integer auxiliaryFlg ) {
        this.auxiliaryFlg  = auxiliaryFlg;
    }

    /**
     * 補助フラグ表示名称の取得。
     *
     * @return 補助フラグ表示名称
     */
    public String getAuxiliaryFlgDisplay() {
        return this.auxiliaryFlgDisplay;
    }

    /**
     * 補助フラグ表示名称を設定。
     *
     * @param auxiliaryFlgDisplay 補助フラグ表示名称
     */
    public void setAuxiliaryFlgDisplay(String auxiliaryFlgDisplay) {
        this.auxiliaryFlgDisplay = auxiliaryFlgDisplay;
    }

    /**
     * 確定フラグの取得。
     *
     * @return 確定フラグ
     */
    public Integer getFixFlg() {
        return this.fixFlg;
    }

    /**
     * 確定フラグを設定。
     *
     * @param fixFlg 確定フラグ
     */
    public void setFixFlg(Integer fixFlg) {
        this.fixFlg = fixFlg;
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
     * 店舗名の取得。
     *
     * @return 店舗名
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * 店舗名を設定。
     *
     * @param storeName 店舗名
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 参加人数の取得。
     *
     * @return 参加人数
     */
    public Integer getEntryPeople() {
        return this.entryPeople;
    }

    /**
     * 参加人数を設定。
     *
     * @param entryPeople 参加人数
     */
    public void setEntryPeople(Integer entryPeople) {
        this.entryPeople = entryPeople;
    }

    /**
     * イベント区分の取得。
     *
     * @return イベント区分
     */
    public Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * イベント区分を設定。
     *
     * @param eventTypeId イベント区分
     */
    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 幹事ユーザIDの取得。
     *
     * @return 幹事ユーザID
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 幹事ユーザIDを設定。
     *
     * @param userId 幹事ユーザID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 幹事ユーザDtoの取得。
     *
     * @return 幹事ユーザDto
     */
    public UserDto getUserDto() {
        return this.userDto;
    }

    /**
     * 幹事ユーザDtoを設定。
     *
     * @param userDto 幹事ユーザDto
     */
    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public EventTypeDto getEventTypeDto() {
        return eventTypeDto;
    }

    public void setEventTypeDto(EventTypeDto eventTypeDto) {
        this.eventTypeDto = eventTypeDto;
    }

    public String getEventPlaceUrlEncode() {
        return eventPlaceUrlEncode;
    }

    public void setEventPlaceUrlEncode(String eventPlaceUrlEncode) {
        this.eventPlaceUrlEncode = eventPlaceUrlEncode;
    }

}
