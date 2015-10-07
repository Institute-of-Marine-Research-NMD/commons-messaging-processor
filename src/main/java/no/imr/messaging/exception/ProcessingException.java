package no.imr.messaging.exception;

/**
 *
 * @author Terry Hannant <a5119>
 */
public class ProcessingException extends MessagingException {

    public ProcessingException(String message) {
        super(message);
    }

    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
