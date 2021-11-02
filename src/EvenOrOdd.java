
class EvenOrOdd {

	public static void main(String[] args) {
		int myNumber = 0;
		
		if (myNumber % 2 == 0) {
			System.out.println("myNumber is Even!");
		}
		
		else {
			System.out.println("myNumber is Odd!");
		}
		
		int myNumber1 = 0;
//		boolean boo1 = (myNumber1 % 2 == 0); //this boolean expression is evenly divisible by 2
//		boolean boo2 = (myNumber1 % 2 != 0); // this boolean is not!!!!!
//		
//			System.out.println(boo1 + "   " + "myNumber1 is Even!");
//			System.out.println(boo2 + "   " + "myNumber1 is Odd!");
			
		String ternary = (myNumber1 % 2 == 0)? "myNumber1 is Even!": "myNumber1 is Odd!";
			System.out.println(ternary);
		
		
		

	}

}
