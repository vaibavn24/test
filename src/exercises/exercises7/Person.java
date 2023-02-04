package exercises.exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors - return the value of an instance variable
 *         Mutators - change by fiat the value of an instance variable
 *         Other
 *
 */
public class Person {   
	
	private int height, age;       //instance variables, "has-a"
	
	public Person(int height) {    //constructor, initializes the values
		this.height = height;
		this.age    = 0;			
	}
	
	public void setHeight(int height) { //mutator - sets by fiat the height with "height"
		this.height = height;			
	}
	
	
	public void happyBirthday() {
		this.age = this.age + 1;	//"other" -- ages the person by one year
	}
	
	public int getHeight() {     //accessor - returns height
		return this.height;
	}
	
	public int getAge() {        //accessor - returns age
		return this.age;
	}
	

}
