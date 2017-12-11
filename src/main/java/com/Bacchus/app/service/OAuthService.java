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
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;

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
        cb.query().setLineId_Equal(idToken.sub);
        List<UserT> userTList = userTBhv.readList(cb);

        UserT userT = new UserT();

        if (CollectionUtils.isEmpty(userTList)) {
            userT.setUserId(userTBhv.selectNextVal());
            userT.setUserTypeId(1);
            userT.setAuthLevel(2);
            userT.setLineFlg(Flag.ON.getIntegerValue().intValue());
            userT.setLineId(idToken.sub);
            userT.setUserName(idToken.name);
            userTBhv.insert(userT);
        } else {
            userT = userTList.get(0);
        }

        return userT;
    }

}
