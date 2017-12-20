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


	private Integer eventNo;

	@NotEmpty
	private String eventName;


	private String eventDetail;



	private String eventPlace;


	private String eventUrl;


	private String tell;


	private Integer eventEntryFee;


	private Integer auxiliaryFlg ;


	private Integer fixFlg ;


	private Integer candidateNo ;


	private String storeName ;


	private Integer entryPeople ;


	private String eventDiv ;


	private Integer userId ;


	private String[] StartDate;

	public Integer getEventNo() {
		return eventNo;
	}

	public void setEventNo(Integer eventNo) {
		this.eventNo = eventNo;
	}

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

	public Integer getEventEntryFee() {
		return eventEntryFee;
	}

	public void setEventEntryFee(Integer eventEntryFee) {
		this.eventEntryFee = eventEntryFee;
	}

	public Integer getAuxiliaryFlg() {
		return auxiliaryFlg;
	}

	public void setAuxiliaryFlg(Integer auxiliaryFlg) {
		this.auxiliaryFlg = auxiliaryFlg;
	}

	public Integer getFixFlg() {
		return fixFlg;
	}

	public void setFixFlg(Integer fixFlg) {
		this.fixFlg = fixFlg;
	}

	public Integer getCandidateNo() {
		return candidateNo;
	}

	public void setCandidateNo(Integer candidateNo) {
		this.candidateNo = candidateNo;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getEntryPeople() {
		return entryPeople;
	}

	public void setEntryPeople(Integer entryPeople) {
		this.entryPeople = entryPeople;
	}

	public String getEventDiv() {
		return eventDiv;
	}

	public void setEventDiv(String eventDiv) {
		this.eventDiv = eventDiv;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String[] getStartDate() {
		return StartDate;
	}

	public void setStartDate(String[] startDate) {
		StartDate = startDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
