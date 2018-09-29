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
}