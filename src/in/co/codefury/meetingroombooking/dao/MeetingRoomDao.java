package in.co.codefury.meetingroombooking.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import in.co.codefury.meetingroombooking.dao.exception.InvalidInputException;
import in.co.codefury.meetingroombooking.dao.exception.MeetingRoomAlreadyExistsException;
import in.co.codefury.meetingroombooking.model.Amenity;
import in.co.codefury.meetingroombooking.model.Manager;
import in.co.codefury.meetingroombooking.model.Meeting;
import in.co.codefury.meetingroombooking.model.MeetingRoom;
import in.co.codefury.meetingroombooking.model.User;
import in.co.codefury.meetingroombooking.service.exception.InvalidInputExcepttion;
import in.co.codefury.meetingroombooking.service.exception.NotFoundException;


public interface MeetingRoomDao {
    public MeetingRoom createMeetingRoom(MeetingRoom m) throws SQLException, MeetingRoomAlreadyExistsException;//done
    public MeetingRoom updateMeetingRoom(MeetingRoom m) throws SQLException, InvalidInputExcepttion;//done
    public void close() throws SQLException, IOException;//done
    public Meeting createMeeting(Meeting m,int userId,int type)throws SQLException, MeetingRoomAlreadyExistsException, NotFoundException;//done
    public Meeting updateMeeting(Meeting m,int type)throws SQLException, InvalidInputException, NotFoundException;//done
    public List<MeetingRoom> getAllMeetingRooms() throws NotFoundException;//done
    public List<Meeting> getAllMeetingsForUser(User u)throws SQLException, NotFoundException;//done
    public List<Meeting> getAllMeetingsForManager(Manager m) throws SQLException, NotFoundException;//done
    public List<Meeting> getAllMeetings() throws NotFoundException;//done
    public Meeting getMeetingById(int id) throws SQLException, NotFoundException ;//done
    public User getUserById(int id) throws NotFoundException;//done
    public MeetingRoom getMeetingRoomByName(String name) throws NotFoundException;//done
    public List<Amenity> getAllAmenities() throws SQLException, NotFoundException;
    public Amenity getAmenityByName(String name) throws SQLException, NotFoundException;//done
    public void addAmenityToMeeting(Amenity a, Meeting m) throws SQLException;//partially done
    public double reduceManagerCreditsForAmenity(Amenity a, User m) throws SQLException;
    public String getPasswordForId(int id) throws NotFoundException;
    public int getRoleForId(int id) throws NotFoundException;

}
