package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;

/**
 * ユーザーのサービスクラス。
 *
 * @author sagawa_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

	@Autowired
	UserTBhv userTBhv;

	/**
	 * 一覧リスト取得。
	 *
	 * @return 登録ID
	 */
	public List<UserDto> selectListByIds(List<Integer> userIds) {

		//UserTの一覧取得
		UserTCB userTCb = new UserTCB();
		userTCb.query().setUserId_InScope(userIds);
		userTCb.query().addOrderBy_UserId_Asc();
		List<UserT> userTList = userTBhv.readList(userTCb);

		List<UserDto> resultList = new ArrayList<UserDto>();
		//一覧表示項目をセットする
		for(UserT userT : userTList){
			UserDto userDto = new UserDto();
			userDto.setUserId(userT.getUserId());
			userDto.setUserName(userT.getUserName());
			resultList.add(userDto);
		}
		return resultList;

	}
}
