package com.Bacchus.app.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.StringUtils;


/**
 * 共通処理
 */
public class CommonUtil {

    public static String urlEncode(String param) throws UnsupportedEncodingException {

        if (StringUtils.isEmpty(param)) {
            return param;
        }

        String encodeStr = URLEncoder.encode(param, "UTF-8");
        encodeStr = encodeStr.replace("+", "%20");
        return encodeStr;
    }

    /**
     * NULLをStringの空文字にする
     *
     * @param str
     * @return String
     */
    public static String isEmptyToString(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    /**
     * 文字列→Integer型に変換
     *
     * @param val 変換対象の文字列
     * @return 変換後の値 (エラーの場合はnull)
     */
    public static Integer strToInteger(String val) {
        Integer rtn = null;

        try {
            rtn = Integer.valueOf(val);
        } catch (NumberFormatException e) {
        }

        return rtn;
    }

    /**
     * 年齢計算
     * @param birthDate
     * @return 年齢
     */
    public static String getAge(String birthDate) {

        if (birthDate == null || birthDate.equals("") || birthDate.length() < 8) {
            return "";
        }

        // スラッシュ除去
        String reBirthDate = birthDate.replace("/", "");

        int result = 0;

        // 現在日(nowDate)
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDate = sdf.format(calendar.getTime());

        String birthYear = reBirthDate.substring(0, 4);
        String birthMonth = reBirthDate.substring(4, 6);
        String birthDay = reBirthDate.substring(6, 8);

        String nowYear = nowDate.substring(0, 4);
        String nowMonth = nowDate.substring(4, 6);
        String nowDay = nowDate.substring(6, 8);

        int b_year = Integer.parseInt(birthYear);
        int b_month = Integer.parseInt(birthMonth);
        int b_day = Integer.parseInt(birthDay);

        int n_year = Integer.parseInt(nowYear);
        int n_month = Integer.parseInt(nowMonth);
        int n_day = Integer.parseInt(nowDay);

        GregorianCalendar gCal = new GregorianCalendar();

        // 現在（任意の年月日）の「年」から誕生日の「年」を引く
        result = n_year - b_year;

        // チェックしたい年がうるう年ではない場合
        if (!gCal.isLeapYear(n_year)) {
            // 誕生日がうるう日なら
            if (b_month == 2 && b_day == 29) {
                b_month = 3;
                b_day = 1;
            } // 誕生日を3/1にしておく
        }

        // その年の誕生日を過ぎていなければさらに１歳引く
        if (n_month < b_month) {
            result -= 1;
        } else if (n_month == b_month) {
            if (n_day < b_day) {
                result -= 1;
            }
        }

        return String.valueOf(result);

    }

    /**
     * 入社経過年月
     *
     * 2つの日付の月数の差を求めます。 日付文字列 strDate1 - strDate2 が何ヵ月かを整数で返します。 ※端数の日数は無視します。
     *
     * @param strDate2
     *            入社日 yyyy/MM/dd
     * @return 2つの日付の月数の差
     * @throws ParseException
     *             日付フォーマットが不正な場合
     */
    public static String getPassDate(String strDate2) throws ParseException {

        if(strDate2 == null || strDate2.equals(""))
            return "";


        // 現在日取得
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String strDate1 = sdf.format(calendar.getTime());

        Date date1 = DateFormat.getDateInstance().parse(strDate1);
        Date date2 = DateFormat.getDateInstance().parse(strDate2);
        return getPassDate(date1, date2);
    }

    /**
     * 2つの日付の月数の差を求めます。 java.util.Date 型の日付 date1(現在日) - date2(入社日)
     * が何ヵ月かを整数で返します。 ※端数の日数は無視します。
     *
     * @param date1
     *            日付1 java.util.Date
     * @param date2
     *            日付2 java.util.Date
     * @return 2つの日付の月数の差
     */
    public static String getPassDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        cal1.set(Calendar.DATE, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        cal2.set(Calendar.DATE, 1);
        int count = 0;
        if (cal1.before(cal2)) {
            while (cal1.before(cal2)) {
                cal1.add(Calendar.MONTH, 1);
                count--;
            }
        } else {
            count--;
            while (!cal1.before(cal2)) {
                cal1.add(Calendar.MONTH, -1);
                count++;
            }
        }

        int countyear = count / 12;
        int countmonth = count % 12;

        String.valueOf(countyear);
        String.valueOf(countmonth);

        return String.valueOf(countyear) + "年" + String.valueOf(countmonth)
                + "ヶ月";
    }

    /**
     * チェック項目の一覧表示用変換
     *
     * @param chkValue チェック状態
     * @return 表示値 {true:○  false:×}
     */
    public static String changeBooleToString(boolean chkValue){
        String rtnval = "";

        if (chkValue) {
            rtnval = "○";
        } else {
            rtnval = "×";
        }
        return rtnval;

    }

    /**
     * 処理済みチェックの一覧表示用文字列を取得
     *
     * @param mainVal 処理項目の親項目チェック状態
     * @param chkVal チェック値
     * @return 表示文字列 {true:(済) false:(　)
     */
    public static String getTreatedDispVal(boolean mainVal, boolean chkVal) {

        String dispStr = "　";
        String returnVal = "(　)";

        if (chkVal) {
            dispStr = "済";
        }

        // 親項目の表示もある場合は、状態にカッコを付ける
        if (mainVal) {
            returnVal = "(" + dispStr + ")";
        } else {
            returnVal = dispStr;
        }
        return returnVal;
    }

}
