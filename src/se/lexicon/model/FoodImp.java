package se.lexicon.model;

import java.util.Date;

public class FoodImp {
	
	private String foodName;
	private Date serviceTime;
	
	public FoodImp(String foodName, Date serviceTime) {
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

