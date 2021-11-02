package com.qa.pethospital;

import java.util.ArrayList;
import java.util.List;

public class PetHospital {
		 
	private List<Pet> petList;
	
	List<Pet> populateList() {
		petList = new ArrayList<Pet>();
		petList.add(new Pet("Dog", "Max", 4));
		petList.add(new Pet("Cat", "Mary", 6));
		petList.add(new Pet("Dog", "Bentley", 2));
		petList.add(new Pet("Cat", "Lynn", 3));
		return petList;
	}
	
	 void printList() {
		 for (Pet p : petList) {
			 System.out.println(p);
		 }
		
	}
	
	
	
	
	
}
