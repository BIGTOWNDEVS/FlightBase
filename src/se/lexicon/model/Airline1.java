package se.lexicon.model;

import java.util.List;

import se.lexicon.exception.NumberOfAirlineExpandsException;

public interface Airline1 {
	
	public 	String getName();
	public  int getAirlineIncome();
	public void add(Ticket ticket);
	public void addAirplane(Airplane1 airplane) throws NumberOfAirlineExpandsException;
	public List<Airplane1> getAirplaneList();
	public boolean isbExpand();
	public void setbExpand(boolean bExpand);
}
