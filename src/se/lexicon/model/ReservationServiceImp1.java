package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImp1 implements ReservationService1 {

	private List<Reservation1> reservationList = new ArrayList<Reservation1>();

		
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

}
