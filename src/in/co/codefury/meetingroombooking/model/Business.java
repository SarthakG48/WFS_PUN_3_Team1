package in.co.codefury.meetingroombooking.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

public class Business extends Meeting{

    public Business(int id, String title, User organizer, Date meetingDate, Time startTime, Time endTime,
            Set<User> participants, MeetingRoom meetingRoom) {
        super(id, title, organizer, meetingDate, startTime, endTime, participants, meetingRoom);
        
    }
    
}
