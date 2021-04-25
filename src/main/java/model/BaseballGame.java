package model;

import java.util.ArrayList;

public class BaseballGame {
	private ArrayList<Integer> defaultNumbers;
	private ArrayList<Integer> userInputNumbers;
	private int strike = 0;
	private int ball = 0;

	public ArrayList<Integer> getDefaultNumbers() {
		return defaultNumbers;
	}

	public void setDefaultNumbers(ArrayList<Integer> defaultNumbers) {
		this.defaultNumbers = defaultNumbers;
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
