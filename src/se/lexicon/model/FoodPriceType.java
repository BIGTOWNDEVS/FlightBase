package se.lexicon.model;

public enum FoodPriceType {
ECONOMY_PRICE(5000), BUSINESS_PRICE(20000);
	
	private int price;
	
	private FoodPriceType(int price) {
		this.price = price;
	}
	
	public int getPrice()
	{
		return this.price;
	}
}

