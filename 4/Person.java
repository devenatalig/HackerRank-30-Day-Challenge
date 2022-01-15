class Person {
	//Instance variable for Person's age
	int age;
	//Constructor that takes age as an int
	public Person(int initialAge) {
				// Add some more code to run some checks on initialAge
				//Sets age to zero if initalAge < 0
				if (initialAge < 0) {
					this.age = 0;
					System.out.println("Age is not valid, setting age to 0.");
				} else {
					this.age = initialAge;
				}
		}
	
		public void amIOld() {
				// Write code determining if this person's age is old and print the correct statement:
				if (this.age < 13) System.out.println("You are young.");
				else if (this.age >= 13 && this.age < 18) System.out.println("You are a teenager.");
				else System.out.println("You are old.");
		}
	
		public void yearPasses() {
				// Increment this person's age.
				this.age++;
		}
	
	public static void main(String[] args) {
		Person a = new Person(-1); //"Age is not valid, setting age to 0."
		Person b = new Person(10);
		b.amIOld(); //"You are young"
		Person c = new Person(13); 
		c.amIOld(); //"You are a teenager"
		Person d = new Person(30);
		d.amIOld(); //"You are old"
		Person e = new Person(17);
		e.yearPasses();
		e.amIOld(); //"You are old"
	}
}