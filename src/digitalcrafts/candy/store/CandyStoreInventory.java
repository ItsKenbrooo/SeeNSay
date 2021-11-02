package digitalcrafts.candy.store;

import digitalcrafts.candy.*;


public class CandyStoreInventory {
		
	private int numOfCandy;
	
	private Candy[] candyInventory; 
	
	
	

	
	public CandyStoreInventory(int numOfCandy) {
		this.numOfCandy = numOfCandy;
	}

	public CandyStoreInventory() {
		
	}

	public Candy[] intializedCandyArray() {
		candyInventory = new Candy[numOfCandy];
		for (int i = 0; i < candyInventory.length; i++) {
			Candy pieces = new Candy();
			candyInventory[i] = pieces;
		}
		return candyInventory;
	}


//TODO the names, grams, and prices of candy.

	public int getNumOfCandy() {
		return numOfCandy;
	}

	public void setNumOfCandy(int numOfCandy) {
		this.numOfCandy = numOfCandy;
	}

	public Candy[] getCandyInventory() {
		return candyInventory;
	}

	public void setCandyInventory(Candy[] candyInventory) {
		this.candyInventory = candyInventory;
	}
		
	
		
}
