package se.lexicon.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



//

public class ReservationService {
	static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	
	List<Flight> flights = new ArrayList<Flight>();
	List<Reservation> reservations = new ArrayList<Reservation>();
	
	public ReservationService(Airplane airplane) {  // den ska få en lista av flighplan om vi ska ha flera flygplan
		long t= new Date().getTime();
		
		flights.add(new Flight(1, airplane, new Date(t+(4 * ONE_MINUTE_IN_MILLIS)), new Date(t+(6 * ONE_MINUTE_IN_MILLIS)), "Stockholm-Oslo" ));
		flights.add(new Flight(2, airplane, new Date(t+(7 * ONE_MINUTE_IN_MILLIS)), new Date(t+(9 * ONE_MINUTE_IN_MILLIS)),  "Oslo-Köpenhamn"));
		flights.add(new Flight(3, airplane, new Date(t+(10 * ONE_MINUTE_IN_MILLIS)), new Date(t+(12 * ONE_MINUTE_IN_MILLIS)), "Köpenhamn-Stockholm" ));
		flights.add(new Flight(4, airplane, new Date(t+(13 * ONE_MINUTE_IN_MILLIS)), new Date(t+(15 * ONE_MINUTE_IN_MILLIS)), "Stockholm-Köpenhamn"));
		flights.add(new Flight(5, airplane, new Date(t+(16 * ONE_MINUTE_IN_MILLIS)), new Date(t+(18 * ONE_MINUTE_IN_MILLIS)), "Köpenhamn-Oslo"));
		flights.add(new Flight(6, airplane, new Date(t+(19 * ONE_MINUTE_IN_MILLIS)), new Date(t+(21 * ONE_MINUTE_IN_MILLIS)), "Oslo-Stockholm"));
	}
	
	public void newReservation(Reservation newReservation) {
		reservations.add(newReservation);
		if (newReservation.isBusiness()) newReservation.getFlight().reserveBusinessClass();		
		else newReservation.getFlight().reserveEconomyClass();
		//Write a ticket
	
	}

	public List<Reservation> getReservationList() {
		return reservations;
	}
	
	public List<Flight> getFlightsList() {
		return flights;
	}

}
