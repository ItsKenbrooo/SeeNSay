package com.qa.animals;
abstract class Animals {
		
		private String name = "unknown";
		private int age;
		private boolean carnivorous;
		
		public Animals(String name, int age, boolean carnivorous) {
			this(age, carnivorous);
			this.name = name;
			
			
		}

		public Animals(int age, boolean carnivorous) {
			this.age = age;
			this.carnivorous = carnivorous;
		}
		
		abstract String makeSound(); 
		
		String sleep() {
			return "All animals sleep the same";
		}
		
		String walk() {
			return new Move().walk();
		}

		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}

		public boolean isCarnivorous() {
			return carnivorous;
		}

		@Override
		public String toString() {
			return "Animals [name = " + name + ", age = " + age + ", carnivorous = " + carnivorous + "]";
		}

		
		
		
		
		
		
		
		
}

