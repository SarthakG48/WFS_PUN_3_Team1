package in.co.codefury.meetingroombooking.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//e.g. invalid input
public class InvalidInputExcepttion extends Exception {

    private static final Logger logger = LoggerFactory.getLogger(InvalidInputExcepttion.class);

    private String message;
    public InvalidInputExcepttion(String message) {
        this.message = message;
        logger.info("ServiceException: Invalid Input Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
