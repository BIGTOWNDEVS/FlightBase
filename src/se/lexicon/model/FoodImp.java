package se.lexicon.model;

import java.util.Date;

public class Food {
	
	private String foodName;
	private Date serviceTime;
	
	public Food(String foodName, Date serviceTime) {
		super();
		this.foodName = foodName;
		this.serviceTime = serviceTime;
	}

	public String getFoodName() {
		return foodName;
	}

	public Date getServiceTime() {
		return serviceTime;
	}
}

