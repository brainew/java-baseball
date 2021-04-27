package utils;

import java.util.ArrayList;

public class CompareUtils {
	public static int compareByEquals(ArrayList<Integer> pitching, ArrayList<Integer> swing) {
		int size = pitching.size();
		int ballCount = 0;

		for (int i = 0; i < size; i++) {
			ArrayList<Integer> copyArray = ArrayUtils.arrayDeepCopyRemoveIndex(pitching, i);
			ballCount += (copyArray.contains(swing.get(i))) ? 1 : 0;
		}

		return ballCount;
	}

	public static int compareByEqualsPosition(ArrayList<Integer> pitching, ArrayList<Integer> swing) {
		int strikeCount = 0;

		for (int movement : pitching) {
			strikeCount += (swing.get(pitching.indexOf(movement)).equals(movement)) ? 1 : 0;
		}

		return strikeCount;
	}
}
