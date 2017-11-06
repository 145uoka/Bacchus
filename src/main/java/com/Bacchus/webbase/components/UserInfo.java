package com.Bacchus.webbase.components;

import java.io.Serializable;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * ログインUser情報。
 *
 * @author ishigouoka_k
 * $Id: UserInfo.java 130 2017-06-27 09:22:10Z ishigouoka_k@glue-si.com $
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean logined = false;

	private int userId;

	private String email;

    private int authLevel;

    private String userName;

    private boolean adminFlg = false;

    private boolean generalFlg = false;

    private Set<SystemCodeConstants.Permissions> permissions;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isLogined() {
        return logined;
    }

    public void setLogined(boolean logined) {
        this.logined = logined;
    }


    /**
     * emailを取得。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * emailを設定。
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(int authLevel) {
        this.authLevel = authLevel;
    }



    /**
     * accountFullNameを取得。
     * @return accountFullName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * accountFullNameを設定。
     * @param accountFullName accountFullName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<SystemCodeConstants.Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<SystemCodeConstants.Permissions> permissions) {
        this.permissions = permissions;
    }

    /**
     * adminFlgを取得。
     * @return adminFlg
     */
    public boolean isAdminFlg() {
        return adminFlg;
    }

    /**
     * adminFlgを設定。
     * @param adminFlg adminFlg
     */
    public void setAdminFlg(boolean adminFlg) {
        this.adminFlg = adminFlg;
    }

    /**
     * generalFlgを取得。
     * @return generalFlg
     */
    public boolean isGeneralFlg() {
        return generalFlg;
    }

    /**
     * generalFlgを設定。
     * @param generalFlg generalFlg
     */
    public void setGeneralFlg(boolean generalFlg) {
        this.generalFlg = generalFlg;
    }


}
