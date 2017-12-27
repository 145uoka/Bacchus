package  com.Bacchus.app.form.event;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * ログインフォーム。
 *
 * @author sagawa_k
 * $Id:$
 */
public class EventCreateForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;


//	private Integer eventNo;

	@NotEmpty
	private String eventName;


	private String eventDetail;



	private String eventPlace;


	private String eventUrl;


	private String tell;


//	private Integer eventEntryFee;


	private String auxiliaryFlg ;


	private String fixFlg ;


//	private Integer candidateNo ;


	private String storeName ;


//	private Integer entryPeople ;


	private String eventDiv ;


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


	public String getEventDiv() {
		return eventDiv;
	}


	public void setEventDiv(String eventDiv) {
		this.eventDiv = eventDiv;
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




}
