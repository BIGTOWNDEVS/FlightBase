package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlightManager {

	List<FlightImp1> flightManager = new ArrayList<FlightImp1>();
	ReservationService1 reservationService;
	List<AirplaneImp1> airplaneList = new ArrayList<AirplaneImp1>();
	
	public FlightManager(ReservationService1 reservationService) {
		super();
		this.reservationService = reservationService;
		
		for(Reservation1 next : reservationService.getReservationService()) {
			FlightImp1 flight = new FlightImp1(next.getTicket().getFlightNumber(), next.getTicket().getDestination(), next.getTicket().getFlightTime());
			flightManager.add(flight);
		}
	}

	public void add(FlightImp1 flight) {
		flightManager.add(flight);
	}

	public List<FlightImp1> getFlightManager() {
		return flightManager;
	}
	
	public String generateFlightNumber() {
		
		int flightNumber = 0;
		Random rand = new Random();
		flightNumber  = rand.nextInt(123456);
		
		return String.valueOf(flightNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < flightManager.size(); i++)
		{
			sb.append(flightManager.get(i).toString() + "\n");
		}
		//return "FlightManager [flightManager=" + flightManager + "]";
		return sb.toString();
	}
	
}
