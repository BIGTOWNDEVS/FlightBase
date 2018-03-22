package se.lexicon.model;

import java.util.Date;

public class FlightImp1 {

	private String flightNumber;
	private String destination;
	private Date date;

	public FlightImp1(String flightNumber, String destination, Date date) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.date = date;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	@Override
	public String toString() {
		return "[flightNumber=" + flightNumber + " to destination " + destination + " departured at time " + date + "] has departured";
	}
	
	
}
