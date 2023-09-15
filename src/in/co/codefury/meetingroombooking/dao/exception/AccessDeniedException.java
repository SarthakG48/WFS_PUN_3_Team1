package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessDeniedException extends Exception {

    private static final Logger logger = LoggerFactory.getLogger(AccessDeniedException.class);

    private String message;
    public AccessDeniedException(String message) {
        this.message = message;
        logger.warn("DaoException: Access Denied Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
