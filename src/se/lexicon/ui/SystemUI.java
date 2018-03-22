package se.lexicon.ui;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import se.lexicon.model.Airline1;
import se.lexicon.model.AirlineImp1;
import se.lexicon.model.AirlineService1;
import se.lexicon.model.AirlineServiceImp1;
import se.lexicon.model.AirplaneImp1;
import se.lexicon.model.CustomerImp1;
import se.lexicon.model.FlightClass;
import se.lexicon.model.FlightManager;
import se.lexicon.model.FoodServiceImp;
import se.lexicon.model.FoodType;
import se.lexicon.model.Reservation1;
import se.lexicon.model.ReservationImpl1;
import se.lexicon.model.ReservationService1;
import se.lexicon.model.ReservationServiceImp1;
import se.lexicon.model.TicketImp;

public class SystemUI {

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;
		int count = 0;
		String strYes = "yes";
		boolean bFoodOption = false;
		int numberOfPassengers = 0;
		int numberOfPassengers1 = 0;
		int flightClass = 0;
		FoodType foodType = FoodType.ECONOMY;
		int seatNumber = 0;
		int countEco = 4;
		int countBus = 0;
		
		String name = null;
		
		AirlineImp1 airline = null;
		AirlineImp1 airline2 = null;
		AirlineImp1 airline3 = null;
		
		Airline1 airline1 = null;
		
		int nAirline = 0;
		TicketImp ticket = null;
		String destination = null;
		FlightClass flightClass1 = FlightClass.ECONOMY;
		
		AirplaneImp1 airplane = null;
		AirplaneImp1 airplane2 = null;
		AirplaneImp1 airplane3 = null;
		
		String fs = null;
		int price = 0;
		
		ReservationService1 reservationService = new ReservationServiceImp1();
		AirlineServiceImp1 airlineService = new AirlineServiceImp1();
        FlightManager flightManger = new FlightManager(reservationService);
        fs = flightManger.generateFlightNumber();
        
		// Try-with-resources to auto-close scanner on error or exit
		try(Scanner scanner = new Scanner(System.in)) {

			//fill the list of Airlines
			airline = new AirlineImp1("SAS");
			airlineService.add(airline);
			System.out.println("SAS airline is created.");

			// Run at least once.
			do {

				// Inner loop error handling
				try {

					System.out.println("User input : ");
					String keyboard = scanner.next();

					switch (keyboard) {

						case "0":
							System.out.println("Exiting program...");
							isRunning = false;
							break;
							
						case "1":
							do {
								   System.out.println("[How Many Passengers]");  
								   numberOfPassengers = scanner.nextInt();
								   numberOfPassengers1 = numberOfPassengers;
								   
								   do
								   {
									   System.out.println("[Enter Destination of the Flight]");  
									   destination =scanner.next();
									   
									   System.out.println("[Enter your name]");
									   name = scanner.next();
									   name += " ";
									   name += scanner.next();
									   System.out.println(name);
									   
									   System.out.println("[Enter if you want food to be served]");  
									   String strFoodOption =scanner.next();
									   
									   
									   if ( strFoodOption.toLowerCase().equals(strYes) ) {
										   System.out.println("[Food will be served]");
										   bFoodOption = true;
									   }
									   else {
										   System.out.println("[Food will not be served]");
										   bFoodOption = false;
									   }									   
									   GregorianCalendar gc = new GregorianCalendar();								   
									   System.out.println("Today date is: " + gc.getTime());
									   
									   System.out.println("[How many days from today would you like to fly]");  
									   int dayField =scanner.nextInt();								   

									   System.out.println("[What time would you like to fly]");  
									   int timeField =scanner.nextInt();
									   
									   //first customer created.
									   System.out.println("Customer information is registered");
									   CustomerImp1 customer = new CustomerImp1(count, name);

									   System.out.println("[Which Airline would you like to fly]");
									   
									   System.out.println(airlineService.toString());
									   nAirline = scanner.nextInt();
									   airline1 = airlineService.getAirlines().get(nAirline-1);
									   
									   //ticket is issued
									   gc.add(GregorianCalendar.DAY_OF_MONTH, dayField);
									   gc.set(GregorianCalendar.HOUR_OF_DAY, timeField);
									   gc.set(GregorianCalendar.MINUTE, 0);
									   gc.set(GregorianCalendar.SECOND, 0);
									   
									   System.out.println("[Which Flight class]");
									   System.out.println("1) ECONOMY" );
									   System.out.println("2) BUSINESS" );
									   
									   flightClass = scanner.nextInt();

									   switch(flightClass) {
									   	
									   case 1:
										   flightClass1 = FlightClass.ECONOMY;
										   break;
									   case 2:
										   flightClass1 = FlightClass.BUSINESS;
										   break;
									   }

									   if(flightClass1 == FlightClass.ECONOMY) {
										   countEco++;
										   seatNumber = countEco;
										   foodType = FoodType.ECONOMY;
									   }else {
										   countBus++;
										   seatNumber = countBus;
										   foodType = FoodType.BUSINESS;
									   }

									   System.out.println("Flight manager is in process...");
										
									   System.out.println(flightManger.toString());
									   
									   if(count > 10)
										   fs = flightManger.generateFlightNumber();
									   if(flightClass1 == FlightClass.ECONOMY)
									   {
										   price = 5000;
									   }else {
										   price = 20000;
									   }
									   
									   ticket = new TicketImp(count, fs, flightClass1, seatNumber, 
											   destination, gc.getTime(), bFoodOption, 
											   foodType, airline1, price);
									   
									   System.out.println(ticket.toString());
									   airline.add(ticket);
									   
									   //first reservation is added
									   System.out.println("Customer Ticket is issued.");
									   ReservationImpl1 reservation = new ReservationImpl1(customer, ticket);
									   reservationService.Add(reservation);
									   numberOfPassengers = numberOfPassengers -1;
									   count++;
								   }while(numberOfPassengers != 0);
								   
								   count++;
								   if(count == numberOfPassengers1 + 1) {
									   isRunning = false;
									   scanner.close();
								   }

									
								   airplane = new AirplaneImp1(" ");
								   
								   for(Reservation1 next : reservationService.getReservationService())
								   {
									   if(airplane.isAirplaneFull()) {
										   System.out.println("Airplane is full\n");
										   airplane = new AirplaneImp1(" ");
										   airline.add(airplane);
										   airplane.setNumber(next.getTicket().getFlightNumber());
										   if(airplane.getDestination().toLowerCase().equals(next.getTicket().getDestination()))
											   airplane.setDestination(next.getTicket().getDestination());
										   else {
											   System.out.println("we have only one plane");
										   }
									   }
									   else {
										   System.out.println("Airplane is not full");
										   airplane.setNumber(next.getTicket().getFlightNumber());
										   airplane.setbNoEmptySeats(false);
										   airplane.setDestination(next.getTicket().getDestination());
									   }
									   
									   airplane.addPassengers(next.getCustomer());
								   }

								   System.out.println("checking the airplane...");
								   System.out.println("Airplane 1: Flight Number" + airplane.getNumber() + "just took off from the airport");
								
								   System.out.println(airplane.toString());
								   
								   airplane.takeOff();
								   System.out.println("[Food serving started and these are results: ] \n");
								   FoodServiceImp foodService = new FoodServiceImp(reservationService.getReservationService());
								   System.out.println(foodService.toString());
								   //flight takes 2 minutes
								   System.out.println("Enjoy your flight and we will be arriving to destination in 2 minutes");
								   Thread.sleep(2000);
								   airplane.land();
								   
								   System.out.println(airline.toString());
								   
								   System.out.println("----------------------------------------------------------------------------------");
								   System.out.println("This time we run the program in the mode where we need to run a airline with Three airplanes\n");
								   
								   System.out.println("Adding two more airplane to the chosen airlines.\n");
								   
									airline2 = new AirlineImp1("Berlin Air");
									airlineService.add(airline2);
									airline2.setbExpand(true);
									System.out.println("Berlin Air Airline is created.");
									airline3 = new AirlineImp1("Swiss Airline");
									airlineService.add(airline3);
									airline3.setbExpand(true);
									System.out.println("Swiss Airline is created.");

								   airplane2 = new AirplaneImp1(flightManger.generateFlightNumber());
								   airline2.addAirplane(airplane2);
								   airplane2.addSeat();
								   System.out.println("one airplane is created and joined to the Fleet of the Air Berlin Airline\n");
								   airplane3 = new AirplaneImp1(flightManger.generateFlightNumber());
								   airline3.addAirplane(airplane3);
								   System.out.println("one airplane is created and joined to the Fleet of Swiss Airline\n");

							}while(isRunning);
							break;
							
						default:
							System.out.println(keyboard + " is not a valid option. Please try again."); 
						     
					}

					// Catch any and all program-specific exceptions here to de-clutter your switch-case
					// in case of checked and/or custom exceptions.

				} catch (Exception e) {
					System.out.println("Exception caught in inner try : " + e.getMessage());

				}

			} while (isRunning);

		} catch (Exception e) {
			System.out.println("Exception caught in outer try : " + e.getMessage());

		} finally {

			// Any tasks needed for cleaning up/saving/etc should be performed here.
			// The scanner auto-closes so don't worry about that.

		}
System.out.println("End of program FlightBase-----");
	}
}