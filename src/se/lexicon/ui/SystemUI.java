package se.lexicon.ui;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import se.lexicon.model.CustomerImp1;
import se.lexicon.model.FlightClass;
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
		ReservationService1 reservationService = new ReservationServiceImp1();

		// Try-with-resources to auto-close scanner on error or exit
		try(Scanner scanner = new Scanner(System.in)) {

//			ui UI = new ui(); 
			
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
								   System.out.println("Enter Destination of the Flight");  
								   String destination =scanner.next();  
								   System.out.println("How Many Passengers");  
								   int numberOfPassengers = scanner.nextInt();
								   System.out.println("Enter your name");
								   String name = scanner.next();
								   System.out.println("Enter if you want food to be served");  
								   String strFoodOption =scanner.next();  
								   System.out.println("Destination:"+destination+" number of passerngers:"+numberOfPassengers);
								   
								   if ( strFoodOption.equals(strYes) ) {
									   System.out.println(" Food will be served");									   
								   }
								   else {
									   System.out.println(" Food will not be served");									   
								   }

								   
								   CustomerImp1 customer = new CustomerImp1(count, name);
								   GregorianCalendar gc = new GregorianCalendar();
								   TicketImp ticket = new TicketImp(count, "1000", FlightClass.ECONOMY, 5, destination, new Date(), (boolean)bFoodOption);
								   ReservationImpl1 reservation = new ReservationImpl1(customer, ticket);
								   count++;
								   if(count == 10) {
									   isRunning = false;
									   scanner.close();
								   }								
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

	}

}