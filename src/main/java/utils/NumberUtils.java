package utils;

import java.util.ArrayList;
import java.util.Scanner;

import exception.CustomException;

public class NumberUtils {
	public static Integer getRandomNumber(int limit) {
		return (int) (Math.random() * limit);
	}

	public static ArrayList<Integer> readLine(int checkSize) throws CustomException.InvalidNumberException {
		Scanner scanner = new Scanner(System.in);
		String readLineValue = scanner.nextLine();

		if (!ValidUtils.validInputNumbers(readLineValue, checkSize)) {
			throw new CustomException.InvalidNumberException("입력값이 올바르지않습니다.");
		}

		return convertStringToIntList(readLineValue);
	}

	private static ArrayList<Integer> convertStringToIntList(String inputValue) {
		ArrayList<Integer> tempList = new ArrayList<>();

		for (char value : inputValue.toCharArray()) {
			int resultInt = convertStringToInt(String.valueOf(value));
			tempList.add(resultInt);
		}

		return tempList;
	}

	private static int convertStringToInt(String inputValue) {
		return Integer.parseInt(inputValue);
	}

}
