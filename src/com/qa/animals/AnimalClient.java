package com.qa.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnimalClient {
	
	enum AnimalSounds {
		OINK, HEEHAW, MOO;
	}
	//private static Animals[] myAnimals = new Animals[3];
	
	public static void main(String[] args) {
		
	
		Count cd = new Count();
		Sheep counted = new Sheep(2, 5, 10);
		
		Counter sheepCounting = (c) -> {
			double count = 0;
			double countByTwo = c.getTwos();
			double countByFive = c.getFives();
			double countByTen = c.getTens();
			
			count = countByTwo + 2;
			
			return count;
			
			
		};
	
	    System.out.println(cd.calculateTotalCount(counted, sheepCounting));
	}
}


//		AnimalClient animalClient = new AnimalClient();
//		
//		animalClient.yourName();
//		
//		
//	}
//
//	private void yourName() {
//		for (int i = 0; i < myAnimals.length; i++ ) {
//				System.out.println(myAnimals[i].getName());
//		}
//		
//	}
	