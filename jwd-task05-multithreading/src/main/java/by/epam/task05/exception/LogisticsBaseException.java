package by.epam.task05.exception;

public class LogisticsBaseException extends Exception {
	private static final long serialVersionUID = 1L;

	public LogisticsBaseException() {
		super();
	}

	public LogisticsBaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogisticsBaseException(String message) {
		super(message);
	}

	public LogisticsBaseException(Throwable cause) {
		super(cause);
	}
}
