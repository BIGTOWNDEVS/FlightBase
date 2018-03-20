package se.lexicon.model;

public class ReservationImpl1 implements Reservation1 {
	
	private CustomerImp1 customer;
	private Ticket ticket;
	
	public ReservationImpl1(CustomerImp1 customer, Ticket ticket) {
		super();
		this.customer = customer;
		this.ticket = ticket;
	}

	@Override
	public Ticket getTicket() {
		
		return this.ticket;
	}

	@Override
	public Customer1 getCustomer() {
		
		return this.customer;
	}

}
