package utils;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;

import exception.CustomException.InvalidNumberFormatException;
import exception.CustomException.InvalidNumberOfRangeException;
import exception.CustomException.InvalidNumberOfSizeException;

public class NumberUtils {
	public static Integer getRandomNumber(int limit) {
		return (int) (Math.random() * limit);
	}

	public static ArrayList<Integer> readLine(int checkSize) throws InvalidNumberOfRangeException,
		InvalidNumberFormatException,
		InvalidNumberOfSizeException {
		Scanner scanner = new Scanner(System.in);
		String readLineValue = scanner.nextLine();

		ValidUtils.validInputNumbers(readLineValue, checkSize);

		return convertStringToIntList(readLineValue, checkSize);
	}

	private static ArrayList<Integer> convertStringToIntList(String inputValue, int endRange) throws
		InvalidNumberOfRangeException, InvalidNumberFormatException {
		ArrayList<Integer> tempList = new ArrayList<>();

		for (char value : inputValue.toCharArray()) {
			int resultInt = convertStringToInt(String.valueOf(value));
			ValidUtils.checkRangeByInputNumber(resultInt, 1, (endRange == 3) ? 9 : 2);
			tempList.add(resultInt);
		}

		return tempList;
	}

	private static int convertStringToInt(String inputValue) throws InvalidNumberFormatException {
		OptionalInt optional = OptionalInt.of(Integer.parseInt(inputValue));
		return optional.orElseThrow(() ->
			new InvalidNumberFormatException("잘못된 형식입니다. 숫자만 입력해주세요."));
	}

}
