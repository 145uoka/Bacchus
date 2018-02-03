package com.Bacchus.app.form.event;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.Bacchus.webbase.common.beanvalidation.Number;
import com.Bacchus.webbase.common.constants.MessageKeyConstants.GlueNetValidator;

/**
 * ログインフォーム。
 *
 * @author sagawa_k
 * $Id:$
 */
public class EventCreateForm implements Serializable {

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
	private String fixFlg ;

	private String storeName ;

	private Integer eventTypeId ;

	@Number(message=GlueNetValidator.INVALID)
	private String userId ;

	private String[] startDate;


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


	public String getFixFlg() {
		return fixFlg;
	}


	public void setFixFlg(String fixFlg) {
		this.fixFlg = fixFlg;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getEventTypeId() {
        return eventTypeId;
    }


    public void setEventTypeId(Integer eventTypeId) {
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


}
