package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class AirlineServiceImp1 implements AirlineService1 {

	private List<Airline1> airlineList = new ArrayList<Airline1>();
	
	@Override
	public void add(Airline1 airline) {
		
		if(!airlineList.contains(airline))
			airlineList.add(airline);
		else
			System.out.println("Airline is already registered");
	}

	@Override
	public List<Airline1> getAirlines() {
		
		return airlineList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		System.out.println("[Choose from list of airlines:]");
		for(Airline1 next : airlineList) {
			sb.append(++count + " )");
			sb.append(next.getName() + "\n");
		}

		return sb.toString();
	}
	
	

}
