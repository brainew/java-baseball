package service;

import java.util.ArrayList;

import model.Pitcher;
import utils.ArrayUtils;
import utils.NumberUtils;

public class PitcherAction {
	public void windUp(Pitcher pitcher) {
		ArrayList<Integer> pitching = pitcher.getPitching();

		while (pitching.size() < 3) {
			int tempNumber = NumberUtils.getRandomNumber(pitcher.getPitch().size());

			pitching.add(pitcher.getPitch().get(tempNumber));
			ArrayUtils.removeIndex(pitcher.getPitch(), tempNumber);
		}

		System.out.println(pitcher.getPitching());
	}
}
