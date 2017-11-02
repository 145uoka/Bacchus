/**
 *
 */
package com.Bacchus.webbase.common.util;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.constants.LabelConstants.ReplacePattern;

/**
 * ラベル関連のUtilクラス。
 * 
 * @author ishigouoka_k
 * $Id: LabelUtil.java 207 2017-05-31 02:48:00Z kamimura_k@glue-si.com $
 */
public class LabelUtil {
    public static String replaceLabel(String src) {

        if (StringUtils.isNotEmpty(src)) {
            for(ReplacePattern replacePattern: ReplacePattern.values()) {
                src = src.replace(replacePattern.getSrc(), replacePattern.getDispValue());
            }
        }

        return src;
    }
}
