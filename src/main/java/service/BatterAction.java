package service;

import exception.CustomException;
import model.Batter;
import utils.NumberUtils;

public class BatterAction {
	public void swing(Batter batter) throws CustomException.InvalidNumberException {
		System.out.println("숫자를 입력해주세요 : ");
		batter.setSwing(NumberUtils.readLine(3));
	}
}
