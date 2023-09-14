package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//generic not found exception can be used for any entity
public class NotFoundException extends Exception {
    
    private static final Logger logger = LoggerFactory.getLogger(NotFoundException.class);


    private String message;
    public NotFoundException(String message) {
        this.message = message;
        logger.info("DaoException: Generic Not found Exception: " + message);
    }

    @Override
    public String getMessage() {
        return message;
    }
    
    
}
