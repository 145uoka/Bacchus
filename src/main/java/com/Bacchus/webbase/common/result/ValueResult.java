/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.result;

/**
 *
 * @author chinpei
 * @param <T>
 */
public class ValueResult<T> extends Result {

	public ValueResult(T value) {
		this.value = value;
	}

	public ValueResult() {
	}


	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}