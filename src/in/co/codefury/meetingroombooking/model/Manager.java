package in.co.codefury.meetingroombooking.model;

import java.util.Set;

public class Manager extends User{

    private double credits;
    private Set<Meeting> bookedMeetings;


    public Manager(int id, String name, String email, String password, String phone, double credits) {
        super(id, name, email, password, phone);
        this.credits=credits;
    }


    public double getCredits() {
        return credits;
    }
    
    

    
}