package com.Bacchus.app.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.constants.LabelConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * 日付操作の共通処理
 */
public class DateUtil {

    /** 日時フォーマット文字列  yyy/MM/dd HH:mm*/
    public static final String DATE_TIME_FORMAT_YYYYMMDDHHMM = "yyyy/MM/dd HH:mm";

    /** 日時フォーマット文字列  yyy/MM/dd(E) HH:mm*/
    public static final String DATE_TIME_FORMAT_YYYYMMDDEHHMM = "yyyy/MM/dd(E) HH:mm";

    /** 日時フォーマット文字列  yyyy/MM/dd*/
    public static final String DATE_TIME_FORMAT_YYYYMMDD = "yyyy/MM/dd";

    /** 日時フォーマット文字列  yyyy/MM*/
    public static final String DATE_TIME_FORMAT_YYYYMM = "yyyy/MM";

    /**
     * 現在日付(年月)の取得（yyyyMM）
     *
     * @return 日付フォーマット（yyyyMM）
     */
    public static String getNowDateFormatYyyymm() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 現在日付(年月日)の取得（yyyyMMdd）
     *
     * @return 日付フォーマット（yyyyMMdd）
     */
    public static String getNowDateFormatYyyymmdd() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 現在日付(年月日)の取得（yyyy/MM/dd）
     *
     * @return 日付フォーマット（yyyy/MM/dd）
     */
    public static String getNowDateFormatYyyysmmsdd() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT_YYYYMMDD);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 現在日付(年月日)の取得
     *
     * @return 現在日付(Date型)
     */
    public static Date getNowDate() {
        // 現在
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    /**
     * 今月取得
     *
     * @return 今月（yyyy/MM）
     */
    public static String getThisMonth() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT_YYYYMM);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * CalendarからLocalDate型に変換します
     * @param calendar (yyyy/MM/dd)
     * @return LocalDate型日付
     */
    public static LocalDate convertToLocalDater(Calendar calendar){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT_YYYYMMDD);
        String sDate = simpleDateFormat.format(calendar.getTime());
        return convertToLocalDate(sDate);
    }

    /**
     * 文字列日付からLocalDate型に変換します
     * 文字列日付は、日付として正しいことを前提に処理を行っています
     *
     * @param sDate 文字列日付(yyyy/MM/dd)
     * @return LocalDate型日付
     */
    public static LocalDate convertToLocalDate(String sDate) {
        return convertToLocalDate(sDate, DATE_TIME_FORMAT_YYYYMMDD);
    }

    /**
     * 文字列日付からLocalDate型に変換します
     * 文字列日付は、日付として正しいことを前提に処理を行っています
     * 文字列がnullの場合はnullを返却します
     *
     * @param sDate
     * @return
     */
    public static LocalDate convertToLocalDateOrNull(String sDate){
        if(StringUtils.isEmpty(sDate)){
            return null;
        } else {
            return convertToLocalDate(sDate, DATE_TIME_FORMAT_YYYYMMDD);
        }
    }

    /**
     * 文字列日付からLocalDate型に変換します
     * 文字列日付(年月日特定)は、日付として正しいことを前提に処理を行っています
     * 日付フォーマット指定あり
     *
     * @param sDate 文字列日付
     * @param format 日付フォーマット
     * @return LocalDate型日付
     */
    public static LocalDate convertToLocalDate(String sDate, String format) {
        return LocalDate.parse(sDate, DateTimeFormatter.ofPattern(format));
    }

    /**
     * 日付型⇒文字列変換
     * <p>
     * Dateオブジェクトを文字列に変換 <br/>
     * </p>
     *
     * @param date
     *            日付
     * @param format
     *            日付を表す文字列のパターン書式 (yyyy/MM/dd など)
     * @return 日付を表す文字列
     */
    public static LocalDate convertToLocalDate(Date date, String format) {
        String str = new SimpleDateFormat(format).format(date);
        return convertToLocalDate(str, format);
    }

    /**
     *
     *
     * @return
     */
    public static LocalDate convFormatDate(LocalDate localDate, String format){
        String str = new SimpleDateFormat(format).format(localDate);
        return convertToLocalDate(str, format);
    }

    /**
     * 文字列が日付に変換できるか判定
     * @param str 文字列
     * @return 日付変換できるときtrue、できないときfalse
     */
    public static boolean isValidDateFormat(String str) {
        try {
            LocalDate.parse(str, DateTimeFormatter.ofPattern(DATE_TIME_FORMAT_YYYYMMDD));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 文字列が日付に変換できるか判定
     * @param str 文字列
     * @param format フォーマット
     * @return 日付変換できるときtrue、できないときfalse
     */
    public static boolean isValidDateFormat(String str, String format) {
        try {
            LocalDate.parse(str, DateTimeFormatter.ofPattern(format));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 日付型⇒文字列変換
     * <p>
     * Dateオブジェクトを文字列に変換 <br/>
     * </p>
     *
     * @param date
     *            日付
     * @param format
     *            日付を表す文字列のパターン書式 (yyyy/MM/dd など)
     * @return 日付を表す文字列
     */
    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 文字列日付のフォーマット（yyyy/MM/dd）
     * @param ymd 変換元日付文字列 (yyyymmdd)
     * @return 変換後の文字列
     */
    public static String formatStrToYmd(String ymd) {

        if (ymd == null || ymd.isEmpty()) {
            return "";
        }

        SimpleDateFormat formatter_d = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat formatter_s = new SimpleDateFormat(DATE_TIME_FORMAT_YYYYMMDD);
        Date date = formatter_d.parse(ymd, new ParsePosition(0));

        return formatter_s.format(date);
    }

    /**
     * LocalDateをDateに変換
     * @param localDate
     * @return Date
     */
    public static Date localDate2Date(final LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDateを文字列に変換
     * @param localDate
     * @param format
     * @return 文字列
     */
    public static String localDate2String(final LocalDate localDate, String format) {

        Date date = localDate2Date(localDate);

        return dateToString(date, format);
    }

    /**
     * LocalDateを文字列に変換
     * @param localDateTime
     * @param format
     * @return 文字列
     */
    public static String localDateTime2String(final LocalDateTime localDateTime, String format) {

        if (localDateTime == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        return localDateTime.format(formatter);
    }


    /**
     * LocalDateをyyyy/MM/dd形式に変換する。（nullの場合は非該当文字になる）
     * @param localDate 日付
     * @return yyyy/MM/dd形式文字列
     */
    public static String date2DisplayStr(final LocalDate localDate) {

        if (localDate == null) {
            return SystemCodeConstants.EffectiveEndDateCode.EFFECTIVE_END_DATE;
        }

        return dateToString(localDate2Date(localDate), DATE_TIME_FORMAT_YYYYMMDD);
    }

    /**
     * LocalDateをyyyy/MM/dd形式に変換する。（nullの場合は空文字になる）
     * @param localDate 日付
     * @return yyyy/MM/dd形式文字列
     */
    public static String date2DisplayBlank(final LocalDate localDate){

        if (localDate == null) {
            return "";
        }

        return dateToString(localDate2Date(localDate), DATE_TIME_FORMAT_YYYYMMDD);
    }

    /**
     * 年月（YYYY/MM）を当月一日の日付に変換
     * @param YM 年月（文字列）
     * @return 月の初日
     */
    public static LocalDate getFirstDateOf(String YM) {
        if (!isValidDateFormat(YM + "/01")) {
            throw new IllegalArgumentException("input is not valid YM format");
        }
        String[] ymd = YM.split(LabelConstants.StringSymbol.SLASH);
        return LocalDate.of(Integer.parseInt(ymd[0]), Integer.parseInt(ymd[1]), 1);
    }

    /**
     * 年月（YYYY/MM）を当月末日の日付に変換
     * @param YM 年月（文字列）
     * @return 月の末日
     */
    public static LocalDate getLastDateOf(String YM) {
        if (!isValidDateFormat(YM + "/01")) {
            throw new IllegalArgumentException("input is not valid YM format");
        }
        String[] ymd = YM.split(LabelConstants.StringSymbol.SLASH);
        LocalDate firstDay = LocalDate.of(Integer.parseInt(ymd[0]), Integer.parseInt(ymd[1]), 1);
        return firstDay.with(TemporalAdjusters.lastDayOfMonth());
    }

    public static String formatStrToMmdd(String mmdd) {
        if (StringUtils.isEmpty(mmdd)) {
            return mmdd;
        }

        return mmdd.substring(0, 1) + ":" + mmdd.substring(2);
    }

}
