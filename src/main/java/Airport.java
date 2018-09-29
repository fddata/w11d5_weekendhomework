import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private String airportCode;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public ArrayList<Hangar> getHangars() {
        return hangars;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void addHangars(Hangar hangar){
        this.hangars.add(hangar);
    }

    public int getNumberOfHangars(){
        return this.hangars.size();
    }

    public int getNumberOfFlights(){
        return this.flights.size();
    }


    public Plane getPlaneFromHangar(Hangar hangar, Plane plane){
       int targetHangarIndex = this.hangars.indexOf(hangar);
        Hangar targetHangar = this.hangars.get(targetHangarIndex);
        int targetPlaneIndex = targetHangar.getPlanes().indexOf(plane);
        return targetHangar.getPlane(plane);
    }

    public void createFlight(String flightNumber, String destination) {
        Flight newFlight = new Flight(flightNumber, destination);
        this.flights.add(newFlight);
    }

    public void assignPlaneToFlight(Hangar hangar, Plane plane, Flight flight){
        int flightIndex = this.flights.indexOf(flight);
        Flight targetFlight = this.flights.get(flightIndex);
        Plane targetPlane = getPlaneFromHangar(hangar, plane);
        targetFlight.setPlane(targetPlane);

    }



}
