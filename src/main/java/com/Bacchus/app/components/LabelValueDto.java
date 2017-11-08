package  com.Bacchus.app.components;

import java.io.Serializable;

/**
 * LabelValueDto。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class LabelValueDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント管理番号 */
    private Object label;

    /** イベント名 */
    private Object value;

    /**
     * イベント管理番号の取得。
     *
     * @return イベント管理番号
     */
    public Object getLabel() {
        return this.label;
    }

    /**
     * イベント管理番号を設定。
     *
     * @param label イベント管理番号
     */
    public void setLabel(Object label) {
        this.label = label;
    }

    /**
     * イベント名の取得。
     *
     * @return イベント名
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * イベント名を設定。
     *
     * @param value イベント名
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
