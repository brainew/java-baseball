import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

	@Test
	@DisplayName("컴퓨터가 사용할 번호 뽑기")
	void pickNumber_isOk() {
		LinkedHashSet<Integer> linkedHashMap = new LinkedHashSet<>();

		while (linkedHashMap.size() < 3) {
			linkedHashMap.add(((int) (Math.random() * 9) + 1));
		}

		ArrayList<Integer> defaultNumbers = new ArrayList<>(linkedHashMap);

		Assertions.assertEquals(3, defaultNumbers.size());
	}

	@Test
	@DisplayName("사용자로부터 입력받은 숫자 검증(size)")
	void valid_size_numbers_isOK() {
		ArrayList<Integer> userInputNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));

		Assertions.assertEquals(3, userInputNumbers.size());
	}

	@Test
	@DisplayName("사용자로부터 입력받은 숫자 검증(range)")
	void valid_range_numbers_isOK() {
		ArrayList<Integer> userInputNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));

		for (int inputNumber : userInputNumbers) {
			Assertions.assertTrue((inputNumber > 0 && inputNumber < 10));
		}
	}

	@Test
	@DisplayName("사용자로부터 입력받은 숫자 검증(parse)")
	void valid_numbers_isOK() {
		String inputNumbers = "123";
		ArrayList<Integer> parseNumbers = new ArrayList<>();

		for (char inputNumber : inputNumbers.toCharArray()) {
			parseNumbers.add(Integer.parseInt(String.valueOf(inputNumber)));
		}

		Assertions.assertEquals(3, parseNumbers.size());
	}

	@Test
	@DisplayName("자리수 별 비교")
	void check_ball_strike() {
		ArrayList<Integer> defaultNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> inputNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));

		Assertions.assertEquals(0, isBall(defaultNumbers, inputNumbers));
		Assertions.assertEquals(3, isStrike(defaultNumbers, inputNumbers));
	}

	int isBall(ArrayList<Integer> defaultNumbers, ArrayList<Integer> inputNumbers) {
		int size = defaultNumbers.size();
		int ballCount = 0;

		for (int i = 0; i < size; i++) {
			ArrayList<Integer> copyArray = arrayDeepCopy(defaultNumbers, i);
			ballCount += (copyArray.contains(inputNumbers.get(i))) ? 1 : 0;
		}

		return ballCount;
	}

	int isStrike(ArrayList<Integer> defaultNumbers, ArrayList<Integer> inputNumbers) {
		int strikeCount = 0;

		for (int defaultNumber : defaultNumbers) {
			strikeCount += (inputNumbers.get(defaultNumbers.indexOf(defaultNumber)).equals(defaultNumber)) ? 1 : 0;
		}

		return strikeCount;
	}

	private ArrayList<Integer> arrayDeepCopy(ArrayList<Integer> baseArray, int removeIndex) {
		Integer[] copyArray = new Integer[baseArray.size()];
		System.arraycopy(baseArray.toArray(), 0, copyArray, 0, baseArray.size());
		ArrayList<Integer> resultArray = new ArrayList<>(Arrays.asList(copyArray));
		removeIndex(resultArray, removeIndex);

		return resultArray;
	}

	private void removeIndex(ArrayList<Integer> array, int removeIndex) {
		array.remove(removeIndex);
	}
}
