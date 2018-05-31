package com.Bacchus.app.form.event;

/**
 * 編集フォーム.
 *
 * @author hasegawa_m
 *
 */
public class EventEditForm extends AbstractEventRegisterForm {

	/** イベント管理番号 */
    private Integer eventNo;

	public Integer getEventNo() {
		return eventNo;
	}

	public void setEventNo(Integer eventNo) {
		this.eventNo = eventNo;
	}
}
