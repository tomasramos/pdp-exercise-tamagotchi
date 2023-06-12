package exceptions;

public class UnableToPlayException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UnableToPlayException(String message) {
		super(message);
	}

}
