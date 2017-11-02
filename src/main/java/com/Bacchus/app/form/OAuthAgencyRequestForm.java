package  com.Bacchus.app.form;

import java.io.Serializable;

/**
 * GoogleOAuth代理認証要求Form。
 *
 * @author ishigouoka_k
 * $Id: OAuthAgencyRequestForm.java 69 2017-06-13 09:29:15Z ishigouoka_k@glue-si.com $
 */
public class OAuthAgencyRequestForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** アクセストークン */
    private String accessToken;

    /** 認証トークン */
    private String authToken;

    /** システムID */
    private String systemId;

    /** リダイレクトURI */
    private String redirectUri;

    /**
     * アクセストークンの取得。
     *
     * @return アクセストークン
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * アクセストークンを設定。
     *
     * @param accessToken アクセストークン
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 認証トークンの取得。
     *
     * @return 認証トークン
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * 認証トークンを設定。
     *
     * @param authToken 認証トークン
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * システムIDの取得。
     *
     * @return システムID
     */
    public String getSystemId() {
        return this.systemId;
    }

    /**
     * システムIDを設定。
     *
     * @param systemId システムID
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * リダイレクトURIの取得。
     *
     * @return リダイレクトURI
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * リダイレクトURIを設定。
     *
     * @param redirectUri リダイレクトURI
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

}
