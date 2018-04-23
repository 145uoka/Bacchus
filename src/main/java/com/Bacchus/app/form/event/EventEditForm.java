package com.Bacchus.app.form.event;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.Bacchus.webbase.common.beanvalidation.Number;
import com.Bacchus.webbase.common.constants.MessageKeyConstants.GlueNetValidator;

/**
 * 編集フォーム.
 *
 * @author hasegawa_m
 *
 */
public class EventEditForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String eventName;

	private String eventDetail;

	private String eventPlace;

	private String eventUrl;

	private String tell;

	@Number
	private String eventEntryFee;

	@Number(message=GlueNetValidator.INVALID)
	private String auxiliaryFlg ;

	@Number(message=GlueNetValidator.INVALID)
	private String fixDate ;

	private String storeName ;

	private String eventTypeId ;

	@Number(message=GlueNetValidator.INVALID)
	private String userId ;

	private String[] startDate;

	/** イベント管理番号 */
    private Integer eventNo;


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getEventDetail() {
		return eventDetail;
	}


	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
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


	public String getTell() {
		return tell;
	}


	public void setTell(String tell) {
		this.tell = tell;
	}


	public String getAuxiliaryFlg() {
		return auxiliaryFlg;
	}


	public void setAuxiliaryFlg(String auxiliaryFlg) {
		this.auxiliaryFlg = auxiliaryFlg;
	}


	public String getFixDate() {
		return fixDate;
	}


	public void setFixDate(String fixDate) {
		this.fixDate = fixDate;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getEventTypeId() {
        return eventTypeId;
    }


    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String[] getStartDate() {
		return startDate;
	}


	public void setStartDate(String[] startDate) {
	    this.startDate = startDate;
	}


    public String getEventEntryFee() {
        return eventEntryFee;
    }


    public void setEventEntryFee(String eventEntryFee) {
        this.eventEntryFee = eventEntryFee;
    }


	public Integer getEventNo() {
		return eventNo;
	}


	public void setEventNo(Integer eventNo) {
		this.eventNo = eventNo;
	}


}
