import model.BaseballGameModel;
import service.BaseballGameService;
import service.impl.BaseballGameServiceImpl;

public class BaseballGame {
	private static BaseballGameModel baseballGame = new BaseballGameModel();
	private static BaseballGameService baseballGameService = new BaseballGameServiceImpl(baseballGame);

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {
		baseballGameService.startGame();
	}
}
