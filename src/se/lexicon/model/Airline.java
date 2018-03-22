package se.lexicon.model;



// the class Airline creates our great Airline kompany
// it has a Office that takes care of reservations,  a customerService to take orders, and a food service
// we have one only plane in the begining days of our business


public class Airline {

	private String name= "PowerSky Airlines";		
		
	public void startAirline() {
		Airplane airplane1= new Airplane(10, 5);
		ReservationService office= new ReservationService(airplane1);
		CustomerService customerService= new CustomerService();
		//FoodService foodService= new FoodService();
		System.out.println("Wellcome to " + name);		
	}
	

}
