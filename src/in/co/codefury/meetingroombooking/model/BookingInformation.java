package in.co.codefury.meetingroombooking.model;

import java.sql.Time;
import java.util.Date;
import java.util.Set;



public class BookingInformation {
    private int id;
    private MeetingRoom meetingRoom;
    private Date date;
    private Time startTime;
    private Time endTime;
    private User BookedBy;//id also can be used instead of user
    private String typeOfMeeting;//change type later from string to anything else
    private Set<User> attendees;
    private String agenda;
    private String status;//pending, approved, rejected   
    
    
    public BookingInformation(int id, MeetingRoom meetingRoom, Date date, Time startTime, Time endTime, User bookedBy,
            String typeOfMeeting, Set<User> attendees, String agenda, String status) {
        this.id = id;
        this.meetingRoom = meetingRoom;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        BookedBy = bookedBy;
        this.typeOfMeeting = typeOfMeeting;
        this.attendees = attendees;
        this.agenda = agenda;
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }


    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
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


    public User getBookedBy() {
        return BookedBy;
    }


    public void setBookedBy(User bookedBy) {
        BookedBy = bookedBy;
    }


    public String getTypeOfMeeting() {
        return typeOfMeeting;
    }


    public void setTypeOfMeeting(String typeOfMeeting) {
        this.typeOfMeeting = typeOfMeeting;
    }


    public Set<User> getAttendees() {
        return attendees;
    }


    public void setAttendees(Set<User> attendees) {
        this.attendees = attendees;
    }


    public String getAgenda() {
        return agenda;
    }


    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }



}
