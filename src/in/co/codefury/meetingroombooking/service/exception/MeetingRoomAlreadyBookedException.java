package in.co.codefury.meetingroombooking.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingRoomAlreadyBookedException extends Exception{
    private String message;

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomAlreadyBookedException.class);

    public MeetingRoomAlreadyBookedException(String message) {
        this.message = message;
        logger.info("ServiceExceptions: Meeting Room Already booked Exception " + message );
    }
    @Override
    public String getMessage() {
        return message;
    }
}
