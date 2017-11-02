package com.Bacchus.app.components;

import java.io.Serializable;

import org.springframework.validation.BindingResult;

/**
 * コントローラとサービスクラスのインタフェースとなるDTOの抽象クラス。
 * 
 * @author ishigouoka_k
 * $Id: AbstractResultServiceDto.java 207 2017-05-31 02:48:00Z kamimura_k@glue-si.com $
 */
public abstract class AbstractResultServiceDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * エラー情報等
     */
    private BindingResult bindingResult;

    /**
     * エラー有無
     */
    private boolean error = false;

    /**
     * bindingResultを取得。
     * @return bindingResult
     */
    public BindingResult getBindingResult() {
        return bindingResult;
    }

    /**
     * bindingResultを設定。
     * @param bindingResult bindingResult
     */
    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    /**
     * errorを取得。
     * @return error
     */
    public boolean hasError() {
        return error;
    }

    /**
     * errorを設定。
     * @param error error
     */
    public void setError(boolean error) {
        this.error = error;
    }


}
