public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;

    public Flight(String flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }
}
