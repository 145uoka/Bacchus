package com.Bacchus.webbase.common.constants;

public class SystemCodeConstants {

    /** エンコード */
    public static final String CHARACTER_ENCODING = "UTF-8";

    public static final String PLEASE_SELECT_MSG = "－－－選択してください－－－";

    public static final String HIERARCHY_ROOT_SEPARATE_CHARACTER = "HIERARCHY_ROOT_SEPARATE_CHARACTER";

    public static class PATTERN {
        public static final String NUMERIC = "0-9";
        public static final String ALPHABET_LOWERCASE = "a-z";
        public static final String ALPHABET_UPPERCASE = "A-Z";
    }    /**
     * 有効終了日が設定されていない場合の定数
     */
    public static class EffectiveEndDateCode {
        public static final String EFFECTIVE_END_DATE = "-";
    }

    /**
     * リビジョン追加用の定数
     * @author kanai_y
     *
     */
    public static class RevNo {
        public static final int ADD_REV_NO = 1;
    }

    /** jqGrid表レイアウト項目定数 */
    public static class JQ_GRID_DEFFINE {
        /** 社員一覧 */
        public static final int EMP_LIST = 1;
        /** 社員選択 */
        public static final int EMP_SEARCH_LIST = 2;
        /** 社員情報検索 */
        public static final int EMP_INFO_LIST = 3;
    }

    public static class OAuthResultCode {
        public static final int SUCCESS = 0;
        public static final int ERROR = 0;
    }

    public static class OAuthResultErrorCode {
        public static final String INVALID_PARAM = "E0001";
        public static final String INVALID_ACCESS_TOKEN = "E0101";
        public static final String INVALID_REDIRECT_URI = "E0102";
        public static final String UNKOWN_AUTH = "E0103";
        public static final String FAILURE_OAUTH = "E0201";
        public static final String INVALID_STATE = "E0202";
        public static final String INVALID_DOMAIN = "E0203";
        public static final String SYSTEM_ERROR = "E9901";
    }

    /**
     * フラグ関連定数。
     */
    public enum Flag {
        ON("1", 1, true),
        OFF("0", 0, false);

        final String stringValue;
        final Integer integerValue;
        final boolean boolValue;
        private Flag(String stringValue, Integer integerValue, boolean boolValue) {
            this.stringValue = stringValue;
            this.integerValue = integerValue;
            this.boolValue = boolValue;
        }

        public static Flag getFlagByIntegerValue(Integer integerValue){

            for(Flag flag : Flag.values()) {
                if (flag.getIntegerValue().compareTo(integerValue) == 0) {
                    return flag;
                }
            }

            return OFF;
        }

        /**
         * stringValueを取得。
         * @return stringValue
         */
        public String getStringValue() {
            return stringValue;
        }
        /**
         * integerValueを取得。
         * @return integerValue
         */
        public Integer getIntegerValue() {
            return integerValue;
        }
        /**
         * boolValueを取得。
         * @return boolValue
         */
        public boolean isBoolValue() {
            return boolValue;
        }
    }

    /**
     * メッセージタイプ。
     */
    public static class MessageType {
        /** 成功 */
        public static final String SUCCESS = "successMessages";
        /** 通知 */
        public static final String INFO = "infoMessages";
        /** 警告 */
        public static final String WARN = "warnMessages";
        /** エラー */
        public static final String ERROR = "errorMessages";
    }

    public enum Permissions {
        GENERAL(0, "一般ユーザ"),
        MANAGER(1, "運用管理者"),
        ADMIN(2, "システム管理者");

        final int authLevel;
        final String authName;

        private Permissions(int authLevel, String authName) {
            this.authLevel = authLevel;
            this.authName = authName;
        }

        /**
         * authLevelを取得。
         * @return authLevel
         */
        public int getAuthType() {
            return authLevel;
        }

        /**
         * authNameを取得。
         * @return authName
         */
        public String getAuthName() {
            return authName;
        }

        public static Permissions getPermissions(int authLevel){

            for(Permissions permissions: Permissions.values()) {
                if(authLevel == permissions.getAuthType()) {
                    return permissions;
                }
            }

            return null;
        }
    }

    public enum EmploymentStatus {

        PRESENCE("01", "在籍"),
        RETIRE("02", "退職"),
        LEAVE("03", "休職");

        // [汎用コード_M]コード区分
        public final String codeKbn = "0001";

        final String code;
        final String name;

        private EmploymentStatus(String code, String name) {
            this.code = code;
            this.name = name;
        }

        /**
         * codeを取得。
         * @return code
         */
        public String getCode() {
            return code;
        }

        /**
         * nameを取得。
         * @return name
         */
        public String getName() {
            return name;
        }
    }

    /**
     * 汎用コード定数
     *
     * @author kanai_y
     */
    public static class GeneralCodeKbn {
        /** 在籍状況コード */
        public static final String EMPLOYEE_STATUS = "0001";
        /** 所属地域コード */
        public static final String AREA_CODE = "0002";
        /** 職種コード */
        public static final String OCCUPATION_CODE = "0003";
        /** 性別コード */
        public static final String SEX_CODE = "0004";
        /** 血液型コード */
        public static final String BLOOD_TYPE_CODE = "0005";
        /** 婚姻区分コード */
        public static final String MARITAL_STATUS_CODE = "0006";
        /** 居住区分コード */
        public static final String RESIDENCE_CODE = "0007";
        /** 処理状態区分コード */
        public static final String PROC_STATUS_CODE = "0008";
        /** 社章コード */
        public static final String COMPANY_BADGE_CODE = "0009";
        /** PJカード権限コード */
        public static final String PROJECT_CARD_AUTH_CODE = "0010";
        /** 貸出・提出ステータスコード */
        public static final String YSE_NO_STATUS_CODE = "0011";
        /** セキュリティカード枚数コード */
        public static final String SECURITY_CARD_CODE = "0012";
        /** 役割コード */
        public static final String ROLL_CODE = "0013";
        /** 休職コード */
        public static final String LEAVE_CODE = "0014";
    }

    /**
     * URI定数
     *
     * @author kamimura_y
     *
     */
    public static class UriString {
        /** api以下のURI */
        public static final String API = "/api/.*";
    }

    /**
     * 職位コード。
     */
    public static class JobCode {
        /** 一般 */
        public static final String GENERAL = "600";
    }
}
