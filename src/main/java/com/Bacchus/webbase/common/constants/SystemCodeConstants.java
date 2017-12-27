package com.Bacchus.webbase.common.constants;

public class SystemCodeConstants {

    /** エンコード */
    public static final String CHARACTER_ENCODING = "UTF-8";

    public static final String PLEASE_SELECT_MSG = "－－－選択してください－－－";
    public static final String AUXILIARY_FLG_YES = "有";
    public static final String AUXILIARY_FLG_NO = "無";

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

    /**
     * 汎用コード定数
     *
     * @author kanai_y
     */
    public static class GeneralCodeKbn {
        /** 権限レベル*/
        public static final String USER_AUTH_TYPE = "0001";
        /** 参加区分 */
        public static final String ENTRY_DIV = "0002";
        /** 経費補助有無 */
        public static final String AUXILIARY_DIV = "0003";
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
     * 参加可否区分
     */
    public static class EntryDiv {
        /** 参加 */
        public static final int ENTRY = 1;
        /** 不参加 */
        public static final int UN_ENTRY = 2;
    }

}
