package com.Bacchus.webbase.common.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 出力用ラベルの定数クラス
 *
 * @author ishigouoka_k
 * $Id: LabelConstants.java 207 2017-05-31 02:48:00Z kamimura_k@glue-si.com $
 */
public class LabelConstants {

    private LabelConstants(){};

    public enum ReplacePattern {
        PERIOD("\\\\.", ".(ピリオド)"),
        UNDERSCORE("_", "_(アンダーバー)");

        private String src;
        private String dispValue;

        private ReplacePattern(String src, String dispValue) {
            this.src = src;
            this.dispValue = dispValue;
        }

        /**
         * srcを取得。
         * @return src
         */
        public String getSrc() {
            return src;
        }

        /**
         * dispValueを取得。
         * @return dispValue
         */
        public String getDispValue() {
            return dispValue;
        }

    }

    /** 記号 */
    public static class StringSymbol {
        public static final String COMMA = ",";
        public static final String SLASH = "/";
        public static final String SINGLE_QUOTE = "\'";
        public static final String SINGLE_QUOTE_ESCAPE = "\\\'";
        public static final String SQL_NEW_LINE = "<NEW_LINE_SIGN>";
        public static final String HTML_NEW_LINE = "<br/>";
    }

    public static class CharacterType {
        public static final String HALF_ALALPHABET_NUMERIC = "半角英数字";
        public static final String HALF_NUMERIC = "半角数字";
        public static final String HALF_ALALPHABET = "半角英字";
        public static final String SYMBOLS = "記号";
    }

    /** テーブル名称 */
    public static class TableName {
        public static final String DEPT_RESPONSIBLE_MNG_T = "所属別担当者管理_T";
        public static final String DEPT_RESPONSIBLE_PERSON_T = "所属別担当者_T";
        public static final String JOB_HISTORY_T = "職歴_T";
        public static final String ACADEMIC_HISTORY_T = "学歴情報_T";
        public static final String DEPARTMENT_M = "所属_M";
        public static final String EMERGENCY_CONTACT_T = "緊急連絡先_T";
        public static final String EMPLOYEE_BASIC_T = "社員基本情報_T";
        public static final String EMPLOYEE_DETAIL_HISTORY_T = "社員詳細情報_T";
        public static final String EMP_CONTRACT_M = "雇用契約_M";
        public static final String EXHIBIT_T = "提出書類情報_T";
        public static final String FAMILY_T = "家族情報_T";
        public static final String INSURANCE_T = "保険等情報_T";
        public static final String JOB_M = "職位_M";
        public static final String LICENCE_M = "資格_M";
        public static final String LICENSE_HOLDER_T = "保有資格情報_T";
        public static final String PERSONAL_INFORMATION_T = "個人情報_T";
        public static final String PROJECT_CARD_T = "PJカード権限_T";
        public static final String PUBLIC_PERSONAL_INFORMATION_T = "公開用個人情報_T";
        public static final String RENTAL_T = "物品貸出情報_T";
        public static final String RETIREE_T = "退職情報_T";
        public static final String WORK_LOCATION_M = "勤務地_M";
    }

    /** 都道府県 */
    public static class Prefecture {
        public static final Map<String, String> PREFECTURE_MAP;
        static {
            HashMap<String, String> map = new LinkedHashMap<>();
            map.put("0", "");
            map.put("1", "北海道");
            map.put("2", "青森県");
            map.put("3", "岩手県");
            map.put("4", "宮城県");
            map.put("5", "秋田県");
            map.put("6", "山形県");
            map.put("7", "福島県");
            map.put("8", "茨城県");
            map.put("9", "栃木県");
            map.put("10", "群馬県");
            map.put("11", "埼玉県");
            map.put("12", "千葉県");
            map.put("13", "東京都");
            map.put("14", "神奈川県");
            map.put("15", "新潟県");
            map.put("16", "富山県");
            map.put("17", "石川県");
            map.put("18", "福井県");
            map.put("19", "山梨県");
            map.put("20", "長野県");
            map.put("21", "岐阜県");
            map.put("22", "静岡県");
            map.put("23", "愛知県");
            map.put("24", "三重県");
            map.put("25", "滋賀県");
            map.put("26", "京都府");
            map.put("27", "大阪府");
            map.put("28", "兵庫県");
            map.put("29", "奈良県");
            map.put("30", "和歌山県");
            map.put("31", "鳥取県");
            map.put("32", "島根県");
            map.put("33", "岡山県");
            map.put("34", "広島県");
            map.put("35", "山口県");
            map.put("36", "徳島県");
            map.put("37", "香川県");
            map.put("38", "愛媛県");
            map.put("39", "高知県");
            map.put("40", "福岡県");
            map.put("41", "佐賀県");
            map.put("42", "長崎県");
            map.put("43", "熊本県");
            map.put("44", "大分県");
            map.put("45", "宮崎県");
            map.put("46", "鹿児島県");
            map.put("47", "沖縄県");
            PREFECTURE_MAP = Collections.unmodifiableMap(map);
        }
    }

    /** 有効/無効選択 */
    public static class EffectivePulldown {
        public static final int INEFFECTIVE = 0;
        public static final int EFFECTIVE = 1;
        public static final Map<Integer, String> EFFECTIVE_MAP;
        static {
            HashMap<Integer, String> map = new LinkedHashMap<>();
            map.put(EFFECTIVE, "有効");
            map.put(INEFFECTIVE, "無効");
            EFFECTIVE_MAP = Collections.unmodifiableMap(map);
        }
    }

    /** 表示情報 */
    public static class DisplayInfo {
        public static final String POSTAL_CODE1 = "郵便番号1";
        public static final String POSTAL_CODE2 = "郵便番号2";
        public static final String PHONE_NUMBER1 = "電話番号1";
        public static final String PHONE_NUMBER2 = "電話番号2";
        public static final String PHONE_NUMBER3 = "電話番号3";
        public static final String TOTAL_STRING = "合計";
        public static final String EMPLOYEE_NUMBER = "社員番号";
    }

    public static class TopLevelOfPulldown {
        public static final String TOP_LEVEL_DEPARTMENT_NAME = "【無し】  最上位部署として登録";
    }

    /** 対象/非対象選択 */
    public static class StatisticsPulldown {
        public static final int NONTARGET = 0;
        public static final int TARGET = 1;
        public static final Map<Integer, String> STATISTICS_MAP;
        static {
            HashMap<Integer, String> map = new LinkedHashMap<>();
            map.put(TARGET, "対象");
            map.put(NONTARGET, "非対象");
            STATISTICS_MAP = Collections.unmodifiableMap(map);
        }
    }

    /** 学歴状態区分 */
    public static class AcademicStatePulldowm {
        public static final int SPACE = 0;
        public static final int GRADUATE = 1;
        public static final int DROPOUT = 2;
        public static final int STUDENT = 3;
        public static final Map<Integer, String> ACADEMICSTATE_MAP;
        static {
            HashMap<Integer, String> map = new LinkedHashMap<>();
            map.put(SPACE, "");
            map.put(GRADUATE, "卒業");
            map.put(DROPOUT, "中退");
            map.put(STUDENT, "在学中");
            ACADEMICSTATE_MAP = Collections.unmodifiableMap(map);
        }
    }

    /** 退職情報 */
    public static class ResignationPulldown {
    	public static final int HYPHEN = 0;
    	public static final int NOT_SUBMIT = 1;
    	public static final int SUBMIT = 2;
    	public static final int NOT_COVERED = 3;
    	public static final Map<Integer, String> RESIGNATION_MAP;
    	static {
    		HashMap<Integer, String> map = new LinkedHashMap<>();
    		map.put(HYPHEN, "-");
    		map.put(NOT_SUBMIT, "無し");
    		map.put(SUBMIT, "有り");
    		map.put(NOT_COVERED, "対象外");
    		RESIGNATION_MAP = Collections.unmodifiableMap(map);
    	}

    }

}