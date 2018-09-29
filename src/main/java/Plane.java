import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getType() {
        return type;
    }

    public String getAirline() {
        return airline;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }


    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.type.getCapacity()){
            this.passengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
