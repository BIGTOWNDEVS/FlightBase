package se.lexicon.model;

import java.util.Date;

public class TicketImp implements Ticket {

	private int Id;
	private String flightNumber;
	private FlightClass flightClass;
	private int seatNumber;
	private String destination;
	private Date flightTime;
	private boolean foodOption;


	public TicketImp(int id, String flightNumber, FlightClass flightClass, int seatNumber, String destination,
			Date flightTime, boolean foodOption) {
		super();
		Id = id;
		this.flightNumber = flightNumber;
		this.flightClass = flightClass;
		this.seatNumber = seatNumber;
		this.destination = destination;
		this.flightTime = flightTime;
		this.foodOption = foodOption;
	}
	
	@Override
	public int getId() {
		
		return this.Id;
	}

	@Override
	public String getFlightNumber() {
		
		return this.flightNumber;
	}

	@Override
	public FlightClass getFlightClass() {
		
		return this.flightClass;
	}

	@Override
	public int getSeatNumber() {
		
		return this.seatNumber;
	}

	@Override
	public String getDestination() {
		
		return this.destination;
	}

	@Override
	public Date getFlightTime() {
		
		return this.flightTime;
	}

	@Override
	public boolean getFoodOption() {
		
		return this.foodOption;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		return sb;
	}

}
