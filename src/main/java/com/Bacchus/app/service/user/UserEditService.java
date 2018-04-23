/*
* 全著作権を、株式会社GSIが所有します。
* 日本の法律では、著作権は創作の時点で自動的に発生しています。
*
* ソフトウェアは、株式会社GSIによって提供されます。
* ソフトウェアは現存するままの状態で、明示であるか暗黙であるかを問わず
* 何らの保証もなく提供されます。
* ここでいう保証とは、商品性、特定の目的への適合性、および権利非侵害に
* ついての保証も含みますが、それに限定されるものではありません。
* 著者または著作権者は、いかなる主張（このソフトウェアまたはその派生物を
* 使うか、修正するか、配布することの結果として被認可者が受ける損害賠償）
* に対しても責任を負わないものとします。
*/
package com.Bacchus.app.service.user;

//import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.StringUtils;
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
        if(StringUtils.isNotEmpty(userDto.getLoginId())){
        	userT.setLoginId(userDto.getLoginId());
        }

        if(StringUtils.isNotEmpty(userDto.getPassword())){
        	String encPassword = EncryptUtil.saltHash(userDto.getPassword(), EncryptUtil.EncryptType.MD5);
        	userT.setPassword(encPassword);
        }

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
