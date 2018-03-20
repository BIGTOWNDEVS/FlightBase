package se.lexicon.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodServiceImp implements FoodService {

	private List<Food> foodService = new ArrayList<Food>();
	private List<String> foodMenu = new ArrayList<String>();
	private List<Customers> customerList = new ArrayList<Customer>();
//	private Scanner sc = new Scanner(System.in);
	
	public FoodServiceImp(List<Customer> customerList) {
		Food food = null;
		System.out.println("Hosteses have got passengers order for the food ... ");
		for(Customer nextCustomer : customerList) {
			if(nextCustomer.ticket.FoodType == FoodType.ECONOMY) {
				food = new FoodImp("Sandwitch", 100, FoodType.ECONOMY);
			}
			else {
				food = new FoodImp("Stake", 200, FoodType.BUSINESS);
			}

			foodService.add(food);
		}
	}
	
	@Override
	public void AddToMenu(Food food) {
		

	}

	@Override
	public void removeFromMenu(Food food) {
		

	}

	@Override
	public List<Food> getMenu() {
		
		return null;
	}

	@Override
	public void beforeFoodServed() {
		System.out.println("Hosteses prepare food to be served in the flight...");

	}

	@Override
	public void ServeFood() {
		
		System.out.println("Hostesses is serving the food to the passengers in the flight...");
		for(Food nextFood : foodService) {
			nextFood
		}
	}

	@Override
	public void afterFoodServed() {
		

	}

	@Override
	public void checkFood() {
		

	}

	@Override
	public void deliverFood() {
		

	}

}
