package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Pitcher {
	private ArrayList<Integer> pitch = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	private ArrayList<Integer> pitching = new ArrayList<>();

	public ArrayList<Integer> getPitch() {
		return pitch;
	}

	public ArrayList<Integer> getPitching() {
		return pitching;
	}
}
