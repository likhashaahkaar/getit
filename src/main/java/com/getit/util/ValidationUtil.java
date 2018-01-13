package com.getit.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.getit.constant.RegexConstants;

public class ValidationUtil {

	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(RegexConstants.EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
