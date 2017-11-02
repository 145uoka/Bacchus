/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.result;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.google.common.base.Joiner;

/**
 *
 * @author chinpei
 */
public class Message {

	public enum Level {
		ERROR, WARN, INFO
	}

	private final Level level;
	private final String key;
	private final List<Object> parameters = new ArrayList<>();

	public Message(Level level, String key) {
		this.level = level;
		this.key = key;
	}

	public Message(Level level, String key, Object... parameters) {
		this.level = level;
		this.key = key;
		this.parameters.addAll(Arrays.asList(parameters));
	}

	public Level getLevel() {
		return this.level;
	}

	public String getKey() {
		return key;
	}

	public boolean isWarn() {
		return this.level == Level.WARN;
	}

	public boolean isError() {
		return this.level == Level.ERROR;
	}

	public boolean isInfo() {
		return this.level == Level.INFO;
	}

	public Object[] getParameters() {
		return parameters.toArray(new Object[parameters.size()]);
	}

	public void addParameters(Object... parameters) {
		this.parameters.addAll(Arrays.asList(parameters));
	}

	public String toString(ResourceBundle bundle) {
		String _pattern;
		try {
			_pattern = bundle.getString(key);
		} catch (MissingResourceException e) {
			_pattern = "MissingResource [" + key + "]";
		}
		if (parameters.isEmpty()) {
			return _pattern;
		}
		Object[] _params = parameters.toArray(new Object[0]);
		return MessageFormat.format(_pattern, _params);
	}

	@Override
	public String toString() {
		StringBuilder _builder = new StringBuilder();
		_builder.append(key);
		if (!parameters.isEmpty()) {
			_builder.append(" [").append(Joiner.on(", ").join(parameters)).append("]");
		}
		return _builder.toString();
	}

}
