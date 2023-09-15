package in.co.codefury.meetingroombooking.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingRoomAlreadyBookedException extends Exception{
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomAlreadyBookedException.class);

    public MeetingRoomAlreadyBookedException(String message) {
        this.message = message;
        logger.info("DaoException: Meeting Room Already Booked Exception: " + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
