import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    Plane plane1;
    Passenger passenger;


    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BIPLANE, "Red Baron Airways");
        passenger = new Passenger();
    }

    @Test
    public void canAddPassenger(){
        plane1.addPassenger(passenger);
        assertEquals(1, plane1.getPassengers().size());
    }

    @Test
    public void cannotAddPassengersBeyondCapacity(){
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        assertEquals(2, plane1.getPassengers().size());
    }

    @Test
    public void canRemovePassenger(){
        plane1.addPassenger(passenger);
        plane1.removePassenger(passenger);
        assertEquals(0, plane1.getPassengers().size());
    }

}