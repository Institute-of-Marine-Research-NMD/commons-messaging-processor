package no.imr.messaging.exception;

/**
 *
 * @author Terry Hannant <a5119>
 */
public class CriticalException extends MessagingException {

    public CriticalException(String message) {
        super(message);
    }

    public CriticalException(String message, Throwable cause) {
        super(message, cause);
    }

    
    
}
