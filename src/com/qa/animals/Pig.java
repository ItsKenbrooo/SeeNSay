package com.qa.animals;

class Pig extends Animals implements Fly {
		
		Pig(String name, int age, boolean carnivorous) {
			super(name, age, carnivorous);
		}
	
		public String makeSound() {
			return "Oink Oink";
		}
		
		@Override
		public String fly() {
			return "I can fly";
		}
		
		public String toString() {
			return "Cow [name = " + super.getName() + " , age = " + super.getAge() + " , carnivorous = " + super.isCarnivorous() + "]";
		}
		
}
