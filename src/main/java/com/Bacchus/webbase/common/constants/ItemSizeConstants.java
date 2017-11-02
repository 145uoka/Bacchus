package com.Bacchus.webbase.common.constants;

/**
 * 各項目の最大桁数、最小桁数を定義した定数クラス。
 *
 * @author ishigouoka_k $Id: ItemSizeConstants.java 149 2017-05-25 10:35:24Z
 *         kamimura_k@glue-si.com $
 */
public class ItemSizeConstants {

    private ItemSizeConstants() {
    };

    /**
     * keyから最大桁数を取得。
     *
     * @param key キー
     * @return 最大桁数
     */
    public static int getMaxLen(String key) {

        MaxLen maxLen = MaxLen.getMaxLen(key);

        if (maxLen == null) {
            return 0;
        }

        return maxLen.getValue();
    }

    /**
     * keyから固定桁数を取得。
     *
     * @param key キー
     * @return 最大桁数
     */
    public static int getFixedLen(String key) {

        FixedLen fixedLen = FixedLen.getFixedLen(key);

        if (fixedLen == null) {
            return 0;
        }

        return fixedLen.getValue();
    }

    /**
     * 最大桁数。 定数名：項目リファレンスのIDについて、アルファベットと数字をアンダーバーで分割。<br>
     * （例）ACC0001の場合：ACC_0001
     */
    public static class MaxSize {

        /** 共通_社員番号 */
        public static final int CMN_0004 = 4;
        /** 共通_メールアドレス */
        public static final int CMN_0007 = 50;
        /** 共通_電話番号1 */
        public static final int CMN_0010 = 4;
        /** 共通_電話番号2 */
        public static final int CMN_0011 = 4;
        /** 共通_電話番号3 */
        public static final int CMN_0012 = 4;

        /** 勤務地マスタ関連_勤務地コード */
        public static final int LOC_0001 = 10;
        /** 勤務地マスタ関連_勤務地名称 */
        public static final int LOC_0002 = 15;
        /** 勤務地マスタ関連_勤務地略称 */
        public static final int LOC_0003 = 6;
        /** 勤務地マスタ関連_勤務地名称(ｶﾅ) */
        public static final int LOC_0004 = 15;
        /** 勤務地マスタ関連_勤務地市区町村 */
        public static final int LOC_0005 = 50;
        /** 勤務地マスタ関連_勤務地番地 */
        public static final int LOC_0006 = 15;
        /** 勤務地マスタ関連_勤務地建物情報 */
        public static final int LOC_0007 = 50;
        /** 社員一覧：携帯電話番号 */
        public static final int PUB_0002 = 50;
        /** 社員一覧：携帯メールアドレス */
        public static final int PUB_0003 = 256;
        /** 社員一覧：住所 */
        public static final int PUB_0004 = 100;
        /** 社員一覧：備考 */
        public static final int PUB_0005 = 100;
        /** 職位マスタ関連＿職位コード */
        public static final int JOB_0001 = 10;
        /** 職位マスタ関連＿職位名称 */
        public static final int JOB_0002 = 30;
        /** 職位マスタ関連＿職位略称 */
        public static final int JOB_0003 = 6;
        /** 職位マスタ関連＿職位ランク */
        public static final int JOB_0004 = 2;
        /** 雇用契約マスタ関連_雇用契約コード */
        public static final int CNT_0001 = 10;
        /** 雇用契約マスタ関連_雇用契約名称 */
        public static final int CNT_0002 = 15;
        /** 雇用契約マスタ関連_雇用契約略称 */
        public static final int CNT_0003 = 6;
        /** 所属マスタ関連_所属コード */
        public static final int DEP_0001 = 10;
        /** 所属マスタ関連_所属名称 */
        public static final int DEP_0002 = 40;
        /** 所属マスタ関連_所属略称 */
        public static final int DEP_0003 = 6;
        /** 社員基本情報関連_適性検査点数 */
        public static final int BAS_0001 = 5;
        /** 社員基本情報関連_退職理由 */
        public static final int BAS_0002 = 100;
        /** 社員基本情報関連_退職理由詳細 */
        public static final int BAS_0003 = 250;
        /** 社員基本情報関連_備考 */
        public static final int BAS_0004 = 100;
        /** 社員詳細情報関連_氏 */
        public static final int DET_0002 = 10;
        /** 社員詳細情報関連_氏(ｶﾅ) */
        public static final int DET_0003 = 10;
        /** 社員詳細情報関連_名 */
        public static final int DET_0004 = 10;
        /** 社員詳細情報関連_名(ｶﾅ) */
        public static final int DET_0005 = 10;
        /** 社員詳細情報関連_メールアドレス */
        public static final int DET_0006 = 50;
        /** 社員詳細情報関連_備考 */
        public static final int DET_0007 = 100;
        /** 家族情報関連_氏 */
        public static final int FAM_0001 = 10;
        /** 家族情報関連_氏（ｶﾅ） */
        public static final int FAM_0002 = 10;
        /** 家族情報関連_名 */
        public static final int FAM_0003 = 10;
        /** 家族情報関連_名（ｶﾅ） */
        public static final int FAM_0004 = 10;
        /** 家族情報関連_続柄 */
        public static final int FAM_0005 = 30;
        /** 資格マスタ関連＿資格名*/
        public static final int LIS_0001 = 100;
        /** 資格マスタ関連＿資格名略称*/
        public static final int LIS_0002 = 20;
        /** 資格マスタ関連＿資格番号*/
        public static final int LIS_0003 = 20;
        /** 資格マスタ関連＿備考*/
        public static final int LIS_0004 = 50;
        /** 資格マスタ関連＿表示順*/
        public static final int LIS_0005 = 2;
        /** 個人情報関連_国籍 */
        public static final int PER_0001 = 50;
        /** 学歴情報関連_学校名 */
        public static final int ACD_0001 = 50;
        /** 学歴情報関連_学部名 */
        public static final int ACD_0002 = 40;
        /** 学歴情報関連_学科名 */
        public static final int ACD_0003 = 40;
        /** 職歴_会社名*/
        public static final int JOH_0001 = 50;
        /** 職歴_住所*/
        public static final int JOH_0002 = 100;
        /** 職歴_退職理由*/
        public static final int JOH_0003 = 100;
        /** 職歴_備考*/
        public static final int JOH_0004 = 100;
        /** 緊急連絡先情報_氏名 */
        public static final int EMA_0001 = 20;
        /** 緊急連絡先情報_ﾌﾘｶﾞﾅ */
        public static final int EMA_0002 = 20;
        /** 保険等情報関連_雇用保険番号 */
        public static final int INS_0001 = 13;
        /** 保険等情報関連_基礎年金番号 */
        public static final int INS_0002 = 11;
        /** 保険等情報関連_基礎年金番号(配偶者) */
        public static final int INS_0003 = 11;
        /** 保険等情報関連_厚生年金被保険者番号 */
        public static final int INS_0004 = 13;
        /** 保険等情報関連_健康保険番号 */
        public static final int INS_0005 = 3;
        /** 保険等情報関連_リロクラブ会員ID */
        public static final int INS_0006 = 11;
        /** 保険等情報関連_さぽーと会員番号 */
        public static final int INS_0007 = 10;
        /** 保険等情報関連_ぱる新宿会員番号 */
        public static final int INS_0008 = 10;
        /** 休職情報_備考 */
        public static final int LEA_0001 = 100;

    }

    /**
     * 最小桁数。 定数名：項目リファレンスのIDについて、アルファベットと数字をアンダーバーで分割。<br>
     * （例）ACC0001の場合：ACC_0001
     */
    public static class MinSize {
//        /** アカウント関連_ログインID */
//        public static final int ACC_0001 = 6;
    }

    /**
     * 固定桁数。 定数名：項目リファレンスのIDについて、アルファベットと数字をアンダーバーで分割。<br>
     * （例）ACC0001の場合：ACC_0001
     */
    public static class FixedSize {
        /** 共通_年月日 */
        public static final int CMN_0002 = 10;
        /** 共通_社員番号 */
        public static final int CMN_0004 = 4;
        /** 共通_郵便番号（ハイフンの左） */
        public static final int CMN_0008 = 3;
        /** 共通_郵便番号（ハイフンの右） */
        public static final int CMN_0009 = 4;
    }

    /**
     * 最大桁数定義。 コンストラクタ（key値, keyに対応する最大桁数（MaxSize））<br>
     * key値は、項目リファレンスのID。
     */
    public static enum MaxLen {
        /** 共通_年月日 */
        CMN0002("CMN0002", FixedSize.CMN_0002),
        /** 共通_社員番号（検索用） */
        CMN0004S("CMN0004S", MaxSize.CMN_0004),
        /** 共通_社員番号 */
        CMN0004("CMN0004", FixedSize.CMN_0004),
        /** 共通_メールアドレス */
        CMN0007("CMN0007", MaxSize.CMN_0007),
        /** 共通_郵便番号1 */
        CMN0008("CMN0008", FixedSize.CMN_0008),
        /** 共通_郵便番号2 */
        CMN0009("CMN0009", FixedSize.CMN_0009),
        /** 共通_電話番号1 */
        CMN0010("CMN0010", MaxSize.CMN_0010),
        /** 共通_電話番号2 */
        CMN0011("CMN0011", MaxSize.CMN_0011),
        /** 共通_電話番号3 */
        CMN0012("CMN0012", MaxSize.CMN_0012),
        /** 勤務地マスタ関連_勤務地コード */
        LOC0001("LOC0001", MaxSize.LOC_0001),
        /** 勤務地マスタ関連_勤務地名称 */
        LOC0002("LOC0002", MaxSize.LOC_0002),
        /** 勤務地マスタ関連_勤務地略称 */
        LOC0003("LOC0003", MaxSize.LOC_0003),
        /** 勤務地マスタ関連_勤務地名称(ｶﾅ) */
        LOC0004("LOC0004", MaxSize.LOC_0004),
        /** 勤務地マスタ関連_勤務地市区町村 */
        LOC0005("LOC0005", MaxSize.LOC_0005),
        /** 勤務地マスタ関連_勤務地番地 */
        LOC0006("LOC0006", MaxSize.LOC_0006),
        /** 勤務地マスタ関連_勤務地建物情報 */
        LOC0007("LOC0007", MaxSize.LOC_0007),
        /** 職位マスタ関連＿職位コード */
        JOB0001("JOB0001", MaxSize.JOB_0001),
        /** 職位マスタ関連＿職位名称 */
        JOB0002("JOB0002", MaxSize.JOB_0002),
        /** 職位マスタ関連＿職位略称 */
        JOB0003("JOB0003", MaxSize.JOB_0003),
        /** 職位マスタ関連＿職位ランク */
        JOB0004("JOB0004", MaxSize.JOB_0004),
        /** 社員一覧：備考 */
        PUB0005("PUB0005", MaxSize.PUB_0005),
        /** 社員一覧：携帯電話番号 */
        PUB0002("PUB0002", MaxSize.PUB_0002),
        /** 社員一覧：携帯メールアドレス */
        PUB0003("PUB0003", MaxSize.PUB_0003),
        /** 社員一覧：住所 */
        PUB0004("PUB0004", MaxSize.PUB_0004),
        /** 勤務地マスタ関連_勤務地コード */
        CNT0001("CNT0001", MaxSize.CNT_0001),
        /** 勤務地マスタ関連_勤務地名称 */
        CNT0002("CNT0002", MaxSize.CNT_0002),
        /** 勤務地マスタ関連_勤務地略称 */
        CNT0003("CNT0003", MaxSize.CNT_0003),
        /** 所属マスタ関連_所属コード */
        DEP0001("DEP0001", MaxSize.DEP_0001),
        /** 所属マスタ関連_所属名称 */
        DEP0002("DEP0002", MaxSize.DEP_0002),
        /** 所属マスタ関連_所属略称 */
        DEP0003("DEP0003", MaxSize.DEP_0003),
        /** 社員基本情報関連_適性検査点数 */
        BAS0001("BAS0001", MaxSize.BAS_0001),
        /** 社員基本情報関連_退職理由 */
        BAS0002("BAS0002", MaxSize.BAS_0002),
        /** 社員基本情報関連_退職理由詳細 */
        BAS0003("BAS0003", MaxSize.BAS_0003),
        /** 社員基本情報関連_備考 */
        BAS0004("BAS0004", MaxSize.BAS_0004),
        /** 社員詳細情報関連_氏 */
        DET0002("DET0002", MaxSize.DET_0002),
        /** 社員詳細情報関連_氏(ｶﾅ) */
        DET0003("DET0003", MaxSize.DET_0003),
        /** 社員詳細情報関連_名 */
        DET0004("DET0004", MaxSize.DET_0004),
        /** 社員詳細情報関連_名(ｶﾅ) */
        DET0005("DET0005", MaxSize.DET_0005),
        /** 社員詳細情報関連_メールアドレス */
        DET0006("DET0006", MaxSize.DET_0006),
        /** 社員詳細情報関連_備考 */
        DET0007("DET0007", MaxSize.DET_0007),
        /** 家族情報関連_氏 */
        FAM0001("FAM0001", MaxSize.FAM_0001),
        /** 家族情報関連_氏（ｶﾅ） */
        FAM0002("FAM0002", MaxSize.FAM_0002),
        /** 家族情報関連_名 */
        FAM0003("FAM0003", MaxSize.FAM_0003),
        /** 家族情報関連_名（ｶﾅ） */
        FAM0004("FAM0004", MaxSize.FAM_0004),
        /** 家族情報関連_続柄 */
        FAM0005("FAM0005", MaxSize.FAM_0005),
        /** 資格マスタ関連＿資格名*/
        LIS0001("LIS0001", MaxSize.LIS_0001),
        /** 資格マスタ関連＿資格名略称*/
        LIS0002("LIS0002", MaxSize.LIS_0002),
        /** 資格マスタ関連＿資格番号*/
        LIS0003("LIS0003", MaxSize.LIS_0003),
        /** 資格マスタ関連＿備考*/
        LIS0004("LIS0004", MaxSize.LIS_0004),
        /** 資格マスタ関連＿表示順*/
        LIS0005("LIS0005", MaxSize.LIS_0005),
        /** 個人情報関連_国籍 */
        PER0001("PER0001", MaxSize.PER_0001),
        /** 学歴情報関連_学校名 */
        ACD0001("ACD0001", MaxSize.ACD_0001),
        /** 学歴情報関連_学部名 */
        ACD0002("ACD0002", MaxSize.ACD_0002),
        /** 学歴情報関連_学科名 */
        ACD0003("ACD0003", MaxSize.ACD_0003),
        /** 職歴_会社名*/
        JOH0001("JOH0001", MaxSize.JOH_0001),
        /** 職歴_住所*/
        JOH0002("JOH0002", MaxSize.JOH_0002),
        /** 職歴_退職理由*/
        JOH0003("JOH0003", MaxSize.JOH_0003),
        /** 職歴_備考*/
        JOH0004("JOH0004", MaxSize.JOH_0004),
        /** 緊急連絡先情報_氏名 */
        EMA0001("EMA0001", MaxSize.EMA_0001),
        /** 緊急連絡先情報_ﾌﾘｶﾞﾅ */
        EMA0002("EMA0002", MaxSize.EMA_0002),
        /** 保険等情報関連_雇用保険番号 */
        INS0001("INS0001", MaxSize.INS_0001),
        /** 保険等情報関連_基礎年金番号 */
        INS0002("INS0002", MaxSize.INS_0002),
        /** 保険等情報関連_基礎年金番号(配偶者) */
        INS0003("INS0003", MaxSize.INS_0003),
        /** 保険等情報関連_厚生年金被保険者番号 */
        INS0004("INS0004", MaxSize.INS_0004),
        /** 保険等情報関連_健康保険番号 */
        INS0005("INS0005", MaxSize.INS_0005),
        /** 保険等情報関連_リロクラブ会員ID */
        INS0006("INS0006", MaxSize.INS_0006),
        /** 保険等情報関連_さぽーと会員番号 */
        INS0007("INS0007", MaxSize.INS_0007),
        /** 保険等情報関連_ぱる新宿会員番号 */
        INS0008("INS0008", MaxSize.INS_0008),
        /** 休職情報_備考 */
        LEA0001("LEA0001", MaxSize.LEA_0001);
        final String key;
        final int value;

        /**
         * コンストラクタ
         *
         * @param name 名称
         */
        private MaxLen(String key, int value) {
            this.key = key;
            this.value = value;
        }

        /**
         * key値から対象の定義を返却。
         *
         * @param key 項目key
         * @return 最大桁数定義
         */
        public static MaxLen getMaxLen(String key) {

            if (key == null) {
                return null;
            }

            for (MaxLen maxLen : MaxLen.values()) {
                if (key.equals(maxLen.getKey())) {
                    return maxLen;
                }
            }

            return null;
        }

        /**
         * keyを取得。
         *
         * @return key
         */
        public String getKey() {
            return key;
        }

        /**
         * valueを取得。
         *
         * @return value
         */
        public int getValue() {
            return value;
        }
    }

    /**
     * 最小桁数定義。 コンストラクタ（key値, keyに対応する最小桁数（MinSize））<br>
     * key値は、項目リファレンスのID。
     */
    public static enum MinLen {
//        /** サブシステム関連_レコード数 */
//        SBS9999("SBS9999", MinSize.SBS_9999),
//        /** サブシステム関連_権限レベル */
//        SBS0005("SBS0005", MinSize.SBS_0005);

//        final String key;
//        final int value;
//
//        /**
//         * コンストラクタ
//         *
//         * @param name 名称
//         */
//        private MinLen(String key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        /**
//         * key値から対象の定義を返却。
//         *
//         * @param key 項目key
//         * @return 最小桁数定義
//         */
//        public static MinLen getMinLen(String key) {
//
//            if (key == null) {
//                return null;
//            }
//
//            for (MinLen minLen : MinLen.values()) {
//                if (key.equals(minLen.getKey())) {
//                    return minLen;
//                }
//            }
//
//            return null;
//        }
//
//        /**
//         * keyを取得。
//         *
//         * @return key
//         */
//        public String getKey() {
//            return key;
//        }
//
//        /**
//         * valueを取得。
//         *
//         * @return value
//         */
//        public int getValue() {
//            return value;
//        }
    }

    /**
     * 固定桁数定義。 コンストラクタ（key値, keyに対応する固定桁数（FixedLen））<br>
     * key値は、項目リファレンスのID。
     */
    public static enum FixedLen {
        /** サブシステム関連_アクセストークン */
        SBS0004("SBS0004", FixedSize.CMN_0004);

        final String key;
        final int value;

        /**
         * コンストラクタ
         *
         * @param name 名称
         */
        private FixedLen(String key, int value) {
            this.key = key;
            this.value = value;
        }

        /**
         * key値から対象の定義を返却。
         *
         * @param key 項目key
         * @return 固定桁数定義
         */
        public static FixedLen getFixedLen(String key) {

            if (key == null) {
                return null;
            }

            for (FixedLen fixedLen : FixedLen.values()) {
                if (key.equals(fixedLen.getKey())) {
                    return fixedLen;
                }
            }

            return null;
        }

        /**
         * keyを取得。
         *
         * @return key
         */
        public String getKey() {
            return key;
        }

        /**
         * valueを取得。
         *
         * @return value
         */
        public int getValue() {
            return value;
        }
    }
}
