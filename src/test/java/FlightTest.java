import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("GLA111", "LAX");
        plane = new Plane(PlaneType.AIRBUS, "Some Airline");
    }



    @Test
    public void canAssignPlaneToAFlight(){
        flight.setPlane(plane);
        assertNotNull(flight.getPlane());
    }
}