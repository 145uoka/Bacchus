package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.user.UserEditingForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.dbflute.cbean.UserTypeMCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.dbflute.exentity.UserTypeM;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * ユーザー一覧のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
public class UserEditingService {

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	UserTypeMBhv userTypeMBhv;

	@Autowired
	CommonService commonService;

	/**
	 * 権限レベル項目のセット。
	 *
	 * @return 権限レベルの項目名
	 */
	public List<LabelValueDto> authLevelPullDown() {
		List<LabelValueDto> entrySelectList = commonService.creatOptionalLabelValueList(
				SystemCodeConstants.GeneralCodeKbn.USER_AUTH_TYPE, SystemCodeConstants.PLEASE_SELECT_MSG);
		return entrySelectList;

	}

	/**
	 * ユーザー区分の項目名のセット。
	 *
	 * @return ユーザー区分の項目名
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<LabelValueDto> userTypePullDown() {

		// UserTのデータ取得
		UserTypeMCB cb = new UserTypeMCB();
		cb.query().addOrderBy_UserTypeId_Asc();
		List<UserTypeM> userTypeMList = userTypeMBhv.readList(cb);

		List<LabelValueDto> userTypeSelectList = new ArrayList<LabelValueDto>();

		LabelValueDto labelValueDto = new LabelValueDto();
		labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
		labelValueDto.setValue("");

		userTypeSelectList.add(labelValueDto);

		for (UserTypeM userTypeM : userTypeMList) {

			LabelValueDto dto = new LabelValueDto();
			dto.setLabel(userTypeM.getUserTypeName());
			dto.setValue(userTypeM.getUserTypeId().toString());
			userTypeSelectList.add(dto);

		}
		return userTypeSelectList;

	}

	/**
	 * ユーザー区分の項目名のセット。
	 *
	 * @param form
	 * @return ユーザー区分の項目名
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UserDto selectUser(UserEditingForm form) {
		OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());

		// 取得結果がnullの場合
		if (optionalEntity == null || optionalEntity.isPresent()) {

		}

		UserT userT = optionalEntity.get();

		// 初期表示画面の項目をセット
		UserDto userTDto = new UserDto();
		userTDto.setUserId(userT.getUserId());
		userTDto.setUserName(userT.getUserName());
		userTDto.setFirstName(userT.getFirstName());
		userTDto.setLastName(userT.getLastName());
		userTDto.setAuthLevel(userT.getAuthLevel());
		userTDto.setUserTypeId(userT.getUserTypeId());
		userTDto.setEmail(userT.getEmail());

		return userTDto;

	}

	/**
	 * ユーザー情報の更新。
	 *
	 * @param form
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void update(UserEditingForm form) {
		OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());

		if (optionalEntity == null || optionalEntity.isPresent()) {

		}

		UserT userT = optionalEntity.get();

		// 更新データのセット
		userT.setUserId(form.getUserId());
		userT.setUserName(form.getUserName());
		userT.setFirstName(form.getFirstName());
		userT.setLastName(form.getLastName());
		userT.setAuthLevel(form.getAuthLevel());
		userT.setUserTypeId(form.getUserTypeId());
		userT.setEmail(form.getEmail());
		String encPassword = EncryptUtil.saltHash(form.getPassword(), EncryptUtil.EncryptType.MD5);
		userT.setPassword(encPassword);

		// 更新
		userTBhv.update(userT);

	}

	/**
	 * ユーザー情報の更新のユニークチェック項目の取得。
	 *
	 * @param form
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UserT validation(UserEditingForm form) {

		OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());

		if (optionalEntity == null || optionalEntity.isPresent()) {

		}

		UserT userT = optionalEntity.get();

		return userT;

	}

}
