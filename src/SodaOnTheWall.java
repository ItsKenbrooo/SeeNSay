
class SodaOnTheWall {
	
	private String soda;
	private String bottles;
	private String pass;
	private String wall;
	private int zero;
	private String noBottles;
	private String noSoda;
	private String store;
	
	public void printLyric() {
		
		for (int i = 99; i >= 0; i-- ) {
			
			
			if (i == 0) {
				System.out.println(getNoBottles());
				System.out.println(getNoSoda());
			}	else {
				System.out.println(i + getSoda());
				
			}
			
			
			
		}
	}
	
	
	
	public String getSoda() {
		return soda;
	}
	public void setSoda(String soda) {
		this.soda = soda;
	}
	public String getBottles() {
		return bottles;
	}
	public void setBottles(String bottles) {
		this.bottles = bottles;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public int getZero() {
		return zero;
	}
	public void setZero(int zero) {
		this.zero = zero;
	}
	public String getNoBottles() {
		return noBottles;
	}
	public void setNoBottles(String noBottles) {
		this.noBottles = noBottles;
	}
	public String getNoSoda() {
		return noSoda;
	}
	public void setNoSoda(String noSoda) {
		this.noSoda = noSoda;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	
}
