package in.co.codefury.meetingroombooking.factory;

import java.sql.SQLException;

import in.co.codefury.meetingroombooking.dao.MeetingRoomDao;
import in.co.codefury.meetingroombooking.dao.impl.MeetingRoomDaoImpl;

public class DaoFactory {
    public static MeetingRoomDao getDao(int option) throws ClassNotFoundException, SQLException{
        switch (option) {
            case 1:
                return new MeetingRoomDaoImpl();
        
            default:
            return null;
        }
    }
}
