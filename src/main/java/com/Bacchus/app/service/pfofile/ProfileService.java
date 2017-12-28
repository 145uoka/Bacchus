package com.Bacchus.app.service.pfofile;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.form.profile.ProfileEditForm;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;

/**
 * プロフィール編集のサービスクラス。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProfileService extends AbstractService {

    @Autowired
    UserTBhv userTBhv;

    public void updateProfile(ProfileEditForm profileEditForm) {

        UserT userT = new UserT();

        userT.setUserId(userInfo.getUserId());

        if (StringUtils.isNotBlank(profileEditForm.getFirstName())) {
            userT.setFirstName(profileEditForm.getFirstName());
            userInfo.setFirstName(profileEditForm.getFirstName());
        }
        if (StringUtils.isNotBlank(profileEditForm.getLastName())) {
            userT.setLastName(profileEditForm.getLastName());
            userInfo.setLastName(profileEditForm.getLastName());
        }
        if (StringUtils.isNotBlank(profileEditForm.getLoginId())) {
            userT.setLoginId(profileEditForm.getLoginId());
            userInfo.setLoginId(profileEditForm.getLoginId());
        }
        if (StringUtils.isNotBlank(profileEditForm.getUserName())) {
            userT.setUserName(profileEditForm.getUserName());
            userInfo.setUserName(profileEditForm.getUserName());
        }
        if (StringUtils.isNotBlank(profileEditForm.getEmail())) {
            userT.setEmail(profileEditForm.getEmail());
            userInfo.setEmail(profileEditForm.getEmail());
        }
        if (StringUtils.isNotBlank(profileEditForm.getPassword())) {
            String encPassword =
                    EncryptUtil.saltHash(profileEditForm.getNewPassword(), EncryptUtil.EncryptType.MD5);
            userT.setPassword(encPassword);
        }

        userTBhv.update(userT);

        return;
    }

}
