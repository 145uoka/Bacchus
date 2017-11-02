package com.Bacchus.app.util;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang3.StringUtils;

/**
 * 暗号化Utilクラス。
 *
 * @author ishigouoka_k
 * $Id: EncryptUtil.java 168 2017-05-29 09:36:54Z kamimura_k@glue-si.com $
 */
public class EncryptUtil {

    public static final class EncryptType {
        /** 暗号化タイプ：SHA256 */
        public static final String SHA256 = "SHA-256";

        /** 暗号化タイプ：MD5 */
        public static final String MD5 = "MD5";
    }


    /** デフォルトソルト値 */
    private static final String DEFFAULT_SALT = "63b3cab38c364ef6bdbd120a52652189";

    /**
     * ハッシュ変換(SHA-256)。
     * <p>
     * 入力値をハッシュした上で、ソルトを付与してハッシュ化した値を返却。
     * @param value ハッシュ対象文字列
     * @return ハッシュ値
     */
    public static String saltHash(String value, String encryptType) {
        return saltHash(value, DEFFAULT_SALT, encryptType);
    }

    /**
     * ハッシュ変換(SHA-256)。
     * <p>
     * 入力値をハッシュした上で、ソルトを付与してハッシュ化した値を返却。
     *
     * @param value ハッシュ対象文字列
     * @param salt ソルト値
     * @return ハッシュ値
     */
    public static String saltHash(String value, String salt, String encryptType) {
        // 入力値のハッシュ化
        String tmpHash = convertStringToHash(value, encryptType);

        if (StringUtils.isBlank(salt)) {
            salt = DEFFAULT_SALT;
        }

        // ソルト付加のハッシュ化
        String hash = convertStringToHash(salt + tmpHash, encryptType);
        return hash;
    }

    /**
     * 任意の文字列を暗号化タイプで変換し返却。
     *
     * @param orgStr 変換前文字列
     * @param encType 暗号化タイプ
     * @return 変換後文字列
     */
    private static String convertStringToHash(String orgStr, String encType) {

        String hashedStr = null;

        try {
            MessageDigest md = MessageDigest.getInstance(encType);
            byte[] hash = md.digest(orgStr.getBytes());
            BigInteger bi = new BigInteger(1, hash);
            hashedStr = String.format("%0" + (hash.length << 1) + "x", bi);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hashedStr;
    }
}
