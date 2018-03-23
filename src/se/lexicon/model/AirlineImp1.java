package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

import se.lexicon.exception.NumberOfAirlineExpandsException;

public class AirlineImp1 implements Airline1 {
	
	private List<Ticket> ticketList = new ArrayList<Ticket>();
	private List<Airplane1> airplaneList = new ArrayList<Airplane1>();

	private String name;
	private int income;
	private boolean bExpand;
	
	public AirlineImp1(List<Ticket> ticketList, List<Airplane1> airplaneList, String name, int income,
			boolean bExpand) {
		super();
		this.ticketList = ticketList;
		this.airplaneList = airplaneList;
		this.name = name;
		this.income = income;
		this.bExpand = bExpand;
	}

	public AirlineImp1(String name) {
		super();
		this.name = name;
		this.income = 0;
	}
	
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Airline " + name + " has income = " + (this.getAirlineIncome() * 0.3));
		
		return sb.toString();
	}

	@Override
	public int getAirlineIncome() {
		for(Ticket next : ticketList)
		{
			System.out.println("price is : " + next.getPrice());
			this.income = this.income + next.getPrice();
			
			if(next.getFoodType() == FoodType.BUSINESS)
				this.income = this.income + 400;
			else
				this.income = this.income + 100;
		}
		
		return this.income;
	}

	@Override
	public void add(Ticket ticket) {
		ticketList.add(ticket);
		
	}

	@Override
	public List<Airplane1> getAirplaneList() {
		
		return airplaneList;
	}

	@Override
	public void addAirplane(Airplane1 airplane) throws NumberOfAirlineExpandsException {
		if(this.bExpand)
			airplaneList.add(airplane);
		else
		{
			throw new NumberOfAirlineExpandsException();
		}
	}

	@Override
	public boolean isbExpand() {
		
		return this.bExpand;
	}

	@Override
	public void setbExpand(boolean bExpand) {
		this.bExpand = bExpand;
		
	}
	
	
}
