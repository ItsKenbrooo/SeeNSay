package digitalcrafts.candy;

import java.io.Serializable;

public class Candy implements Serializable {
	
	private String candy;
	private double price;
	private double grams;
	
	
	
	
	public Candy(String candyIn, double priceIn, double gramsIn) {
		this(candyIn, priceIn);
		this.grams = gramsIn;
	}


	public Candy(String candyIn, double priceIn) {
		this(candyIn);
		this.price = priceIn;
	}


	public Candy(String candyIn) {
		this.candy = candyIn;
	}


	public Candy() {
		
	}
	
	
	public String getCandy() {
		return candy;
	}
	public void setCandy(String candy) {
		this.candy = candy;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getGrams() {
		return grams;
	}
	public void setGrams(double grams) {
		this.grams = grams;
	}
	 public String toString() {
		 return getCandy() + " " + getPrice() + " " + getGrams();
	 }
	
	
	
	
	
	
}
