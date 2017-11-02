package com.Bacchus.webbase.common.util;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Charsets;

public final class ValidateUtil {

	/**
	 * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
	 */
	private ValidateUtil() {
	}

	private static final Pattern ALPHABET_UPPERCASE = Pattern.compile("[A-Z]*");

	public static boolean isAlphabetUpperCase(CharSequence src) {
		return ALPHABET_UPPERCASE.matcher(src).matches();
	}

	private static final Pattern ALPHABET_LOWERCASE = Pattern.compile("[a-z]*");

	public static boolean isAlphabetLowerCase(CharSequence src) {
		return ALPHABET_LOWERCASE.matcher(src).matches();
	}

	private static final Pattern ALPHABET = Pattern.compile("[a-zA-Z]*");

	public static boolean isAlphabet(CharSequence src) {
		return ALPHABET.matcher(src).matches();
	}

	private static final Pattern ALPHABET_NUMERIC = Pattern.compile("[a-zA-Z0-9]*");

	public static boolean isAlphabetNumeric(CharSequence src) {
		return ALPHABET_NUMERIC.matcher(src).matches();
	}

	private static final Pattern NUMBER = Pattern.compile("[0-9]*");
	public static boolean isNumber(CharSequence src) {
		return NUMBER.matcher(src).matches();
	}

	private static final Pattern CODE_BASIC = Pattern.compile("[a-zA-Z0-9\\-_]*");

	public static boolean isCodeBasic(CharSequence src) {
		return CODE_BASIC.matcher(src).matches();
	}

	/** 禁則文字一覧 */
	private static final String[] PROHIBITION_CHAR = {"～", "，"};
	/**
	 * 禁則文字チェック
	 * @param src チェック対象文字列
	 * @return 禁則文字が含まれていた場合、false
	 */
	public static boolean isProhibitionCheck(CharSequence src) {
		for (String str : PROHIBITION_CHAR) {
			if (src.toString().indexOf(str) > -1) {
				return false;
			}
		}
		return true;
	}

	/** Cherset：SJIS */
	private static final Charset CHARSET_SJIS = Charset.forName("SJIS");
	/**
	 * SJISチェック、バイト化して復元することでSJIS文字コード範囲外の文字が含まれているかを確認する
	 * @param charSequence チェック対象文字列
	 * @return SJIS範囲内の文字が含まれていた場合、false
	 */
	public static boolean isSJIS(CharSequence charSequence) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		// 一度SJISでバイト配列化して復元する。この時に文字列が変わっていなければOK。
		// オリコさんはMS932じゃなくてSJISらしいので。
		byte[] sjisBytes = charSequence.toString().getBytes(CHARSET_SJIS);
		String decoded = new String(sjisBytes, CHARSET_SJIS);
		return StringUtils.equals(charSequence, decoded);
	}

	/**
	 * 全角文字チェック(SJIS2バイト)
	 * @param charSequence チェック対象文字列
	 * @return 1バイト文字が含まれていた場合、false
	 */
	public static boolean isFullwidth(CharSequence charSequence) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		// ProhibitionCheckと併用する為、不正文字が含まれていた場合はチェックせず正常とする
		if (!ValidateUtil.isProhibitionCheck(charSequence)) {
			return true;
		}

		int len = charSequence.toString().length();
		int sjisLen = charSequence.toString().getBytes(CHARSET_SJIS).length;

		// 文字数の2倍と、SJISでのByte換算文字数が一致した場合全角のみと判定(2バイト文字のみ)
		return (len * 2) == sjisLen;
	}

	/** 全角カタカナ */
	private static final Pattern FULLWIDTH_KATAKANA = Pattern.compile("[ァ-ヶー－]*");
	/**
	 * 全角カタカナ文字チェック)
	 * @param charSequence チェック対象文字列
	 * @return 全角カタカナ以外が含まれていた場合、false
	 */
	public static boolean isFullwidthKatakana(CharSequence charSequence) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return FULLWIDTH_KATAKANA.matcher(charSequence).matches();
	}

	/** 全角カタカナ数値 */
	private static final Pattern FULLWIDTH_KATAKANA_NUM = Pattern.compile("[ァ-ヶー－０-９]*");
	/**
	 * 全角カタカナ数値文字チェック)
	 * @param charSequence チェック対象文字列
	 * @return 全角カタカナ数値以外が含まれていた場合、false
	 */
	public static boolean isFullwidthKatakanaNum(CharSequence charSequence) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return FULLWIDTH_KATAKANA_NUM.matcher(charSequence).matches();
	}

	/**
	 * Byte単位サイズチェック(SJIS)
	 * @param text 対象文字列
	 * @param length チェック長(Byte単位)
	 * @return チェック結果、以内の場合true
	 */
	public static boolean isSJISLengthLessEquals(String text, int length) {
		return text.getBytes(CHARSET_SJIS).length <= length;
	}

	/**
	 * Byte単位サイズチェック(UTF-8)
	 * @param text 対象文字列
	 * @param length チェック長(Byte単位)
	 * @return チェック結果、以内の場合true
	 */
	public static boolean isUTF8LengthLessEquals(String text, int length) {
		return text.getBytes(Charsets.UTF_8).length <= length;
	}

	/**
	 * 半角ｶﾅチェック
	 * @param val
	 * @return チェック結果、半角ｶﾅの場合true
	 */
	public static boolean isHalfSizeKana(char val) {
		// 半角全角変換テーブルを検索する
		for (int j = 0; j < ConvertUtil.halfKanaTbl.length; j++) {
			if (ConvertUtil.halfKanaTbl[j].indexOf(String.valueOf(val)) != -1) {
				return true;
			}
		}
		return false;
	}

	private static final Pattern HALF_KATAKANA = Pattern.compile("[｡-､ｦ-ﾟ]*");
	//private static final Pattern HALF_KATAKANA = Pattern.compile("[｡-､ｦ-ﾟ0-9a-zA-Z!-/]*");
	// 半角数字+半角英字+記号+半角カタカナ
	//private static final Pattern HALF_KATAKANA = Pattern.compile("[｡-､ｦ-ﾟ0-9a-zA-Z!-/:-@\\[\\]\\/\\\\\\{\\}\\~\\^\\|\\_]*");
	/**
	 * 半角ｶﾅチェック
	 * @param src
	 * @return チェック結果、半角ｶﾅの場合true
	 */
	public static boolean isHalfSizeKatakana(String src) {
		return HALF_KATAKANA.matcher(src).matches();
	}

	/** E-Mail形式 */
	// 現行ソースより抜粋	pubcon.asp L13
	// 「Const REGULAR_EXPRESSION_EMAIL_2 = "[\w\.\-\+]+@(?:[\w\-\.])+(?:\.[\w\-]+)$"」
	private static final Pattern VALIDATE_EMAIL = Pattern.compile("[\\w\\.\\-\\+]+@(?:[\\w\\-\\.])+(?:\\.[\\w\\-]+)$");
	/**
	 * E-Mailアドレス文字種チェック
	 * @param emailAddress チェック対象E-Mailアドレス
	 * @return 使用できない文字が含まれていた場合、false
	 */
	public static boolean isEmailUnusableChar(String emailAddress) {
		// ①メールアドレス内の＠マークまでの間は『A～Z』『a～z』『0～9』『-』『_』『.』『+』のいずれかの文字が1文字以上存在する事。
		// ②＠マーク以降、かつ、末尾の形式(③)の間『A～Z』『a～z』『0～9』『-』『_』『.』の いずれかの文字が1文字以上存在する事。
		// ③メールアドレスの末尾が『.[任意文字1桁以上]』の形式である事任意文字は『A～Z』『a～z』『0～9』『-』『_』のいずれかの文字である事。
		// ④③の塊が1つ以上存在する事。
		return VALIDATE_EMAIL.matcher(emailAddress).matches();
	}

	/** E-Mailアドレスチェック：攻撃コード */
	private static final String[] EMAIL_ATTACK_CODES = new String[]{
			"--",
			"||",
			"javascript",
			"vbscript"};
	/**
	 * E-Mailアドレス攻撃コードチェック<br>
	 * エラーとする攻撃コード「"--"、"||"、"javascript"、"vbscript"」
	 * @param emailAddress チェック対象E-Mailアドレス
	 * @return 攻撃コードが含まれていた場合、false
	 */
	public static boolean isEmailAttackCode(String emailAddress) {
		for (String code : EMAIL_ATTACK_CODES) {
			// 全て小文字にして判定
			if (emailAddress.toLowerCase().indexOf(code) > -1) {
				// 含まれていた場合、falseで即終了
				return false;
			}
		}

		// 最後まで見つからなかったので正常
		return true;
	}

	/** アットマーク */
	private static final String ATMARK = "@";
	/**
	 * E-Mailアドレスフォーマットチェック(「@」の個数)
	 * @param emailAddress チェック対象E-Mailアドレス
	 * @return 「@」が2個以上が含まれていた場合、false
	 */
	public static boolean isEmailFormatAtmarkCount(String emailAddress) {
		String[] sp = emailAddress.split(ATMARK);
		// 分割して2要素になれば1個だけ含まれている
		return sp.length == 2;
	}

    /**
     * 郵便番号1,2がともに入力、またはともに未入力であることをチェックする。
     * @param code1 郵便番号1
     * @param code2 郵便番号2
     * @return 形式が正しいときtrue、それ以外false
     */
    public static boolean isValidPostalCodeRelation(String code1, String code2){
    	if (code1 != null && code2 != null && ((code1.isEmpty() && code2.isEmpty()) || (!code1.isEmpty() && !code2.isEmpty()))) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /**
     * 電話番号1,2,3がいずれも入力、またはいずれも未入力であることをチェックする。
     * @param code1 郵便番号1
     * @param code2 郵便番号2
     * @param code3 郵便番号3
     * @return 形式が正しいときtrue、それ以外false
     */
    public static boolean isValidPhoneNumberRelation(String code1, String code2, String code3){
    	if (code1 != null && code2 != null && code3 != null
    			&& ((code1.isEmpty() && code2.isEmpty() && code3.isEmpty())
    					|| (!code1.isEmpty() && !code2.isEmpty() && !code2.isEmpty()))) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
