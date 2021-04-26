package model;

public enum GameResult {
	NONE("숫자를입력해주세요: "),
	DONE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

	private String message;

	GameResult(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
