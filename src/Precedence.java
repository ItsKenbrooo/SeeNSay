
class Precedence {

	public static void main(String[] args) {
		int myNumber = 21;
		int magic = myNumber + 2;
		magic = ((magic * 2 - 2) / 2 - myNumber) % 1; 
		
		System.out.println(magic);
		
	}

}
