package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//e.g. invalid input
public class InvalidInputException extends Exception {

    private static final Logger logger = LoggerFactory.getLogger(InvalidInputException.class);


    private String message;
    public InvalidInputException(String message) {
        this.message = message;
        logger.debug("DaoException: Invalid Input Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
