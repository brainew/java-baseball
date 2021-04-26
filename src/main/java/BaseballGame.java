import model.Batter;
import model.Pitcher;
import service.BaseballGameService;

public class BaseballGame {
	private static Pitcher pitcher = new Pitcher();
	private static Batter batter = new Batter();
	private static BaseballGameService baseballGameService = new BaseballGameService(pitcher, batter);

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {
		baseballGameService.startGame();
	}
}
