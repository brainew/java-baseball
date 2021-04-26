package service;

import exception.CustomException.InvalidNumberFormatException;
import exception.CustomException.InvalidNumberOfRangeException;
import exception.CustomException.InvalidNumberOfSizeException;
import model.Batter;
import utils.NumberUtils;

public class BatterAction {
	public void swing(Batter batter)
		throws InvalidNumberOfRangeException, InvalidNumberFormatException, InvalidNumberOfSizeException {
		System.out.println("숫자를 입력해주세요 : ");
		batter.setSwing(NumberUtils.readLine(3));
	}
}
