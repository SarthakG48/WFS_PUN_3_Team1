package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingRoomAlreadyExistsException extends Exception{
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomAlreadyExistsException.class);

    public MeetingRoomAlreadyExistsException(String message) {
        this.message = message;
        logger.info("DaoException: Meeting Room Already Exists Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
