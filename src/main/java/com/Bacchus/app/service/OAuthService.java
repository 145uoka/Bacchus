package com.Bacchus.app.service;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.AbnormalRecordsDetection;
import com.Bacchus.app.components.IdToken;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;

/**
 * 共通サービスクラス。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OAuthService {

    @Autowired
    UserTBhv userTBhv;


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public UserT loginByLine(IdToken idToken) throws AbnormalRecordsDetection{

        UserTCB cb = new UserTCB();
        cb.query().setUserName_Equal(idToken.sub);
        List<UserT> userTList = userTBhv.readList(cb);

        UserT userT = new UserT();

        if (CollectionUtils.isEmpty(userTList)) {
            userT.setUserId(userTBhv.selectNextVal());
            userT.setUserName(idToken.sub);
            userT.setPassword(idToken.sub);
            userT.setUserTypeId(1);
            userT.setAuthLevel(1);
            userTBhv.insert(userT);
            System.out.println("create user!!! : "+ userT.getUserId() + " : " + userT.getUserName());
        } else {
            userT = userTList.get(0);
        }

        return userT;
    }

}
