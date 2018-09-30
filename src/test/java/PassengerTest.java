import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger passenger;
    Flight flight;

    @Before
    public void before(){
        passenger = new Passenger();
        flight = new Flight("TestFlight", "LAX");
    }

    @Test
    public void passengerCanHaveTicket(){
        passenger.buyTickets(flight);
        assertEquals(1, passenger.getNumberOfTickets());
    }

}