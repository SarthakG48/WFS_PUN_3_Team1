package in.co.codefury.meetingroombooking.model;

public class Admin extends User{

    public Admin(int id, String name, String email, String password, String phone, double credits, int role) {
        super(id, name, email, password, phone );
        
    }

    //set role,set credits should be only available to admin
    //other users should not be able to change their role
    // public void setRole(int role) {
    //     this.role = role;
    // }
    // public void setCredits(double credits) {
    //     this.credits = credits;
    // }


 
}
