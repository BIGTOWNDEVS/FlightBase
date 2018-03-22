package se.lexicon.model;

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
}
