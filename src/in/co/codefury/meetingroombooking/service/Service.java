package in.co.codefury.meetingroombooking.service;

import java.sql.SQLException;
import java.util.List;

import in.co.codefury.meetingroombooking.service.exception.AccessDeniedException;
import in.co.codefury.meetingroombooking.service.exception.NotFoundException;
import in.co.codefury.meetingroombooking.dao.exception.InvalidInputException;
import in.co.codefury.meetingroombooking.dao.exception.MeetingRoomNotAvailableException;
import in.co.codefury.meetingroombooking.model.Admin;
import in.co.codefury.meetingroombooking.model.Amenity;
import in.co.codefury.meetingroombooking.model.Manager;
import in.co.codefury.meetingroombooking.model.Meeting;
import in.co.codefury.meetingroombooking.model.MeetingRoom;
import in.co.codefury.meetingroombooking.model.User;

public interface Service {
    public boolean loginUser(User u) throws NotFoundException;//add exception user already exist
    public boolean loginManager(Manager m) throws NotFoundException;
    public boolean loginAdmin(Admin a) throws NotFoundException;
    public List<MeetingRoom> getAllMeetingRoom() throws NotFoundException;
    public User getUserById(int id) throws NotFoundException;
    public List<Meeting> getAllMeetingsForUser(User u) throws SQLException, NotFoundException;
    public List<Meeting> getAllMeetingForManager(Manager m) throws SQLException, NotFoundException;
    public MeetingRoom getMeetingRoomByName(String name) throws NotFoundException;
    public Meeting getMeetingById(int id) throws SQLException, NotFoundException;
    public List<Amenity> getAllAmenities() throws SQLException, NotFoundException;
    public Amenity getAmenityByName(String name) throws SQLException, NotFoundException;
    public MeetingRoom createMeetingRoom(User u,MeetingRoom m) throws SQLException,AccessDeniedException, InvalidInputException;//add exception user not authorized
    public MeetingRoom updateMeetingRoom(User u,MeetingRoom m) throws SQLException ,AccessDeniedException, InvalidInputException;//add exception user not authorized
    public Meeting createMeeting(User u, Meeting m, int type) throws AccessDeniedException, MeetingRoomNotAvailableException ;//add exception user not authorized
    public void addAmenityToMeeting(Amenity a, Meeting m) throws NotFoundException, AccessDeniedException;
}
