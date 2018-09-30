import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;

public class Passenger {

    private ArrayList<Flight> tickets;

    public Passenger(){
        tickets = new ArrayList<>();
    }

    public void canBuyTicket(Flight flight){
        this.tickets.add(flight);
    }

    public void buyTickets(Flight flight) {
        this.tickets.add(flight);
    }

    public int getNumberOfTickets() {
       return this.tickets.size();
    }
}
