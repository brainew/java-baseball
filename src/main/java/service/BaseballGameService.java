package service;

import java.util.ArrayList;

public interface BaseballGameService {
	void startGame();

	void createRandomNumbers();

	void getInputNumber();

	ArrayList<Integer> splitStringToArray(String inputNumber);

	Integer convertStringToInteger(char input);

	void validInputNumbers(String inputNumber) throws Exception;

	void checkRangeByInputNumber(int inputNumber) throws Exception;

	void checkBallStrike();

	int isBall(ArrayList<Integer> defaultNumbers, ArrayList<Integer> inputNumbers);

	int isStrike(ArrayList<Integer> defaultNumbers, ArrayList<Integer> inputNumbers);
}
