package se.lexicon.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirplaneImp1 implements Airplane1 {
	
	private List<Customer1> passengers = new ArrayList<Customer1>();
	private String number;
	private boolean bRefulled;
	private boolean bNoEmptySeats;
	private String destination;
	private int lastSeatNumber;
	private Date departureTime;
	private Date arrivalTime;

	public AirplaneImp1(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public boolean takeOff() {
		System.out.println("airplane is taking off");
		return true;
	}

	@Override
	public boolean land() {
		System.out.println("Faten your seat belts, we are about to land in the destination airport, we hope you enjoyed your flight");
		return true;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public boolean isAirplaneFull() {
		
		return this.passengers.size() == 10;
	}

	@Override
	public void addPassengers(Customer1 passenger) {
		this.passengers.add(passenger);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Following are the list of passengers in the flight " + number);
		sb.append("\n");
		sb.append("------------------------------------------------------------------");
		sb.append("\n");
		for(Customer1 next : passengers)
		{
			sb.append(next.getName() + " ");
			sb.append(getDepartureTime());
			sb.append("\n");
		}
		
		return sb.toString();
	}

	@Override
	public boolean isRefulled() {
		
		return false;
	}

	public boolean isbRefulled() {
		return bRefulled;
	}

	public void setbRefulled(boolean bRefulled) {
		this.bRefulled = bRefulled;
	}

	public boolean isbNoEmptySeats() {
		return bNoEmptySeats;
	}

	public void setbNoEmptySeats(boolean bNoEmptySeats) {
		this.bNoEmptySeats = bNoEmptySeats;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public void addSeat() {
		
	}

	@Override
	public void removeSeat() {
		
	}

	@Override
	public void EditSeat(int seatNumber) {
	
		
	}

	@Override
	public void reserveSeat() {
		
		
	}

	@Override
	public int getLastSeatNumber() {
		
		return 0;
	}

	@Override
	public void setLastSeatNumber(int lastSeatNumber) {
		
	}

	@Override
	public Date getDepartureTime() {
		
		return this.departureTime;
	}

	@Override
	public void setDepartureTime(Date date) {
		this.departureTime = date;
	}

	@Override
	public Date getArrivalTime() {
		
		return this.arrivalTime;
	}

	@Override
	public void setArrivalTime(Date date) {
		this.arrivalTime = date;
	}

}


//package se.lexicon.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AirplaneImp1 implements Airplane1 {
//	
//	private List<Customer1> passengers = new ArrayList<Customer1>();
//	private String number;
//	private boolean bRefulled;
//	private boolean bNoEmptySeats;
//	private String destination;
//	private int lastSeatNumber;
//	
//
//	public AirplaneImp1(String number) {
//		super();
//		this.number = number;
//	}
//
//	public String getNumber() {
//		return number;
//	}
//
//	@Override
//	public boolean takeOff() {
//		System.out.println("airplane is taking off");
//		return true;
//	}
//
//	@Override
//	public boolean land() {
//		System.out.println("Faten your seat belts, we are about to land in the destination airport, we hope you enjoyed your flight");
//		return true;
//	}
//
//	public void setNumber(String number) {
//		this.number = number;
//	}
//
//	@Override
//	public boolean isAirplaneFull() {
//		
//		return this.passengers.size() == 10;
//	}
//
//	@Override
//	public void addPassengers(Customer1 passenger) {
//		this.passengers.add(passenger);
//	}
//
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("Following are the list of passengers in the flight " + number);
//		sb.append("------------------------------------------------------------------\n");
//		for(Customer1 next : passengers)
//		{
//			sb.append(next.getName() + "\n");
//		}
//		
//		return sb.toString();
//	}
//
//	@Override
//	public boolean isRefulled() {
//		
//		return false;
//	}
//
//	public boolean isbRefulled() {
//		return bRefulled;
//	}
//
//	public void setbRefulled(boolean bRefulled) {
//		this.bRefulled = bRefulled;
//	}
//
//	public boolean isbNoEmptySeats() {
//		return bNoEmptySeats;
//	}
//
//	public void setbNoEmptySeats(boolean bNoEmptySeats) {
//		this.bNoEmptySeats = bNoEmptySeats;
//	}
//
//	public String getDestination() {
//		return destination;
//	}
//
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
//
//	@Override
//	public void addSeat() {
//		
//	}
//
//	@Override
//	public void removeSeat() {
//		
//	}
//
//	@Override
//	public void EditSeat(int seatNumber) {
//	
//		
//	}
//
//	@Override
//	public void reserveSeat() {
//		
//		
//	}
//
//	@Override
//	public int getLastSeatNumber() {
//		
//		return 0;
//	}
//
//	@Override
//	public void setLastSeatNumber(int lastSeatNumber) {
//		
//	}
//
//}
