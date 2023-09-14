package in.co.codefury.meetingroombooking.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//generic not found exception can be used for any entity
public class NotFoundException extends Exception {
    
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(NotFoundException.class);

    public NotFoundException(String message) {
        this.message = message;
        logger.warn("ServiceException: Generic Not Found Exception " + message);
    }

    @Override
    public String getMessage() {
        return message;
    }
    
    
}
