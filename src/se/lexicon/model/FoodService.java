package se.lexicon.model;

import java.util.List;

public interface FoodService {

	public void AddToMenu(Food food);
	public void removeFromMenu(Food food);
	public List<Food> getMenu();
	public void beforeFoodServed();
	public void ServeFood();
	public void afterFoodServed();
	public void checkFood();
	public void deliverFood();
}
