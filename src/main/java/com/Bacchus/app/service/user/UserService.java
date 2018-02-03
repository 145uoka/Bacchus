package com.Bacchus.app.service.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.AuthDto;
import com.Bacchus.app.components.EventNotifyUserDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.components.UserTypeDto;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.cbean.UserTypeMCB;
import com.Bacchus.dbflute.exbhv.AuthMBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exbhv.pmbean.EventNotifyUserPmb;
import com.Bacchus.dbflute.exentity.AuthM;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.dbflute.exentity.UserTypeM;
import com.Bacchus.dbflute.exentity.customize.EventNotifyUser;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

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

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    AuthMBhv authMBhv;

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    /**
     * ユーザ情報を全件取得。
     *
     * @return UserDtoのリスト
     */
    public List<UserDto> findAllJoinUserType() {

        UserTCB userTCb = new UserTCB();
        userTCb.setupSelect_UserTypeM();
        userTCb.setupSelect_AuthM();
        userTCb.query().queryUserTypeM().innerJoin();
        userTCb.query().queryAuthM().innerJoin();
        userTCb.query().addOrderBy_UserId_Asc();

        List<UserT> userTList = userTBhv.readList(userTCb);

        List<UserDto> userDtoList = new ArrayList<UserDto>();
        for (UserT userT : userTList) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userT, userDto);

            UserTypeDto userTypeDto = new UserTypeDto();
            BeanUtils.copyProperties(userT.getUserTypeM().get(), userTypeDto);

            userDto.setUserTypeDto(userTypeDto);

            AuthDto authDto = new AuthDto();
            BeanUtils.copyProperties(userT.getAuthM().get(), authDto);

            userDto.setAuthDto(authDto);

            userDtoList.add(userDto);
        }

        return userDtoList;
    }

    /**
     * ユーザ情報を全件取得。
     *
     * @return UserDtoのリスト
     */
    public List<EventNotifyUserDto> findAllJoinEventNotify(Integer eventNo) {

        EventNotifyUserPmb pmb = new EventNotifyUserPmb();
        pmb.setEventNo(eventNo);

        // DB - SELECT (外だしSQL - EventTBhv_selectEventIndex.sql)
        List<EventNotifyUser> eventNotifyUserEntityList = userTBhv.outsideSql().selectList(pmb);
        List<EventNotifyUserDto> resultDtoList = new ArrayList<EventNotifyUserDto>();

        for (EventNotifyUser eventNotifyUser : eventNotifyUserEntityList) {
            // EntityからDtoへ変換（EventIndex）
            EventNotifyUserDto eventNotifyUserDto = new EventNotifyUserDto();
            BeanUtils.copyProperties(eventNotifyUser, eventNotifyUserDto);

            String notifyDatetimeDisplay = DateUtil.localDateTime2String(
                    eventNotifyUser.getNotifyDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDEHHMM);

            eventNotifyUserDto.setNotifyDatetimeDisplay(notifyDatetimeDisplay);
            resultDtoList.add(eventNotifyUserDto);
        }

        return resultDtoList;
    }

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

        // 一覧表示項目をセットする
        for(UserT userT : userTList){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userT, userDto);
            resultList.add(userDto);
        }

        return resultList;
    }

    public void initUserInfo(Integer userId) {

        OptionalEntity<UserT> userT = userTBhv.selectByPK(userId);

        if (userT.isPresent() && userT != null) {
//            BeanUtils.copyProperties(userT, this.userInfo);
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

    /**
     * ユーザー削除。
     * @param userId ユーザーID
     * @throws RecordNotFoundException
     */
    public void delete(Integer userId) throws RecordNotFoundException{

        if (userId == null) {
            return;
        }

        //ユーザー一覧テーブルの一件取得
        OptionalEntity<UserT> optionalEntity = userTBhv.selectByPK(userId);
        if (optionalEntity.isPresent() && optionalEntity.get() != null) {

            UserT userT = optionalEntity.get();

            // 削除
            userTBhv.delete(userT);

            // ログ出力
            loggerService.outLog(LogMessageKeyConstants.Info.I_04_0002,
                    new Object[] { userT.getUserId(), userT.getUserName() });
        } else {
            throw new RecordNotFoundException("UserT", userId);
        }
    }

    /**
     * 権限レベル項目のプルダウン生成。
     *
     * @return 権限レベルの項目名
     */
    public List<LabelValueDto> createAuthLevelPullDown(String optionalNullText){

        List<LabelValueDto> resultList = new ArrayList<LabelValueDto>();
        LabelValueDto labelValueDto = new LabelValueDto();
        labelValueDto.setValue("");
        labelValueDto.setLabel(optionalNullText);
        resultList.add(labelValueDto);

        ListResultBean<AuthM> authMList = authMBhv.selectList(cb -> {
            cb.query().addOrderBy_AuthLevel_Asc();
        });

        for (AuthM authM :authMList) {
            labelValueDto = new LabelValueDto();
            labelValueDto.setValue(authM.getAuthLevel());
            labelValueDto.setLabel(authM.getAuthName());

            resultList.add(labelValueDto);
        }
        return resultList;
    }

    /**
     * ユーザー区分の項目名のセット。
     *
     * @param form
     * @return ユーザー区分の項目名
     */
    public List<LabelValueDto> createUserTypePullDown(){
        UserTypeMCB cb = new UserTypeMCB();
        cb.query().addOrderBy_UserTypeName_Asc();
        List<UserTypeM> userTypeMList = userTypeMBhv.readList(cb);

        List<LabelValueDto> userTypeSelectList = new ArrayList<LabelValueDto>();

        LabelValueDto labelValueDto = new LabelValueDto();
        labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
        labelValueDto.setValue(StringUtils.EMPTY);

        userTypeSelectList.add(labelValueDto);

        for(UserTypeM  userTypeM :userTypeMList){

            LabelValueDto dto = new LabelValueDto();
            dto.setLabel(userTypeM.getUserTypeName());
            dto.setValue(userTypeM.getUserTypeId().toString());
            userTypeSelectList.add(dto);

        }
        return userTypeSelectList;
    }

    /**
     * 指定した権限がマスタに存在するかを判定。
     *
     * @param authLevel 権限レベル
     * @return true:レコード存在
     */
    public boolean isExistsAuth(int authLevel) {
        int resultCount = authMBhv.selectCount(cb -> {
            cb.query().setAuthLevel_Equal(authLevel);
        });

        if (resultCount > 0) {
            return true;
        }
        return false;
    }


    /**
     * 指定したユーザ種別がマスタに存在するかを判定。
     *
     * @param userTypeId ユーザ区分ID
     * @return true:レコード存在
     */
    public boolean isExistsUserType(int userTypeId) {
        int resultCount = userTypeMBhv.selectCount(cb -> {
            cb.query().setUserTypeId_Equal(userTypeId);
        });

        if (resultCount > 0) {
            return true;
        }
        return false;
    }



//    /**
//     * 指定したメールアドレスがマスタに存在するかを判定。
//     *
//     * @param email メールアドレス
//     * @return true レコード存在
//     */
//    public boolean isExistsEmail(String email){
//        int resultCount = userTBhv.selectCount(cb -> {
//            cb.query().setEmail_Equal(email);
//        });
//
//        if (resultCount > 0) {
//            return true;
//        }
//
//    	return false;
//    }

//    /**
//     * 指定したユーザー名がマスタに存在するかを判定。
//     *
//     * @param username ユーザー名
//     * @return true レコード存在
//     */
//    public boolean isExistsUserName(String username){
//        int resultCount = userTBhv.selectCount(cb -> {
//            cb.query().setUserName_Equal(username);
//        });
//
//        if (resultCount > 0) {
//            return true;
//        }
//
//    	return false;
//    }

}
