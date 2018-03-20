package se.lexicon.model;

public class Reservation {
	
	private Flight flight;
	private Airplane airplane;
	private boolean business;
	private int  seat;
	private int price= 5000;
	static int totalReservations=0;
	private int reservationnummer;
	private Customer customer;
	
	
	public Reservation(Flight flight, boolean business, int seat, Customer customer) {
		this.flight = flight;
		this.business = business;
		if (business) price=20000;
		this.seat = seat;
		airplane=flight.getAirplane();
		reservationnummer=totalReservations;
		totalReservations++;
		this.customer=customer;
	}


	public static int getTotalReservations() {
		return totalReservations;
	}


	public int getReservationNummber() {
		return reservationnummer;
	}


	public Flight getFlight() {
		return flight;
	}


	public Airplane getAirplane() {
		return airplane;
	}


	public boolean isBusiness() {
		return business;
	}


	public int getSeat() {
		return seat;
	}


	public int getPrice() {
		return price;
	}
	
	

}
