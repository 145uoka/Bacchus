package com.Bacchus.webbase.common.util;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;

public class PasswordEncoder {

	public static String coded(String source, String salt) {
		PlaintextPasswordEncoder pe = new PlaintextPasswordEncoder();
		return new String(Hex.encodeHex(DigestUtils.sha256(pe.encodePassword(source, salt))));
	}
}
