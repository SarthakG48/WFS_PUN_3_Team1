package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingRoomNotAvailableException extends Exception {
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomNotAvailableException.class);

    public MeetingRoomNotAvailableException(String message) {
        this.message = message;
        logger.info("DaoException: Meeting Room Not Available Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
