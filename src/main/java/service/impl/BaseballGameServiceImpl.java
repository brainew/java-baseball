package service.impl;

import model.BaseballGameModel;
import service.BaseballGameService;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BaseballGameServiceImpl implements BaseballGameService {
	private BaseballGameModel baseballGame;

	public BaseballGameServiceImpl(BaseballGameModel baseballGame) {
		this.baseballGame = baseballGame;
	}

	@Override
	public void startGame() {
		createRandomNumbers();
		System.out.println("숫자를입력해주세요: ");
	}

	@Override
	public void createRandomNumbers() {
		LinkedHashSet<Integer> linkedHashMap = new LinkedHashSet<>();

		while (linkedHashMap.size() < 3) {
			linkedHashMap.add(((int) (Math.random() * 9) + 1));
		}

		linkedHashMap.iterator().forEachRemaining(baseballGame::addDefaultNumbers);
	}

	@Override
	public void getInputNumber() {
		Scanner scanner = new Scanner(System.in);
		String inputNumber = scanner.nextLine();
		try {
			validInputNumbers(inputNumber);
			baseballGame.setUserInputNumbers(splitStringToArray(inputNumber));
		} catch (Exception e) {
			System.out.println("ERROR: 자리수와 숫자를 확인하시고 다시 입력해주세요");
			getInputNumber();
		}
	}

	@Override
	public ArrayList<Integer> splitStringToArray(String inputNumber) {
		ArrayList<Integer> convertArray = new ArrayList<>();
		for (char number : inputNumber.toCharArray()) {
			convertArray.add(convertStringToInteger(number));
		}

		return convertArray;
	}

	@Override
	public Integer convertStringToInteger(char input) {
		return Integer.parseInt(String.valueOf(input));
	}

	@Override
	public void validInputNumbers(String inputNumber) throws Exception {
		if (inputNumber.length() != 3) {
			throw new Exception("wrong input number size");
		}

		for (char value : inputNumber.toCharArray()) {
			checkRangeByInputNumber(Integer.parseInt(String.valueOf(value)));
		}
	}

	@Override
	public void checkRangeByInputNumber(int inputNumber) throws Exception {
		if (inputNumber < 1 || inputNumber > 9) {
			throw new Exception("wrong input number range");
		}
	}

	@Override
	public void checkBallStrike() {

	}

	@Override
	public int isBall() {
		return 0;
	}

	@Override
	public int isStrike() {
		return 0;
	}
}
