package no.imr.messaging.exception;

/**
 *
 * @author Terry Hannant <a5119>
 */
public class MessagingException extends RuntimeException {

    
    public MessagingException(String message) {
        super(message);
    }
 
    public MessagingException(String message,Throwable cause) {
        super(message,cause);
    }
 
    
}
