package com.Bacchus.app.components.line;

import java.io.Serializable;

/**
 * イベントの送信元情報。
 *
 * @author 
 */
public class Source implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 送信元タイプ（ユーザー：user、グループ：group、トークルーム：room） */
    private String type;

    /** 送信元ユーザーのID */
    private String userId;

    /** 送信元グループのID */
    private String groupId;

    /** 送信元トークルームのID */
    private String roomId;

    /**
     * 送信元タイプ（ユーザー：user、グループ：group、トークルーム：room）の取得。
     *
     * @return 送信元タイプ（ユーザー：user、グループ：group、トークルーム：room）
     */
    public String getType() {
        return this.type;
    }

    /**
     * 送信元タイプ（ユーザー：user、グループ：group、トークルーム：room）を設定。
     *
     * @param type 送信元タイプ（ユーザー：user、グループ：group、トークルーム：room）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 送信元ユーザーのIDの取得。
     *
     * @return 送信元ユーザーのID
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 送信元ユーザーのIDを設定。
     *
     * @param userId 送信元ユーザーのID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 送信元グループのIDの取得。
     *
     * @return 送信元グループのID
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * 送信元グループのIDを設定。
     *
     * @param groupId 送信元グループのID
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 送信元トークルームのIDの取得。
     *
     * @return 送信元トークルームのID
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * 送信元トークルームのIDを設定。
     *
     * @param roomId 送信元トークルームのID
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

}
