package digitalcrafts.candy.store;

import digitalcrafts.candy.Candy;

public class ClientClass {

	public static void main(String[] args) {
		
		Candy names = new Candy();
		names.setCandy("Skittles");
		names.setGrams(1.5);
		names.setPrice(1.19);
		
		System.out.println(names);

		//TODO:
//		Print out all the available candies in the inventory
//		Print out the total cost of available low sugar candies
	}

}
