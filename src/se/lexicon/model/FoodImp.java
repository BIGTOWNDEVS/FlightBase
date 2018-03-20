package se.lexicon.model;


public class FoodImp implements Food{

	private String foodName;
	private int price;
	private FoodType foodType;
	
//	private Date serviceTime;
	@Override
	public String getName() {
		
		return this.foodName;
	}

	@Override
	public int getPrice() {
		
		return this.price;
	}

	public FoodImp(String foodName, int price, FoodType foodType) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.foodType = foodType;
	}

	@Override
	public FoodType getFoodType() {
		
		return this.foodType;
	}

	@Override
	public String toString() {
		return "FoodImp [foodName=" + foodName + ", price=" + price + ", foodType=" + foodType + "]";
	}
}

