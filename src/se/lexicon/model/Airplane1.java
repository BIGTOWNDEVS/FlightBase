package se.lexicon.model;

import java.util.Date;

public interface Airplane1 {

	public boolean takeOff();
	public boolean land();
	public boolean isAirplaneFull();
	public boolean isRefulled();
	public void addPassengers(Customer1 passenger);
	public void addSeat();
	public void removeSeat();
	public void EditSeat(int seatNumber);
	public void reserveSeat();
	public int getLastSeatNumber();
	public void setLastSeatNumber(int lastSeatNumber);
	public String getDestination();
	public void setDestination(String destination);
	public Date getDepartureTime();
	public void setDepartureTime(Date date);
	public Date getArrivalTime();
	public void setArrivalTime(Date date);}
