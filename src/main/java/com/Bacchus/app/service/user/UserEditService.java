package com.Bacchus.app.service.user;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.user.UserEditForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;

/**
 * ユーザー一覧のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
public class UserEditService {

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    CommonService commonService;

    /**
     * ユーザー区分の項目名のセット。
     *
     * @param form
     * @return ユーザー区分の項目名
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public UserDto selectUser(UserEditForm form) {
        OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());

        // 取得結果がnullの場合
        if (optionalEntity == null || optionalEntity.isPresent()) {

        }

        UserT userT = optionalEntity.get();

        // 初期表示画面の項目をセット
        UserDto userTDto = new UserDto();
        userTDto.setUserId(userT.getUserId());
//        userTDto.setUserName(userT.getUserName());
        userTDto.setFirstName(userT.getFirstName());
        userTDto.setLastName(userT.getLastName());
        userTDto.setLoginId(userT.getLoginId());
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
    public void update(UserDto userDto) {
        OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(userDto.getUserId());

        if (optionalEntity == null || optionalEntity.isPresent()) {

        }

        UserT userT = optionalEntity.get();

        // 更新データのセット
        userT.setUserId(userDto.getUserId());
//        userT.setUserName(userDto.getUserName());
        userT.setFirstName(userDto.getFirstName());
        userT.setLastName(userDto.getLastName());
        userT.setAuthLevel(userDto.getAuthLevel());
        userT.setUserTypeId(userDto.getUserTypeId());
//        userT.setEmail(userDto.getEmail());
        String encPassword = EncryptUtil.saltHash(userDto.getPassword(), EncryptUtil.EncryptType.MD5);
        userT.setPassword(encPassword);

        // 更新
        userTBhv.update(userT);

    }

    /**
     * ユーザー情報の更新のユニークチェック項目の取得。
     *
     * @param form
     * @return
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public UserT validation(UserEditForm form) {

        OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(form.getUserId());

        if (optionalEntity == null || optionalEntity.isPresent()) {

        }

        UserT userT = optionalEntity.get();

        return userT;

    }

}
