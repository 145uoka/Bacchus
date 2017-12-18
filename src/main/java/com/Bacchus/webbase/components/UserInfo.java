package  com.Bacchus.webbase.components;

import java.io.Serializable;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * ログインユーザ情報。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserInfo extends UserDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ログイン状態（true:ログイン中, false:未ログイン) */
    private boolean logined;

    /** Lineユーザフラグ（true:Lineユーザ, false:非Lineユーザ） */
    private boolean lineUserFlg;

    /** true:システム管理者 */
    private boolean adminFlg;

    /** true:一般ユーザ */
    private boolean generalFlg;

    /** 権限情報 */
    private Set<SystemCodeConstants.Permissions> permissions;

    /**
     * ログイン状態（true:ログイン中, false:未ログイン)の取得。
     *
     * @return ログイン状態（true:ログイン中, false:未ログイン)
     */
    public boolean isLogined() {
        return this.logined;
    }

    /**
     * ログイン状態（true:ログイン中, false:未ログイン)を設定。
     *
     * @param logined ログイン状態（true:ログイン中, false:未ログイン)
     */
    public void setLogined(boolean logined) {
        this.logined = logined;
    }

    /**
     * Lineユーザフラグ（true:Lineユーザ, false:非Lineユーザ）の取得。
     *
     * @return Lineユーザフラグ（true:Lineユーザ, false:非Lineユーザ）
     */
    public boolean isLineUserFlg() {
        return this.lineUserFlg;
    }

    /**
     * Lineユーザフラグ（true:Lineユーザ, false:非Lineユーザ）を設定。
     *
     * @param lineUserFlg Lineユーザフラグ（true:Lineユーザ, false:非Lineユーザ）
     */
    public void setLineUserFlg(boolean lineUserFlg) {
        this.lineUserFlg = lineUserFlg;
    }

    /**
     * true:システム管理者の取得。
     *
     * @return true:システム管理者
     */
    public boolean isAdminFlg() {
        return this.adminFlg;
    }

    /**
     * true:システム管理者を設定。
     *
     * @param adminFlg true:システム管理者
     */
    public void setAdminFlg(boolean adminFlg) {
        this.adminFlg = adminFlg;
    }

    /**
     * true:一般ユーザの取得。
     *
     * @return true:一般ユーザ
     */
    public boolean isGeneralFlg() {
        return this.generalFlg;
    }

    /**
     * true:一般ユーザを設定。
     *
     * @param generalFlg true:一般ユーザ
     */
    public void setGeneralFlg(boolean generalFlg) {
        this.generalFlg = generalFlg;
    }

    /**
     * 権限情報の取得。
     *
     * @return 権限情報
     */
    public Set<SystemCodeConstants.Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * 権限情報を設定。
     *
     * @param permissions 権限情報
     */
    public void setPermissions(Set<SystemCodeConstants.Permissions> permissions) {
        this.permissions = permissions;
    }

}
