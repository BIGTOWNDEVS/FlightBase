package se.lexicon.model;


import java.util.ArrayList;
import java.util.List;

public class FoodServiceImp implements FoodService {

	private List<Food> foodService = new ArrayList<Food>();
	private static List<String> foodMenu = new ArrayList<String>();
	private List<Reservation1> reservationList = new ArrayList<Reservation1>();
	private List<Integer> seatList = new ArrayList<Integer>();
	
	public static void initFoodMenu() {
		foodMenu.add("RossBiff Sandwitch");
		foodMenu.add("Stake");
	}
	public FoodServiceImp(List<Reservation1> reservationList) {
		
		Food food = null;
		System.out.println("Hosteses have got passengers order for the food ... ");
		initFoodMenu();
		for(Reservation1 nextReservation : reservationList) {
			if(nextReservation.getTicket().getFoodType() == FoodType.ECONOMY) {
				food = new FoodImp(foodMenu.get(0), 100, FoodType.ECONOMY);
			}
			else {
				food = new FoodImp(foodMenu.get(1), 400, FoodType.BUSINESS);
			}

			foodService.add(food);
			seatList.add(nextReservation.getTicket().getSeatNumber());
		}
	}
	
	@Override
	public void AddToMenu(String food) {
		foodMenu.add(food);

	}

	@Override
	public void removeFromMenu(String food) {
		if(foodMenu.contains(food)) {
			foodMenu.remove(food);			
		}
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
		this.toString();
//		for(int i = 0; i < foodService.size(); i++) {
//			System.out.println(foodService.get(i).toString() + "is serverd to "  + seatList.get(i).toString());
//		}
	}

	@Override
	public void afterFoodServed() {
		System.out.println("The pasenges are happy with the food service ...");
	}

	@Override
	public void checkFood() {
		System.out.println("Airline checkout all the food items...");

	}

	@Override
	public void deliverFood() {
		System.out.println("Food delivered to the airplane by catering company ...");

	}

	@Override
	public void addOrders(Food food) {
		foodService.add(food);
		
	}

	@Override
	public void removeOrders(Food food) {
		foodService.remove(food);
		
	}

	@Override
	public List<Food> getOrderList() {
		
		return foodService;
	}

	@Override
	public void takeFoodOrders() {
		
		for(Reservation1 nextReservation : reservationList)
		{
			if(nextReservation.getTicket().getFoodType() == FoodType.ECONOMY) {
			this.addOrders(new FoodImp(foodMenu.get(0), 100, FoodType.ECONOMY));
			}
			else {
				this.addOrders(new FoodImp(foodMenu.get(1), 400, FoodType.BUSINESS));
			}
		}
		
		return;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < foodService.size(); i++) {
			sb.append(foodService.get(i).toString());
			sb.append( "is serverd to " );
			sb.append(seatList.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}

}
