package service;

import exception.CustomException.InvalidNumberFormatException;
import exception.CustomException.InvalidNumberOfRangeException;
import exception.CustomException.InvalidNumberOfSizeException;
import model.Batter;
import model.Game;
import model.Pitcher;
import utils.CompareUtils;
import utils.NumberUtils;

public class BaseballGameService {
	private Batter batter;
	private BatterAction batterAction = new BatterAction();

	private Pitcher pitcher;
	private PitcherAction pitcherAction = new PitcherAction();

	private Game game = new Game();

	public BaseballGameService(Pitcher pitcher, Batter batter) {
		this.pitcher = pitcher;
		this.batter = batter;
	}

	private void ready() {
		pitcherAction.windUp(pitcher);
	}

	private void pitching() throws
		InvalidNumberOfRangeException,
		InvalidNumberFormatException,
		InvalidNumberOfSizeException {
		batterAction.swing(batter);
	}

	private void setScore() {
		batter.setBall(CompareUtils.compareByEquals(pitcher.getPitching(), batter.getSwing()));
		batter.setStrike(CompareUtils.compareByEqualsPosition(pitcher.getPitching(), batter.getSwing()));
	}

	private void presentScore() {
		batter.setChance(batter.getStrike() != 3);

		if (batter.getBall() == 0 && batter.getStrike() == 0) {
			System.out.println("낫싱");
			return;
		}

		System.out.println((batter.showStrike() + " " + batter.showBall()).trim());
	}

	private void showGameResult()
		throws InvalidNumberFormatException, InvalidNumberOfSizeException, InvalidNumberOfRangeException {
		if (!batter.isChance()) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			game.setRestartValue(NumberUtils.readLine(1).get(0));
			restartGame();
			return;
		}

		oneMoreChance();
	}

	private void oneMoreChance() {
		gameStartCycleWithoutReady();
	}

	private void restartGame() {
		if (game.getRestartValue() == 2) {
			return;
		}

		batter = new Batter();
		pitcher = new Pitcher();

		gameStartCycleDefault();
	}

	private void gameStartCycleDefault() {
		try {
			ready();
			pitching();
			setScore();
			presentScore();
			showGameResult();
		} catch (InvalidNumberOfRangeException
			| InvalidNumberFormatException | InvalidNumberOfSizeException exception) {
			gameStartCycleWithExceptionMessage(exception);
		}
	}

	private void gameStartCycleWithoutReady() {
		try {
			pitching();
			setScore();
			presentScore();
			showGameResult();
		} catch (InvalidNumberOfRangeException
			| InvalidNumberFormatException | InvalidNumberOfSizeException exception) {
			gameStartCycleWithExceptionMessage(exception);
		}
	}

	private void gameStartCycleWithExceptionMessage(Exception exception) {
		System.out.println(exception.getMessage());
		gameStartCycleWithoutReady();
	}

	public void startGame() {
		gameStartCycleDefault();
	}
}
