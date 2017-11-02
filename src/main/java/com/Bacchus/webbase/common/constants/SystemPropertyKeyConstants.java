package com.Bacchus.webbase.common.constants;

/**
 * システムプロパティのKeyの定数クラス
 *
 * @author ishigouoka_k
 * $Id: SystemPropertyKeyConstants.java 564 2017-08-03 02:54:19Z kanai_y@glue-si.com $
 */
public class SystemPropertyKeyConstants {

    /**
     * OAAパラメータ関連。
     */
    public static class OAuthAgency {
        /** prefix */
        public static final String PREFIX = "OAA_REQ_";
        /** アクセストークン */
        public static final String OAA_REQ_ACCESS_TOKEN = "OAA_REQ_ACCESS_TOKEN";
        /** システムID */
        public static final String OAA_REQ_SYSTEM_ID = "OAA_REQ_SYSTEM_ID";
        /** リダイレクト先 */
        public static final String OAA_REQ_REDIRECT_URI = "OAA_REQ_REDIRECT_URI";
        /** リクエスト先 */
        public static final String OAA_REQ_REQUERST_URI = "OAA_REQ_REQUERST_URI";
        /** 区切り文字「,」 */
        public static final String PROJECT_CARD_DETAIL_SEPARATE_CHARACTER = "PROJECT_CARD_DETAIL_SEPARATE_CHARACTER";
        /** 区切り文字「>」 */
        public static final String HIERARCHY_ROOT_SEPARATE_CHARACTER = "HIERARCHY_ROOT_SEPARATE_CHARACTER";
        /** 未設定表示 */
        public static final String EMPLOYEE_NOT_SETTING = "EMPLOYEE_NOT_SETTING";
    }

    /** 社員情報登録API利用可能システム識別子前方 */
    public static final String EMP_REGISTER_API_AVAILABLE_IDENTIFIER_PREFIX = "EMP_REGISTER_API_AVAILABLE_IDENTIFIER_";
    /** 社員情報削除API利用可能システム識別子前方 */
    public static final String EMP_DELETE_API_AVAILABLE_IDENTIFIER_PREFIX = "EMP_DELETE_API_AVAILABLE_IDENTIFIER_";
    /** 社員情報更新API利用可能システム識別子前方 */
    public static final String EMP_UPDATE_API_AVAILABLE_IDENTIFIER_PREFIX = "EMP_UPDATE_API_AVAILABLE_IDENTIFIER_";
    /** 社員情報検索API利用可能システム識別子前方 */
    public static final String EMP_SEARCH_API_AVAILABLE_IDENTIFIER_PREFIX = "EMP_SEARCH_API_AVAILABLE_IDENTIFIER_";

}
