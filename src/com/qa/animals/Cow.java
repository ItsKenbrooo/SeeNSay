package com.qa.animals;

public class Cow extends Animals{
		
		
		private boolean dairy;
		
		
		
		public Cow(String name, int age, boolean carnivorous, boolean dairy) {
			super(name, age, carnivorous);
			this.dairy = dairy;
			
		}
		
		public Cow(int age, boolean carnivorous, boolean dairy) {
			super(age, carnivorous);
			this.dairy = dairy;
			
		}
		 
		
		@Override
		public String makeSound() {
			return "Mooooo";
		}

		@Override
		public String toString() {
			return "Cow [name = " + super.getName() + " , age = " + super.getAge() + " , carnivorous = " + super.isCarnivorous() +  " , dairy = " + dairy + "]";
		}

		
		

		
		
		
		
		
		
}
