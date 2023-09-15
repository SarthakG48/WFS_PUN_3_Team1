package in.co.codefury.meetingroombooking.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

public class Meeting {
    private int id;
    private String title;
    private User organizer;
    private Date meetingDate;
    private Time startTime;
    private Time endTime;
    private Set<User> participants;
    private MeetingRoom meetingRoom;
    
    public Meeting(int id, String title, User organizer, Date meetingDate, Time startTime, Time endTime,
            Set<User> participants, MeetingRoom meetingRoom) {
        this.id = id;
        this.title = title;
        this.organizer = organizer;
        this.meetingDate = meetingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.participants = participants;
        this.meetingRoom = meetingRoom;
    }
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }
    
}
