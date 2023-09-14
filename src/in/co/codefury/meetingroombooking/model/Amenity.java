package in.co.codefury.meetingroombooking.model;
public class Amenity {

    private String name;
    private double creditsRequiredToAdd;

    //amentities can be added by admin only
    //think of a way to add amentities by admin only
    public Amenity(String name, double creditsRequiredToAdd) {
        this.name = name;
        this.creditsRequiredToAdd = creditsRequiredToAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditsRequiredToAdd() {
        return creditsRequiredToAdd;
    }

    public void setCreditsRequiredToAdd(double creditsRequiredToAdd) {
        this.creditsRequiredToAdd = creditsRequiredToAdd;
    }
    
    
}
