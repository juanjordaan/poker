package cloud.jordaan.juan.poker.exception;

public class ApplicationException extends RuntimeException {
	private static final long serialVersionUID = 4336887804510503439L;

	public ApplicationException(String message) {
		super(message);
	}
}
