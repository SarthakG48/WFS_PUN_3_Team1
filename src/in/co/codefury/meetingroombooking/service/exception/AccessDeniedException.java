package in.co.codefury.meetingroombooking.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessDeniedException extends Exception {
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(AccessDeniedException.class);

    public AccessDeniedException(String message) {
        this.message = message;
        logger.warn("ServiceException: Access Denied Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
