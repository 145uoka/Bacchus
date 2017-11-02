package com.Bacchus.webbase.common.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.constants.LabelConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

public final class ConvertUtil {

    /**
     * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
     */
    private ConvertUtil() {
    }

    /**
     * ハイフンの統一。
     *
     * @param src
     * @param unifiedHyphen
     * @return ハイフン
     */
    public static String toUnifiedHyphen(String src, String unifiedHyphen) {
        StringBuilder result = new StringBuilder();
        char[] chars = src.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isHighSurrogate(c) || Character.isLowSurrogate(c)) {
                result.append(c);
                continue;
            }
            int codePoint = Character.codePointAt(chars, i);
            switch (codePoint) {
            case 0x30fc:
            case 0x2010:
            case 0x2011:
            case 0x2013:
            case 0x2014:
            case 0x2015:
            case 0xff70:
            case 0xff0d:
                result.append(unifiedHyphen);
                break;

            default:
                result.append(c);
                break;
            }
        }
        return result.toString();
    }

    /**
     * ハイフン関連の文字を全てASCIIのハイフンに置き換える。
     *
     * @param src
     * @return ハイフン
     */
    public static String toUnifiedHyphen(String src) {
        return toUnifiedHyphen(src, "-");
    }

    /**
     * ハイフン文字を全て全角マイナスに置き換える。
     *
     * @param src
     * @return 全角マイナス
     */
    public static String toUnifiedHyphenDoubleByte(String src) {
        return toUnifiedHyphen(src, "－");
    }

    /**
     * @param source
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Timestamp toTimestamp(String source, String pattern) throws ParseException {
        if (StringUtils.isEmpty(source)) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        df.setLenient(true);
        Date date = df.parse(source);
        return new Timestamp(date.getTime());
    }

    /**
     * @param source
     * @return
     */
    public static BigDecimal toBigDecimal(String source) {
        return toBigDecimal(source, null);
    }

    /**
     * @param source
     * @param emptyValue
     * @return
     */
    public static BigDecimal toBigDecimal(String source, BigDecimal emptyValue) {
        if (StringUtils.isEmpty(source)) {
            return emptyValue;
        }
        return new BigDecimal(source.replace(",", ""));
    }

    /**
     * @param source
     * @return
     */
    public static Integer toInteger(String source) {
        return toInteger(source, null);
    }

    /**
     * @param source
     * @param emptyValue
     * @return
     */
    public static Integer toInteger(String source, Integer emptyValue) {
        if (StringUtils.isEmpty(source)) {
            return emptyValue;
        }
        return Integer.valueOf(source.replace(",", ""));
    }

    /**
     * 半角ｶﾅテーブル
     */
    public static final String halfKanaTbl[] = {
        // 2文字構成の濁点付き半角カナ
        // 必ずテーブルに先頭に置いてサーチ順を優先すること
        "ｶﾞ", "ｷﾞ", "ｸﾞ", "ｹﾞ", "ｺﾞ",
        "ｻﾞ", "ｼﾞ", "ｽﾞ", "ｾﾞ", "ｿﾞ",
        "ﾀﾞ", "ﾁﾞ", "ﾂﾞ", "ﾃﾞ", "ﾄﾞ",
        "ﾊﾞ", "ﾋﾞ", "ﾌﾞ", "ﾍﾞ", "ﾎﾞ",
        "ﾊﾟ", "ﾋﾟ", "ﾌﾟ", "ﾍﾟ", "ﾎﾟ", "ｳﾞ",
        //ここから1文字構成
        "ｱ", "ｲ", "ｳ", "ｴ", "ｵ",
        "ｶ", "ｷ", "ｸ", "ｹ", "ｺ",
        "ｻ", "ｼ", "ｽ", "ｾ", "ｿ",
        "ﾀ", "ﾁ", "ﾂ", "ﾃ", "ﾄ",
        "ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ",
        "ﾊ", "ﾋ", "ﾌ", "ﾍ", "ﾎ",
        "ﾏ", "ﾐ", "ﾑ", "ﾒ", "ﾓ",
        "ﾔ", "ﾕ", "ﾖ",
        "ﾗ", "ﾘ", "ﾙ", "ﾚ", "ﾛ",
        "ﾜ", "ｦ", "ﾝ",
        "ｧ", "ｨ", "ｩ", "ｪ", "ｫ",
        "ｬ", "ｭ", "ｮ", "ｯ",
        // 記号。全角スペースも可とする。
        "｡", "｢", "｣", "､", "･", "ｰ", "", " ", "　", "-", "ー"
    };

    /**
     * フラグを〇/×に変換
     * @param flag
     * @return 〇/×
     */
    public static final String convFlagToSymbol (String flag) {
        if (flag == null) {
            return null;
        } else if (SystemCodeConstants.Flag.ON.getStringValue().equals(flag)) {
            return "〇";
        } else {
            return "×";
        }
    }

    /**
     * フラグを〇/×に変換
     * @param flag
     * @return 〇/×
     */
    public static final String convFlagToSymbol (Integer flag) {
        if (flag == null) {
            return null;
        } else if (SystemCodeConstants.Flag.ON.getIntegerValue().equals(flag)) {
            return "〇";
        } else {
            return "×";
        }
    }

    /**
     * フラグを〇/×に変換
     * @param flag
     * @return 〇/×
     */
    public static final String convFlagToMainSymbol (Integer flag) {
        if (flag == null) {
            return null;
        } else if (SystemCodeConstants.Flag.ON.getIntegerValue().equals(flag)) {
            return "〇";
        } else {
            return "";
        }
    }

    /**
     * フラグを〇/兼務に変換
     * @param flag
     * @return 〇/×
     */
    public static final String convFlagToMainJobSymbol (Integer flag) {
        if (flag == null) {
            return null;
        } else if (SystemCodeConstants.Flag.ON.getIntegerValue().equals(flag)) {
            return "〇";
        } else {
            return "兼務";
        }
    }

    /**
     * SQL改行マーカーをHTML改行タグに置換
     * @param str
     * @return 置換後文字列
     */
    public static final String replaceSQLNewLineToHtmlBr (String str) {
        return str.replace(LabelConstants.StringSymbol.SQL_NEW_LINE, LabelConstants.StringSymbol.HTML_NEW_LINE);
    }

}
