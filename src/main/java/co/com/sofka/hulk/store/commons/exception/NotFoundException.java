package co.com.sofka.hulk.store.commons.exception;

/**
 * @author micha3lvega
 *
 */
public class NotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotFoundException(Class<?> className) {
		super(className.getName() + " not found");
	}

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Throwable cause) {
		super(cause);
	}

}
