package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.form.user.UserCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.dbflute.cbean.UserTypeMCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.dbflute.exentity.UserTypeM;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * 雇用契約設定のサービスクラス。
 *
 * @author majo_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCreateService{

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	UserTypeMBhv userTypeMBhv;

	 @Autowired
	 CommonService commonService;

	/**
	 * 新規登録。
	 *
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void register(UserCreateForm form) {

		// 登録データの生成
		UserT userT = new UserT();
		userT.setUserName(form.getUserName());
		userT.setFirstName(form.getFirstName());
		userT.setLastName(form.getLastName());
		userT.setAuthLevel(Integer.parseInt(form.getAuthLevel()));
		userT.setUserTypeId(Integer.parseInt(form.getUserTypeId()));
		userT.setEmail(form.getEmail());
		  String encPassword = EncryptUtil.saltHash(form.getPassword(), EncryptUtil.EncryptType.MD5);
		userT.setPassword(encPassword);

		// 登録
		userTBhv.insert(userT);

	}

	/**
	 * 権限レベル項目のセット。
	 *
	 * @return 権限レベルの項目名
	 */
	public List<LabelValueDto> authLevelPullDown(){
	 List<LabelValueDto> entrySelectList =
             commonService.creatOptionalLabelValueList(
                     SystemCodeConstants.GeneralCodeKbn.USER_AUTH_TYPE,
                     SystemCodeConstants.PLEASE_SELECT_MSG);
     return entrySelectList;

	}

	/**
	 * ユーザー区分の項目名のセット。
	 *
	 * @param form
	 * @return ユーザー区分の項目名
	 */
	public List<LabelValueDto> userTypePullDown(){
	  UserTypeMCB cb = new UserTypeMCB();
      cb.query().addOrderBy_UserTypeName_Asc();
      List<UserTypeM> userTypeMList = userTypeMBhv.readList(cb);

      List<LabelValueDto> userTypeSelectList = new ArrayList<LabelValueDto>();

  	   LabelValueDto labelValueDto = new LabelValueDto();
  	   labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
  	   labelValueDto.setValue("");

  	   userTypeSelectList.add(labelValueDto);

     for(UserTypeM  userTypeM :userTypeMList){

  	   LabelValueDto dto = new LabelValueDto();
  	   dto.setLabel(userTypeM.getUserTypeName());
  	   dto.setValue(userTypeM.getUserTypeId().toString());
  	   userTypeSelectList.add(dto);

     }
     return userTypeSelectList;

}
}
