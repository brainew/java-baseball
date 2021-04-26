package utils;

import exception.CustomException.InvalidNumberFormatException;
import exception.CustomException.InvalidNumberOfRangeException;
import exception.CustomException.InvalidNumberOfSizeException;

public class ValidUtils {
	public static void validInputNumbers(String inputNumber, int checkSize)
		throws InvalidNumberOfSizeException, InvalidNumberFormatException {
		int endRange = (checkSize == 3) ? 9 : 2;

		if (inputNumber.length() != checkSize) {
			throw new InvalidNumberOfSizeException("입력한 숫자의 자리수가 잘못되었습니다.");
		}

		validStringToInt(inputNumber, endRange);
	}

	public static void checkRangeByInputNumber(int inputNumber, int startRange, int endRange)
		throws InvalidNumberOfRangeException {
		if (inputNumber < startRange || inputNumber > endRange) {
			throw new InvalidNumberOfRangeException("입력한 숫자의 범위가 잘못되었습니다.");
		}
	}

	public static void validStringToInt(String inputValue, int endRange) throws InvalidNumberFormatException {
		try {
			for (char value : inputValue.toCharArray()) {
				checkRangeByInputNumber(Integer.parseInt(String.valueOf(value)), 1, endRange);
			}
		} catch (NumberFormatException | InvalidNumberOfRangeException exception) {
			throw new InvalidNumberFormatException("잘못된 형식입니다. 숫자만 입력해주세요.");
		}
	}
}
