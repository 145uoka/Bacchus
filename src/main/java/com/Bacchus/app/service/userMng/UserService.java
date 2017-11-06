package com.Bacchus.app.service.userMng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.form.userMng.UserAddForm;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;

/**
 * 雇用契約設定のサービスクラス。
 *
 * @author majo_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService{

	@Autowired
	UserTBhv userTBhv;

	/**
	 * 新規登録。
	 *
	 * @param form
	 * @return 登録ID
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void register(UserAddForm form) {

		// 登録データの生成
		UserT userT = new UserT();
		userT.setUserName(form.getUserName());
		userT.setAuthLevel(0);
		userT.setUserTypeId(1);
		userT.setEmail(form.getEmail());
		  String encPassword = EncryptUtil.saltHash(form.getPassword(), EncryptUtil.EncryptType.MD5);
		userT.setPassword(encPassword);

		// 登録
		userTBhv.insert(userT);

	}
}
