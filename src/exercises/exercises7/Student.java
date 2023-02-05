package exercises.exercises7;

public class Student {

	private String name;
	private int id;
	private double credits, gpa;
	private String firstname, lastname;
	
	

	
	
	public Student(String name, int id, double credits, double gpa) {
		super();
		this.name = name;		
		this.id = id;
		this.credits = credits;
		this.gpa = gpa;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	
	public void submitGrade(double grade, double credits) {
		
		this.gpa = (this.credits*this.gpa + grade*credits)/(this.credits+credits);
		this.credits = this.credits + credits;	
	}
	
	public String getClassStanding() {
		
		if (this.credits<30) {
			
			return "Freshman";
		}
		
		else if (this.credits<60){
			
			return "Sophomore";
		}
		else if (this.credits<90){
			
			return "Junior";
		}
		else {
			
			return "Senior";
		}
		
		
	}
	
	
	public Student createLegacy(Student parent1, Student parent2) {
		this.firstname = parent1.getName();
		this.lastname = parent2.getName();
		this.id = parent1.getId() + parent2.getId();
		this.gpa = parent1.getGpa() + parent2.getGpa();
		this.credits = Math.min(parent1.getCredits(), parent2.getCredits());
		
		String totalname = this.firstname + " " + this.lastname;
		
		return new Student (totalname, this.id, this.credits, this.gpa);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student bob = new Student("bob man", 12345, 0,0);
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


	}

}
