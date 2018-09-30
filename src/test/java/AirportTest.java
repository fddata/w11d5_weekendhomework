import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {

    Hangar hangar1;
    Hangar hangar2;
    Plane plane1;
    Plane plane2;
    Flight flight;
    Passenger passenger;
    Airport airport;


    @Before
    public void before(){
        hangar1 = new Hangar("Hangar One");
        hangar2 = new Hangar("Hangar Two");
        plane1 = new Plane(PlaneType.AIRBUS, "CC Airlines");
        plane2 = new Plane(PlaneType.BIPLANE, "CC Airlines");
        hangar1.addPlaneToHangar(plane1);
        hangar1.addPlaneToHangar(plane2);
        flight = new Flight("GLA111", "LAX");
        passenger = new Passenger();
        airport = new Airport("GLA");
        airport.addHangars(hangar1);

    }

    @Test
    public void airportHasHangars(){
        assertEquals(1, airport.getNumberOfHangars());
    }

    @Test
    public void airportCanCreateFlights(){
        assertEquals(0, airport.getNumberOfFlights());
        airport.createFlight("TestFlight", "TestDestination");
        assertEquals(1, airport.getNumberOfFlights());
    }

    @Test
    public void airportCanAssignPlaneToFlight(){
        Flight newFlight = airport.createFlight("TestFlight", "TestDestination");
        airport.assignPlaneToFlight(hangar1, plane1, newFlight);
        assertNotNull(airport.getFlights().get(0).getPlane());
    }

    @Test
    public void airportCanAssignTicketToPassenger(){
        airport.assignTicketToPassenger(passenger, flight);
        assertEquals(1, passenger.getNumberOfTickets());
    }

}