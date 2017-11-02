package com.Bacchus.app.util;

/**
 * メッセージKeyのUtilクラス。
 *
 * @author kanai_y
 * $Id: MessageKeyUtil.java 215 2017-05-31 07:49:36Z kanai_y@glue-si.com $
 */
public class MessageKeyUtil {

    /**
     * 定数の不要な文字列を削除
     *
     * @param messageKeyConst メッセージKeyの定数
     * @return メッセージKeyの定数(nullの場合はnullを返します)
     */
    public static String encloseStringDelete(String messageKeyConst){
        if(messageKeyConst == null){
            return null;
        }
        return messageKeyConst.replace("{", "").replace("}", "");
    }
}
