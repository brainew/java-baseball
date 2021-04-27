package utils;

import java.util.regex.Pattern;

public class RegxUtils {
	public static boolean continueGameAnswerRegx(String validString) {
		return Pattern.matches("^[1-2]*$", validString);
	}

	public static boolean continueGameAnswerRangeRegx(String validString) {
		return Pattern.matches("^\\d{1}$", validString);
	}

	public static boolean defaultGameAnswerRegx(String validString) {
		return Pattern.matches("^[1-9]*$", String.valueOf(validString));
	}

	public static boolean defaultGameAnswerRangeRegx(String validString) {
		return Pattern.matches("^\\d{3}$", validString);
	}
}
