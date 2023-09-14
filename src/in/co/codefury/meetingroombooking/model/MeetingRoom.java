package in.co.codefury.meetingroombooking.model;

import java.util.Set;

public class MeetingRoom {
    private int id;//db purpose
    private String name;//unique
    private int capacity;
    private double creditsPerHour;
    private double ratings;
    private Set<Amenity> amenities;
    private double perHourCost;

    //can only be added by admin
    public MeetingRoom(int id,String name, int capacity, double creditsPerHour, double ratings, Set<Amenity> amenities,
            double perHourCost) {
        this.id=id;
        this.name = name;
        this.capacity = capacity;
        this.creditsPerHour = creditsPerHour;
        this.ratings = ratings;
        this.amenities = amenities;
        this.perHourCost = perHourCost;
    }
      public MeetingRoom(String name, int capacity, double creditsPerHour, double ratings,
            double perHourCost) {
        this.name = name;
        this.capacity = capacity;
        this.creditsPerHour = creditsPerHour;
        this.ratings = ratings;
        this.perHourCost = perHourCost;
    }
    public int getId() {
        return id;
    }
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCreditsPerHour() {
        return creditsPerHour;
    }

    public void setCreditsPerHour(double creditsPerHour) {
        this.creditsPerHour = creditsPerHour;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public Set<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(Set<Amenity> amenities) {
        this.amenities = amenities;
    }

    public double getPerHourCost() {
        return perHourCost;
    }

    public void setPerHourCost(double perHourCost) {
        this.perHourCost = perHourCost;
    }

    



}
