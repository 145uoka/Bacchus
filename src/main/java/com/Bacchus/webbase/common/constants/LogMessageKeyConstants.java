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
        /** ログインしました。ユーザーID = [{0}], ユーザー名 = [{1}], Email = [{2}] */
        public static final String I_00_0001 = "I_00_0001";
        /** ユーザー情報を新規登録しました。ユーザーID = [{0}], ユーザー名 = [{1}], Email = [{2}] */
        public static final String I_01_0001 = "I_01_0001";
        /** プロフィール編集を実施しました。ユーザーID = [{0}], ユーザー名 = [{1}], Email = [{2}] */
        public static final String I_01_0301 = "I_01_0301";
        /** イベントの参加可否を登録しました。イベント管理番号 = [{0}], イベント名 = [{1}], 回答者ユーザーID = [{2}], 回答者ユーザー名 = [{3}] */
        public static final String I_03_0101 = "I_03_0101";
        /** イベント情報を{0}しました。ID = [{1}], イベント名 = [{2}] */
        public static final String I_02_0001 = "I_02_0001";
        /** 通知したイベントがまだ存在しません。ユーザーID = [{0}], ユーザー名 = [{1}] */
        public static final String I_02_0501 = "I_02_0501";
        /** ユーザーを削除しました。ID = [{0}], ユーザー名 = [{1}] */
        public static final String I_04_0002 = "I_04_0002";
        /** LINE Messaging API [{0}]を実行しました。宛先 = [{1}], メッセージ = [{2}] */
        public static final String I_05_0001 = "I_05_0001";
        /** LINE Messaging API [{0}]実行結果。Message = [{1}], Details = [{2}] */
        public static final String I_05_0002 = "I_05_0002";
    }

    /**
     * WARNログのメッセージID。
     */
    public static class Warn {
        /** LINEユーザではないため、LINE Messaging API [{0}]を実行できませんでした。宛先 = [{1}], メッセージ = [{2}] */
        public static final String W_05_0001 = "W_05_0001";
        /** 存在しないユーザに、LINE Messaging API [{0}]が実行されました。宛先 = [{1}], メッセージ = [{2}] */
        public static final String W_05_0002 = "W_05_0002";
    }

    /**
     * ERRORログのメッセージID。
     */
    public static class Error {
        /** LINE IDに対応するユーザー情報が存在しません。LINE ID = [{0}] */
        public static final String E_00_0001 = "E_00_0001";
    }

}
