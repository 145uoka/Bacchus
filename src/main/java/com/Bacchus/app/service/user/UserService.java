package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.service.AbstractService;
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
public class UserService extends AbstractService {

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

	public void initUserInfo(Integer userId) {

	    OptionalEntity<UserT> userT = userTBhv.selectByPK(userId);

	    if (userT.isPresent() && userT != null) {
	        this.userInfo.setAuthLevel(userT.get().getAuthLevel());
	        this.userInfo.setEmail(userT.get().getEmail());
	        this.userInfo.setFirstName(userT.get().getFirstName());
	        this.userInfo.setLastName(userT.get().getLastName());
	        this.userInfo.setLineFlg(userT.get().getLineFlg());
	        this.userInfo.setLineId(userT.get().getLineId());
	        this.userInfo.setLineUserName(userT.get().getLineUserName());
	        this.userInfo.setLoginId(userT.get().getLoginId());
	        this.userInfo.setPassword(userT.get().getPassword());
	        this.userInfo.setUserId(userT.get().getUserId());
	        this.userInfo.setUserName(userT.get().getUserName());
	        this.userInfo.setUserTypeId(userT.get().getUserTypeId());
	    }
	}
}
