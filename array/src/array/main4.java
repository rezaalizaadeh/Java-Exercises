package array;

import java.util.*;

public class main4 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("rice");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zuchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffe");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.print(groceryList.get(2).get(1));
		//2:15
	}

}
