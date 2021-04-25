package service.impl;

import model.BaseballGameModel;
import service.BaseballGameService;

import java.util.LinkedHashSet;

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
}
