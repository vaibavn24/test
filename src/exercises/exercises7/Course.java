package exercises.exercises7;

public class Course {

	

	private String name;
	private double credits, gpa;
	private int seats;
	private Student[] roster = new Student[seats];
	private int studentCount;
	
	
	
	public Course(String name, double credits, int seats, Student[] roster) {
		
		
		
	
		
		
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.roster = roster;
		this.studentCount = roster.length;
		
		System.out.println(studentCount);
		System.out.println(seats);
		System.out.println(this.roster.length);
		
		
		
//  this shows the problem, the roster decreases back to 4 instead of remaining at size 6

	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//-------------------------------------------------------------

	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	//-------------------------------------------------------------

	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	//-------------------------------------------------------------

	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	//-------------------------------------------------------------

	public Student[] getRoster() {
		return roster;
	}
	public void setRoster(Student[] roster) {
		this.roster = roster;
	}
	//-------------------------------------------------------------
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}



	public boolean addStudent(Student student) {	
		if (studentCount>=seats) {		
			return false;
		}	
		else {
	for (int i = 0; i < studentCount; ++i ) {
			if (roster[i].getId()==student.getId()) {
				System.out.println(student.getName());
				System.out.println("duplicate");
				roster[i] = roster[i];
				return false;				
			}		
		}
		
		Student[] newRoster = new Student[studentCount+1];		
		for (int i = 0; i<studentCount; ++i) {	
			newRoster[i] = roster[i];		
		}
		
		newRoster[studentCount] = student;
		roster = newRoster;
		studentCount++;	
		return true;
		
		}
	
	}
	
	public boolean addStudent2(Student student) {	
		if (studentCount >= seats) {
		    return false;
		  } // i understand this part above

		  for (int i = 0; i < studentCount; i++) { // i understand this
		    if (roster[i].getId() == student.getId()) { // i understand this
				System.out.println(student.getName());
		    	System.out.println("duplicate");

		      return false; // i understand this
		    }
		  }

		  Student[] newRoster = new Student[studentCount + 1]; //declare new array with space for one more
		  for (int i = 0; i < studentCount; i++) {
		    newRoster[i] = roster[i]; //iterate through old array to transfer its contents to new array
		  }
		  newRoster[studentCount] = student;  // then fill in the last position of the array
		  roster = newRoster; // reassign roster array to be the new array
		  studentCount++; //increase the student count to reflect this addition
		  System.out.println(studentCount);
		  return true;
	
	}
	
	/* addStudent2
	 * This code block is used to add a new student object to the roster array. Here's what it does step by step:

Declare a new array named newRoster with size studentCount + 1. This is because we need to add a new student to the roster, so we need to increase the size of the roster.

Copy the elements from the original roster array to the newRoster array.

Add the new student object to the end of the newRoster array.

Reassign the reference of the roster array to the reference of the newRoster array. This makes the roster array refer to the updated array that contains the new student.

Increment the value of studentCount by 1 to reflect the addition of a new student.

Return true to indicate that the student was added successfully.
	 */
	
	
	public String generateRoster() {	

	//	 String [] a = new String[studentCount];
			String b = "";
	        for (int i = 0; i < studentCount; i++) {           
	        	b = b + roster[i].getName() + "     ";	        	
	        }        
	        return b;
	}
	
	public String generateRoster2(int index) { // using recursion...
		  if (index == studentCount) {
		    return "";
		  }
		  return roster[index].getName() + "     " + generateRoster2(index + 1);
		}
	
	
	public double averageGPA() {		
		double gpaCollect = 0;		
		for (int i = 0; i<studentCount;i++) {			
			gpaCollect = gpaCollect + roster[i].getGpa();
		}		
		return gpaCollect/studentCount;
	}
	
	public double averageGPA2(int index, double sum) { // using recursion...
		  if (index == studentCount) {
		    return sum / studentCount;
		  }
		  return averageGPA2(index + 1, sum + roster[index].getGpa());
		}
	
	
	public String toString() {		
		String info = "";	
		info = "Course name is " + getName() + " and number of credits is " + getCredits();	
		return info;
	}
	}	

