/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.result;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chinpei
 */
public class Result {

	private final List<Message> messages = new ArrayList<>();

	public void add(Result other) {
		messages.addAll(other.getMessages());
	}

	public void addMessage(Message.Level level, String key, Object... parameters) {
		messages.add(new Message(level, key, parameters));
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void addInfo(String key, Object... parameters) {
		addMessage(Message.Level.INFO, key, parameters);
	}

	public void addWarn(String key, Object... parameters) {
		addMessage(Message.Level.WARN, key, parameters);
	}

	public void addError(String key, Object... parameters) {
		addMessage(Message.Level.ERROR, key, parameters);
	}

	public List<Message> filterMessages(Message.Level level) {
		List<Message> result = new ArrayList<>();
		for (Message message : this.messages) {
			if (message.getLevel() == level) {
				result.add(message);
			}
		}
		return result;
	}

	public boolean hasLevelMessage(Message.Level level) {
		for (Message message : this.messages) {
			if (message.getLevel() == level) {
				return true;
			}
		}
		return false;
	}

	public boolean isError() {
		return hasLevelMessage(Message.Level.ERROR);
	}

}
