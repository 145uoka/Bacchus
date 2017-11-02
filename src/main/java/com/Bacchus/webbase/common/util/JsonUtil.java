package com.Bacchus.webbase.common.util;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	private static final JsonFactory JSON_FACTORY = new JsonFactory();

	/**
	 * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
	 */
	private JsonUtil() {
	};

	public static String toString(Object object) {
		try (StringWriter sw = new StringWriter();
				JsonGenerator jg = JSON_FACTORY.createGenerator(sw);) {
			OBJECT_MAPPER.writeValue(jg, object);
			jg.flush();
			return sw.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
