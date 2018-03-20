package se.lexicon.ui;

import se.lexicon.exception.ExampleException;

import java.util.Scanner;

public class SystemUI {

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;
		int count = 0;

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
							
							Scanner sc=new Scanner(System.in);  
						     
							   System.out.println("Enter Destination of the Flight");  
							   String destination =sc.next();  
							   System.out.println("How Many Passengers");  
							   int numberOfPassengers = sc.nextInt();  
							   System.out.println("Enter if you want food to be served");  
							   int bFoodOption =sc.nextInt();  
							   System.out.println("Destination:"+destination+" number of passerngers:"+numberOfPassengers);
							   if(bFoodOption == 1)
								   System.out.println(" Food will be served");
							   else
								   System.out.println(" Food will not be served");
							   
							   sc.close();
							   count++;
							   if(count == 10) {
								   isRunning = false;								   
							   }

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