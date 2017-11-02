package com.Bacchus.app.components;

import java.io.Serializable;
import java.util.List;

/**
 * 画面へ表示するメッセージ情報を格納するDTO。
 * 
 * @author ishigouoka_k
 * $Id: DisplayMessageDto.java 207 2017-05-31 02:48:00Z kamimura_k@glue-si.com $
 */
public class DisplayMessageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;

    private List<String> itemizeList;

    /**
     * messageを取得。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * messageを設定。
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * itemizeListを取得。
     * @return itemizeList
     */
    public List<String> getItemizeList() {
        return itemizeList;
    }

    /**
     * itemizeListを設定。
     * @param itemizeList itemizeList
     */
    public void setItemizeList(List<String> itemizeList) {
        this.itemizeList = itemizeList;
    }



}
