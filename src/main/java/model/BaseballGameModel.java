package model;

import java.util.ArrayList;

public class BaseballGameModel {
	private ArrayList<Integer> defaultNumbers = new ArrayList<>();
	private ArrayList<Integer> userInputNumbers = new ArrayList<>();
	private int strike = 0;
	private int ball = 0;

	public ArrayList<Integer> getDefaultNumbers() {
		return defaultNumbers;
	}

	public void addDefaultNumbers(int inputNumber) {
		this.defaultNumbers.add(inputNumber);
	}

	public ArrayList<Integer> getUserInputNumbers() {
		return userInputNumbers;
	}

	public void setUserInputNumbers(ArrayList<Integer> userInputNumbers) {
		this.userInputNumbers = userInputNumbers;
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}
}
