package se.lexicon.model;

public class CustomerImp1 implements Customer1 {

	private int Id;
	private String name;
	
	@Override
	public int getId() {
		
		return this.Id;
	}

	@Override
	public String getName() {
		
		return this.name;
	}

}
