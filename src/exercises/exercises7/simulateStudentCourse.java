package exercises.exercises7;

public class simulateStudentCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bob = new Student("Bob Marley", 12345, 90, 4);
		Student sally = new Student("Sally Ride", 45613, 90, 4);
		Student john = new Student("John Tyler", 86215, 90, 3);
		Student carter = new Student("Carter Page", 46782, 90, 3);
		Student caroline = new Student("Caroline Kennedy", 89216, 90, 4);
		Student megan = new Student("Megan Fox", 64752, 90, 3.5);
		Student frank = new Student("Frank Sinatra", 49623, 90, 3.5);
		Student charles = new Student("Charles Schwab", 74651, 90, 3.8);


		System.out.println(bob.getGpa());
		System.out.println("Credits " + bob.getCredits());
		System.out.println();
		bob.submitGrade(3.7, 4);
		System.out.println(bob.getGpa());
		System.out.println("Credits " + bob.getCredits());
		System.out.println();
		bob.submitGrade(4, 19);
		System.out.println(bob.getGpa());
		System.out.println("Credits " + bob.getCredits());
		System.out.println(bob.getClassStanding());
		
		
		
		
		Student[] list = {bob, sally, john, carter, caroline, megan};
		
		Course math = new Course("math", 3.0, 100, list);
		System.out.println();

		System.out.println(math.generateRoster());
		System.out.println();

		
		System.out.println(math.addStudent2(bob));
		System.out.println();

		System.out.println(math.addStudent2(sally));
		System.out.println();

		System.out.println(math.addStudent2(john));
		System.out.println();

		System.out.println(math.addStudent2(carter));
		System.out.println();

		System.out.println(math.addStudent2(caroline));
		System.out.println();

		System.out.println(math.addStudent2(megan));
		System.out.println();

		System.out.println(math.addStudent2(frank));
		System.out.println();

		System.out.println(math.addStudent2(charles));
		System.out.println();

		System.out.println(math.generateRoster());
		System.out.println(math.generateRoster2(0));
		System.out.println();

		System.out.println(math.averageGPA());
		System.out.println(math.averageGPA2(0, 0));
		System.out.println();
		
		System.out.println(math.toString());
		System.out.println();

	}

	

}
