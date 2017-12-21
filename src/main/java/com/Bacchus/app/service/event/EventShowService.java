package com.Bacchus.app.service.event;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.form.event.ShowForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.EventT;

/**
 * イベント登録画面のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventShowService {

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	EventTBhv eventTBhv;

	@Autowired
	CommonService commonService;

	/**
	 * イベント削除。
	 *
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void delete(ShowForm form) {
		OptionalEntity<EventT> optionalEntity = eventTBhv.selectByPK(form.getEventNo());
		EventT eventT = optionalEntity.get();

		eventTBhv.delete(eventT);

	}
}
