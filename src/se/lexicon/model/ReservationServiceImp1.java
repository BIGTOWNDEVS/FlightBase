package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImp1 implements ReservationService1 {

	private List<Reservation1> reservationList = new ArrayList<Reservation1>();

		
	public ReservationServiceImp1(List<Reservation1> reservationList, CustomerImp1 customer, Ticket ticket) {
		super();
		this.reservationList = reservationList;
	}


	@Override
	public void Add(Reservation1 reservation) {	
		
		reservationList.add(reservation);
	}

}
