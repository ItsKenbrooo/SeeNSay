
class Vocabulary {
	
		private String[] vocab;
		private String[] define;
	// public static void main(String[] args) throws InterruptedException {
	private void intializingTerms() {

		vocab = new String[] { "Abstraction", "Encapsulation", "Coupling", "Cohesion", "Redundancy", "Dependency",
				"Single responsibility principle", "UML" };
		define = new String[] { "To keep you away from details that would overwhelm.",
				"Internal details hidden from other objects or developers.",
				"What kind of knowledge one class has of another.",
				"An measure of how strongly-related and focused the various responsibilites of a software-module or class are.",
				"An duplication.",
				"A relationship between two or more objects in which an object depends on the other object or objects for its implementation.",
				"That every object should have an single responsibility",
				"A guide graph to use before starting your code" };
	}

	void loopingArrays() throws InterruptedException {
		intializingTerms();
		
		int counter = 0;

		while (counter < 8) {
			System.out.println(vocab[counter]);
			Thread.sleep(2 * 1000);
			System.out.println(define[counter]);
			System.out.println();
			Thread.sleep(2 * 1000);
			counter++;

		}
		counter = 0;
	}

}
