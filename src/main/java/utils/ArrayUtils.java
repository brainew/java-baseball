package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {
	public static ArrayList<Integer> arrayDeepCopy(ArrayList<Integer> baseArray) {
		Integer[] copyArray = new Integer[baseArray.size()];
		System.arraycopy(baseArray.toArray(), 0, copyArray, 0, baseArray.size());

		return new ArrayList<>(Arrays.asList(copyArray));
	}

	public static ArrayList<Integer> arrayDeepCopyRemoveIndex(ArrayList<Integer> baseArray, int removeIndex) {
		ArrayList<Integer> copyArray = arrayDeepCopy(baseArray);
		removeIndex(copyArray, removeIndex);

		return copyArray;
	}

	public static void removeIndex(ArrayList<Integer> array, int removeIndex) {
		array.remove(removeIndex);
	}
}
