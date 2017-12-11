package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.UserTUserTypeMDto;
import com.Bacchus.app.form.user.UserIndexForm;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.cbean.UserTypeMCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.dbflute.exentity.UserTypeM;

/**
 * ユーザー一覧のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserIndexService {

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	UserTypeMBhv userTypeMBhv;

	/**
	 * 一覧リスト取得。
	 *
	 * @return 登録ID
	 */
	public List<UserTUserTypeMDto> selectList() {

		//UserTの一覧取得
		UserTCB userTCb = new UserTCB();
		userTCb.query().addOrderBy_UserId_Asc();
		List<UserT> userTList = userTBhv.readList(userTCb);

		//UserTypeMの一覧取得
		UserTypeMCB userTypeMCb = new UserTypeMCB();
		userTypeMCb.query().addOrderBy_UserTypeId_Asc();
		List<UserTypeM> userTypeMList = userTypeMBhv.readList(userTypeMCb);

		//一覧表示項目をセットする	dtoの準備
		List<UserTUserTypeMDto> UserTUserTypeMDtoList = new ArrayList<UserTUserTypeMDto>();

		//一覧表示項目をセットする
		for(UserT userT : userTList){
			UserTUserTypeMDto userTUserTypeMDto = new UserTUserTypeMDto();
			userTUserTypeMDto.setUserId(userT.getUserId());
			userTUserTypeMDto.setUserName(userT.getUserName());
			userTUserTypeMDto.setEmail(userT.getEmail());
			for(UserTypeM userTypeM : userTypeMList){
				if(userT.getUserTypeId().equals(userTypeM.getUserTypeId())){
					userTUserTypeMDto.setUserTypeName(userTypeM.getUserTypeName());
					UserTUserTypeMDtoList.add(userTUserTypeMDto);
				}
			}
		}
		return UserTUserTypeMDtoList;

	}


	/**
	 * 削除処理をするメソッド。
	 *
	 */
	public void delete(UserIndexForm form){

		//ユーザー一覧テーブルの一件取得
		OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());
		UserT userT = optionalEntity.get();

		//削除
		userTBhv.delete(userT);

	}
}
