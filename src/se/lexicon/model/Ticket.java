package se.lexicon.model;

import java.util.Date;

public interface Ticket {

	public int getId();
	public String getFlightNumber();
	public FlightClass getFlightClass();
	public int getSeatNumber();
	public String getDestination();
	public Date getFlightTime();
	public boolean getFoodOption();
}
