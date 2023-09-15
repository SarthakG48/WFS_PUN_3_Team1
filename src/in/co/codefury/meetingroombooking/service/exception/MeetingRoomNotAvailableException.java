package in.co.codefury.meetingroombooking.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingRoomNotAvailableException extends Exception {
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomNotAvailableException.class);

    public MeetingRoomNotAvailableException(String message) {
        this.message = message;
        logger.info("ServiceException: Meeting Room not Available Exception" + message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
