package se.lexicon.model;

import java.util.List;

public interface FoodService {

	public void AddToMenu(String foodName);
	public void removeFromMenu(String foodName);
	public List<Food> getMenu();
	public void beforeFoodServed();
	public void ServeFood();
	public void afterFoodServed();
	public void checkFood();
	public void deliverFood();
	public void addOrders(Food food);
	public void removeOrders(Food food);
	public List<Food> getOrderList();
	public void takeFoodOrders();
}
