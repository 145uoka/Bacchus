package com.Bacchus.app.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.AbnormalRecordsDetection;
import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.IdToken;
import com.Bacchus.app.util.CommonUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.SystemPropertyMBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.SystemPropertyM;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Permissions;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;

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

    @Autowired
    SystemPropertyMBhv systemPropertyMBhv;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    public String creatAauthorizeUrl() throws RecordNotFoundException, UnsupportedEncodingException {

        ListResultBean<SystemPropertyM> systemPropertyMList = systemPropertyMBhv.selectList(cb->{
            cb.query().setPropGroup_Equal(SystemPropertyKeyConstants.Group.LINE);
        });

        StringBuilder sb = new StringBuilder();
        sb.append(systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.AUTHORIZE_URL));

        sb.append("?response_type=");
        sb.append(CommonUtil.urlEncode(systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.RESPONSE_TYPE)));

        sb.append("&client_id=");
        sb.append(CommonUtil.urlEncode(systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.CLIENT_ID)));

        sb.append("&state=");
        sb.append(CommonUtil.urlEncode(systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.STATE)));

        sb.append("&scope=");
        sb.append(CommonUtil.urlEncode(systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.SCOPE)));

        return sb.toString();
    }

    public List<NameValuePair> getAccessTokenParam(String code) throws RecordNotFoundException {

        ListResultBean<SystemPropertyM> systemPropertyMList = systemPropertyMBhv.selectList(cb->{
            cb.query().setPropGroup_Equal(SystemPropertyKeyConstants.Group.LINE);
        });

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("grant_type", systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.GRANT_TYPE)));
        params.add(new BasicNameValuePair("grant_type", code));
        params.add(new BasicNameValuePair("redirect_uri", systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.REDIRECT_URI)));
        params.add(new BasicNameValuePair("client_id", systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.CLIENT_ID)));
        params.add(new BasicNameValuePair("client_secret", systemPropertyService.getSystemPropertyValue(
                systemPropertyMList, SystemPropertyKeyConstants.CLIENT_SECRET)));

        return params;
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public UserT loginByLine(IdToken idToken) throws AbnormalRecordsDetection{

        UserTCB cb = new UserTCB();
        cb.query().setLineId_Equal(idToken.sub);
        List<UserT> userTList = userTBhv.readList(cb);

        UserT userT = new UserT();

        if (CollectionUtils.isEmpty(userTList)) {
            Integer userId = userTBhv.selectNextVal();
            userT.setUserId(userId);
            userT.setUserTypeId(1);
            userT.setAuthLevel(Permissions.GENERAL.getAuthType());
            userT.setLineFlg(Flag.ON.getIntegerValue().intValue());
            userT.setLineId(idToken.sub);
            userT.setLineUserName(idToken.name);
            userTBhv.insert(userT);
        } else {
            userT = userTList.get(0);
        }

        return userT;
    }

}
