import java.util.Random;

class MathHomeworkHelper {

	public static void main(String[] args) {
		MathSolutions m = new MathSolutions();
		System.out.println(m.formulaTings());
		
		Formulas f = new Formulas();
		
		for (String l : f.populateArrayList()) {    //Change arrayList name
			System.out.println(l);																			//trouble calling from ArrayList
		}
		
		Random list = new Random();     //Change list name 
		int randomForms = list.nextInt(5);
		System.out.println();
		System.out.println(f.populateArrayList().get(randomForms));
		System.out.println();
		
		

	}

}
