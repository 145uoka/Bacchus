package  com.Bacchus.app.components;

import java.io.Serializable;

/**
 * 汎用コードDTOクラス。
 *
 * @author majo_k
 * $Id:$
 */
public class GeneralCodeDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** コードID */
    private int codeId;

    /** コード区分 */
    private String codeDiv;

    /** コード */
    private String code;

    /** 名称 */
    private String name;

    /** 表示順 */
    private int orderNumber;

    /** 備考 */
    private String remarks;

    /** 削除フラグ */
    private int delFlg;

    /**
     * コードIDの取得。
     *
     * @return コードID
     */
    public int getCodeId() {
        return this.codeId;
    }

    /**
     * コードIDを設定。
     *
     * @param codeId コードID
     */
    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    /**
     * コード区分の取得。
     *
     * @return コード区分
     */
    public String getCodeDiv() {
        return this.codeDiv;
    }

    /**
     * コード区分を設定。
     *
     * @param codeDiv コード区分
     */
    public void setCodeDiv(String codeDiv) {
        this.codeDiv = codeDiv;
    }

    /**
     * コードの取得。
     *
     * @return コード
     */
    public String getCode() {
        return this.code;
    }

    /**
     * コードを設定。
     *
     * @param code コード
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 名称の取得。
     *
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 名称を設定。
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 表示順の取得。
     *
     * @return 表示順
     */
    public int getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * 表示順を設定。
     *
     * @param orderNumber 表示順
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 備考の取得。
     *
     * @return 備考
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * 備考を設定。
     *
     * @param remarks 備考
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 削除フラグの取得。
     *
     * @return 削除フラグ
     */
    public int getDelFlg() {
        return this.delFlg;
    }

    /**
     * 削除フラグを設定。
     *
     * @param delFlg 削除フラグ
     */
    public void setDelFlg(int delFlg) {
        this.delFlg = delFlg;
    }

}
