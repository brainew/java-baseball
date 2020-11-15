import model.Baseball;
import model.Gamer;

public class BaseballGame {

	static Baseball baseball = new Baseball();
	static Gamer gamer = new Gamer(baseball);

	public static void main(String[] args) {
		System.out.println(baseball.getDefaultNumbers().toString());
		gamer.playGame();
	}
}