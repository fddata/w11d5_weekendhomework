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

    public void createFlight(Plane plane, String flightNumber, String destination){
        Flight newFlight = new Flight(flightNumber, destination);
    }


    public void assignPlaneToFlight(Hangar hangar, Plane plane, Flight flight){

    }
}
