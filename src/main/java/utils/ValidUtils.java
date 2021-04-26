package utils;

import exception.CustomException;

public class ValidUtils {
	public static void validInputNumbers(String inputNumber, int checkSize) throws CustomException.InvalidNumberOfSizeException, CustomException.InvalidNumberOfRangeException, CustomException.InvalidNumberFormatException {
		int endRange = (checkSize == 3) ? 9 : 2;

		if (inputNumber.length() != checkSize) {
			throw new CustomException.InvalidNumberOfSizeException("입력한 숫자의 자리수가 잘못되었습니다.");
		}

		validStringToInt(inputNumber, endRange);
	}

	public static void checkRangeByInputNumber(int inputNumber, int startRange, int endRange) throws CustomException.InvalidNumberOfRangeException {
		if (inputNumber < startRange || inputNumber > endRange) {
			throw new CustomException.InvalidNumberOfRangeException("입력한 숫자의 범위가 잘못되었습니다.");
		}
	}

	public static void validStringToInt(String inputValue, int endRange) throws CustomException.InvalidNumberFormatException, CustomException.InvalidNumberOfRangeException {
		try {
			for (char value : inputValue.toCharArray()) {
				checkRangeByInputNumber(Integer.parseInt(String.valueOf(value)), 1, endRange);
			}
		} catch (NumberFormatException | CustomException.InvalidNumberOfRangeException e) {
			throw new CustomException.InvalidNumberFormatException("잘못된 형식입니다. 숫자만 입력해주세요.");
		}
	}
}
