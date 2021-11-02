package com.qa.animals;

class Donkey extends Animals implements Speaker {
	 
	 Donkey(String name, int age) {
		 super(name, age, false);
	 }
	 
	 @Override
	 public String makeSound() {
			return "Heee Haaaww";
		}
	 
	 @Override
	 public String speak(String language, int prof) {
		 return "English" + "at a level" + prof + "proficiency";
	 }

	@Override
	public String speak(String language) {
		return "English";
	}
	
	public String toString() {
		return "Donkey [name = " + super.getName() + " , age = " + super.getAge() + "]";
	}
}
