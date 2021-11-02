package com.qa.pethospital;

public class Pet {
																	//REVIEW!!!!!!!!!
	String type;
	String name;
	double age;
	
	
	Pet(String typeIn, String nameIn, double ageIn) {
		this.type = typeIn;
		this.name = nameIn;
		this.age = ageIn;
	}
	
	Pet() {
		
	}

	@Override
	public String toString() {
		return "Pet [type = " + type + ", name = " + name + ", age = " + age + "]";
	}
	
}
