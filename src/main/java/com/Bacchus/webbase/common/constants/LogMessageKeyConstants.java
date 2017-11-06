package com.Bacchus.webbase.common.constants;

/**
 * メッセージKeyの定数クラス
 *
 * @author ishigouoka_k
 * $Id$
 */
public class LogMessageKeyConstants {

    /**
     * INFOログのメッセージID。
     */
    public static class Info {
        /** ログインしました。ユーザーID=[{0}], 名前 = [{1}], Email = [{2}] */
        public static final String I_00_0001 = "I_00_0001";
        /** プロフィール編集を実施しました。ユーザーID=[{0}], 名前=[{1}], Email=[{2}] */
        public static final String I_01_0001 = "I_01_0001";
        /** ユーザー情報を新規登録しました。ユーザーID=[{0}], 名前=[{1}], Email=[{2}] */
        public static final String I_02_0001 = "I_02_0001";
    }

    /**
     * WARNログのメッセージID。
     */
    public static class Warn {
    }

    /**
     * ERRORログのメッセージID。
     */
    public static class Error {
    }

}
