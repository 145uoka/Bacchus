package com.Bacchus.app.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 共通入力チェック処理
 */
public class CommonValidator {

    public boolean isOnlyAvailableChar(String value, String[] regxpArgs) {

        if (regxpArgs == null || regxpArgs.length <= 0) {
            return true;
        }

        StringBuffer patternSb = new StringBuffer();

        for (String regxp : regxpArgs) {
            patternSb.append(regxp);
        }

        Pattern pattern = Pattern.compile("^[" + patternSb.toString() + "]+$");

        Matcher m = pattern.matcher(value);

        if (m.find()){
            return true;
        }

        return false;
    }
}
