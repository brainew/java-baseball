package utils;

public class ValidUtils {
	public static boolean validInputNumbers(String inputNumber, int checkSize) {
		return (checkSize == 3) ?
				RegxUtils.defaultGameAnswerRegx(inputNumber) && RegxUtils.defaultGameAnswerRangeRegx(inputNumber)
				: RegxUtils.continueGameAnswerRegx(inputNumber) && RegxUtils.continueGameAnswerRangeRegx(inputNumber);
	}
}
