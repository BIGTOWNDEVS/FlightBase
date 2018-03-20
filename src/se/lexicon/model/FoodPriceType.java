package se.lexicon.model;

public enum FoodPriceType {
ECONOMY_PRICE(100), BUSINESS_PRICE(500);
	
	private int price;
	
	private FoodPriceType(int price) {
		this.price = price;
	}
	
	public int getPrice()
	{
		return this.price;
	}
}

