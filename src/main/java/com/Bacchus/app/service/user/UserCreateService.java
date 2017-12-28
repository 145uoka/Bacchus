package com.Bacchus.app.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.service.CommonService;
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
public class UserCreateService{

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    CommonService commonService;

    /**
     * 新規登録。
     *
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public UserDto register(UserDto userDto) {

        // 登録データの生成
        UserT userT = new UserT();
        userDto.setUserId(userTBhv.selectNextVal());
        userT.setUserId(userDto.getUserId());
        userT.setUserName(userDto.getUserName());
        userT.setFirstName(userDto.getFirstName());
        userT.setLastName(userDto.getLastName());
        userT.setAuthLevel(userDto.getAuthLevel());
        userT.setUserTypeId(userDto.getUserTypeId());
        userT.setEmail(userDto.getEmail());
        String encPassword = EncryptUtil.saltHash(userDto.getPassword(), EncryptUtil.EncryptType.MD5);
        userT.setPassword(encPassword);

        // 登録
        userTBhv.insert(userT);

        return userDto;

    }
}
