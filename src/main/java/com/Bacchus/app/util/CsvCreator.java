package com.Bacchus.app.util;

import java.io.PrintWriter;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * CSV作成クラス
 * @author majo_k
 * $Id:
 */
public class CsvCreator {

    private String separateString = ",";

    private String quoteString = "\"";

    private String escapeString = "\"";

    private String crlfTo = " ";

    private String nullString = "";

    // nullを空白文字として出力するか、出力なしとするか
    private boolean isConvertNullToNullString = true;

    // 入力値に対してunescapeを行うか
    private boolean isBeforeUnescape = true;

    private String newLineString = "\r\n";

    private PrintWriter pw;

    private StringBuilder sb;

    /**
     * コンストラクタ
     * PrintWriterをセット
     *
     * @param pw
     */
    public CsvCreator(PrintWriter pw) {
        this.pw = pw;
        sb = new StringBuilder();
    }

    /**
     * 1行出力
     *
     * @param commaSeparateStr カンマ区切り文字列
     */
    public void putLine(String commaSeparateStr) {
        pw.print(commaSeparateStr + newLineString);
    }

    /**
     * 項目を追加。
     * @param item 追加項目
     */
    public void add(String item) {
        String addStr = item;
        if (item == null) {
            if (isConvertNullToNullString) {
                addStr = nullString;
            } else {
                return;
            }
        } else {
            if (isBeforeUnescape) {
                addStr = StringEscapeUtils.unescapeJava(addStr);
            }
            if (addStr.contains(separateString)) {
                // 囲み文字による区切り文字のエスケープ
                addStr = escapeSeparateString(addStr);
            }
            if (addStr.contains(newLineString)) {
                // 改行コードのエスケープ
                addStr = addStr.replace(newLineString, crlfTo);
            }
        }
        sb.append(addStr + separateString);
    }

    /**
     * 条件を満たすとき、項目を追加。
     * 条件を満たさない場合、nullを追加として扱う。
     *
     * @param item
     * @param condition
     */
    public void addWhen(String item, boolean condition) {
        String addStr = item;
        if (!condition) {
            addStr = null;
        }
        add(addStr);
    }

    /**
     * 改行する。
     */
    public void newLine() {
        sb.deleteCharAt(sb.lastIndexOf(separateString));
        sb.append(newLineString);
    }

    /**
     * 出力する。
     */
    public void print() {
        //CSVファイルに書き込み
        pw.print(sb);
        sb.delete(0, sb.length());
    }

    /**
     * 囲み文字で囲むことにより、区切り文字をエスケープする。
     * @param str エスケープ前文字列
     * @return エスケープ後文字列
     */
    private String escapeSeparateString (String str) {
        String reslut = str;
        if (str.contains(quoteString)) {
            reslut = str.replace(quoteString, escapeString + quoteString);
        }
        return quoteString + reslut + quoteString;
    }

    /**
     * 区切り文字を設定。
     * デフォルトはカンマ（,）
     *
     * @param str
     */
    public void setSeparateString(String str) {
        if (str != null) {
            this.separateString = str;
        }
    }

    /**
     * 囲み文字を設定。
     * デフォルトはダブルクォーテーション（"）
     *
     * @param str
     */
    public void setQuoteString(String str) {
        if (str != null) {
            this.quoteString = str;
        }
    }

    /**
     * 囲み文字のエスケープ文字を設定。
     * デフォルトはダブルクォーテーション（"）
     *
     * @param str
     */
    public void setEscapeString(String str) {
        this.escapeString = str;
    }

    /**
     * 改行置換文字を設定。
     * デフォルトはホワイトスペース（ ）
     *
     * @param str
     */
    public void setCrlfTo(String str) {
        this.crlfTo = str;
    }

    /**
     * null置換文字を設定。
     * デフォルトは空文字
     *
     * @param str
     */
    public void setNullString(String str) {
        this.nullString = str;
    }

    /**
     * null文字をnull置換文字に置換するかを設定。
     * trueの場合、null置換文字に置き換えられる。
     * デフォルトはtrue
     *
     * @param bool
     */
    public void setConvertNullToNullString(boolean bool) {
        this.isConvertNullToNullString = bool;
    }

    /**
     * 入力値に対してunescapeを行うかを設定。
     * デフォルトはunescapeを行う
     * @param bool
     */
    public void setBeforeUnescape(boolean bool) {
        this.isBeforeUnescape = bool;
    }

    /**
     * データ出力時の改行文字を設定。
     * デフォルトはキャリッジリターン＆ラインフィード（\r\n）
     *
     * @param str
     */
    public void setNewLineString(String str) {
        this.newLineString = str;
    }

}
