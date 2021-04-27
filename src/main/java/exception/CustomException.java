package exception;

public class CustomException {
	public static class InvalidNumberException extends Exception {
		public InvalidNumberException(String message) {
			super(message);
		}
	}
}
