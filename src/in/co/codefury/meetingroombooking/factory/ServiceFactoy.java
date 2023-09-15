package in.co.codefury.meetingroombooking.factory;

import in.co.codefury.meetingroombooking.dao.MeetingRoomDao;
import in.co.codefury.meetingroombooking.service.Service;
import in.co.codefury.meetingroombooking.service.impl.ServiceImpl;

class ServiceFactory {
    public static Service getService(MeetingRoomDao dao, int option){
        switch (option) {
            case 1:
                return new ServiceImpl(dao);
        
            default:
            return null;
        }
    }
}