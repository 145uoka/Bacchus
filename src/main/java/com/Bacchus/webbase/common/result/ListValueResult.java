/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.result;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author chinpei
 * @param <T>
 */
public class ListValueResult<T> extends ValueResult<List<T>> {

	public ListValueResult(List<T> value) {
		super(value);
	}

	public ListValueResult() {
		super(Collections.<T>emptyList());
	}

}
