package se.lexicon.model;

import java.util.Date;
import java.util.List;

public class Airline {

	private String name= "PowerSky Airlines";
	
	
	public void startAirline() {
		Airplane airplane1= new Airplane(10, 5);
		ReservationService office= new ReservationService(airplane1);
		// skaffa en kundservice
		System.out.println("Wellcome to " + name);		
	}
	
	@Override
	public int getRegisterNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
