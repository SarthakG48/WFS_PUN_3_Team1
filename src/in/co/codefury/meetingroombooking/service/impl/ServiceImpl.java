package in.co.codefury.meetingroombooking.service.impl;

import java.sql.SQLException;
import java.util.List;

import in.co.codefury.meetingroombooking.dao.MeetingRoomDao;
import in.co.codefury.meetingroombooking.dao.exception.InvalidInputException;
import in.co.codefury.meetingroombooking.dao.exception.MeetingRoomAlreadyExistsException;
import in.co.codefury.meetingroombooking.dao.exception.MeetingRoomNotAvailableException;
import in.co.codefury.meetingroombooking.service.Service;
import in.co.codefury.meetingroombooking.service.exception.AccessDeniedException;
import in.co.codefury.meetingroombooking.service.exception.InvalidInputExcepttion;
import in.co.codefury.meetingroombooking.service.exception.NotFoundException;
import in.co.codefury.meetingroombooking.model.Admin;
import in.co.codefury.meetingroombooking.model.Amenity;
import in.co.codefury.meetingroombooking.model.Meeting;
import in.co.codefury.meetingroombooking.model.MeetingRoom;
import in.co.codefury.meetingroombooking.model.User;
import in.co.codefury.meetingroombooking.model.Manager;

public class ServiceImpl implements Service {
    private MeetingRoomDao meetingRoomDao;

    public ServiceImpl(MeetingRoomDao meetingRoomDao) {
        this.meetingRoomDao = meetingRoomDao;
    }


    
    @Override
    public MeetingRoom createMeetingRoom(User u, MeetingRoom m) throws SQLException, AccessDeniedException, InvalidInputException {
        if (u instanceof Admin) {
            try {
                return meetingRoomDao.createMeetingRoom(m);
            } catch (MeetingRoomAlreadyExistsException e) {
                throw new InvalidInputException("Meeting room already exists");
            }
        } else {
            throw new AccessDeniedException("Access Denied. This action is only allowed for Admins.");
        }
    }

    @Override
    public MeetingRoom updateMeetingRoom(User u, MeetingRoom m) throws SQLException, AccessDeniedException, InvalidInputException {
        if (u instanceof Admin) {

            try {
                return meetingRoomDao.updateMeetingRoom(m);
            } catch (InvalidInputExcepttion e) {
                throw new InvalidInputException("Input Invalid");
            }
        } else {
            throw new AccessDeniedException("Access Denied. This action is only allowed for Admins.");
        }
    }

    @Override
    public Meeting createMeeting(User u, Meeting m, int type) throws AccessDeniedException, MeetingRoomNotAvailableException {
        if (u instanceof Manager) {
            try {
                return meetingRoomDao.createMeeting(m, u.getId(), type);
            } catch (SQLException | MeetingRoomAlreadyExistsException | NotFoundException e) {
                throw new MeetingRoomNotAvailableException("Not Available");
            }
        } else {
            throw new AccessDeniedException("Access Denied. This action is only allowed for Managers.");
        }

    }



    @Override
    public List<Meeting> getAllMeetingsForUser(User u) throws SQLException, NotFoundException {
        return meetingRoomDao.getAllMeetingsForUser(u);
    }

    @Override
    public List<Meeting> getAllMeetingForManager(Manager m) throws SQLException, NotFoundException {
        return meetingRoomDao.getAllMeetingsForManager(m);
    }

    @Override
    public MeetingRoom getMeetingRoomByName(String name) throws NotFoundException {
        return meetingRoomDao.getMeetingRoomByName(name);
    }

    @Override
    public Meeting getMeetingById(int id) throws SQLException, NotFoundException {
        return meetingRoomDao.getMeetingById(id);    
    }

    @Override
    public List<Amenity> getAllAmenities() throws SQLException, NotFoundException {
        return meetingRoomDao.getAllAmenities();
    }

    @Override
    public Amenity getAmenityByName(String name) throws SQLException, NotFoundException {
        return meetingRoomDao.getAmenityByName(name);
    }

    @Override
    public void addAmenityToMeeting(Amenity a, Meeting m) throws NotFoundException, AccessDeniedException {
        if(getUserById(m.getOrganizer().getId()) instanceof Manager){
            try {
                meetingRoomDao.addAmenityToMeeting(a, m);
                meetingRoomDao.reduceManagerCreditsForAmenity(a,getUserById(m.getOrganizer().getId()));
            } catch (SQLException e) {
               throw new NotFoundException("Amenity Not Found");
            }        
            }
        else throw new AccessDeniedException("Amenities can only be accessed by manager");
}

    @Override
    public List<MeetingRoom> getAllMeetingRoom() throws NotFoundException {
        return meetingRoomDao.getAllMeetingRooms();
    }

    @Override
    public User getUserById(int id) throws NotFoundException {
        return meetingRoomDao.getUserById(id);
    }


    @Override
    public boolean loginUser(User u) throws NotFoundException {
        if(meetingRoomDao.getPasswordForId(u.getId()) == u.getPassword()){
            return true;
        }
        else{
            //throw new Exception();
            return false;
        }
    }


    @Override
    public boolean loginManager(Manager m) throws NotFoundException {
        if(loginUser(m)){
            int role = meetingRoomDao.getRoleForId(m.getId());
            if(role ==1){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            //throw new Exception();
            return false;
        }
    }


    @Override
    public boolean loginAdmin(Admin a) throws NotFoundException {
        if(loginUser(a)){
            int role = meetingRoomDao.getRoleForId(a.getId());
            if(role ==2){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            //throw new Exception();
            return false;
        }
    }
}
