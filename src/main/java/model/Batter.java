package model;

import java.util.ArrayList;

public class Batter {
	private ArrayList<Integer> swing = new ArrayList<>();
	private int strike = 0;
	private int ball = 0;
	private boolean chance = true;

	public ArrayList<Integer> getSwing() {
		return swing;
	}

	public void setSwing(ArrayList<Integer> swing) {
		this.swing = swing;
	}

	public int getStrike() {
		return strike;
	}

	public String showStrike() {
		return (this.strike == 0) ? "" : this.strike + " 스트라이크";
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public String showBall() {
		return (this.ball == 0) ? "" : this.ball + "볼";
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public boolean isChance() {
		return chance;
	}

	public void setChance(boolean chance) {
		this.chance = chance;
	}
}
