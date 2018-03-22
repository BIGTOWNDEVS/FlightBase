package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImp1 implements ReservationService1 {

	private List<Reservation1> reservationList = new ArrayList<Reservation1>();
	private List<Customer1> customerList = new ArrayList<Customer1>();

		
	public List<Customer1> getCustomerList() {
		return customerList;
	}


	public ReservationServiceImp1() {
		super();
	}


	@Override
	public void Add(Reservation1 reservation) {	
		
		reservationList.add(reservation);
	}


	public List<Reservation1> getReservationList() {
		return reservationList;
	}

	@Override
	public List<Reservation1> getReservationService() {
		
		return reservationList;
	}

}
