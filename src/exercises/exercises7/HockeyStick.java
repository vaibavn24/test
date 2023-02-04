package exercises.exercises7;

public class HockeyStick {

	//has-a's
	
	//brand String
	//flex	int
	//  shaft weight double
	// 	blade weight double
	
	private String brand;
	private int flex;
	private double sweight,bweight;
	private int numGoals;
	
	// what information should the constructor take in?
	// all attributes are of interest to you
	
	// Source/Generate constructor using fields/select all fields
	
	public HockeyStick(String brand, int flex, double sweight, double bweight) {
		this.brand = brand;
		this.flex = flex;
		this.sweight = sweight;
		this.bweight = bweight;
		this.numGoals = 0;
	} 
	
	// would you use a getter or setter for flex? getter
	public int getFlex() {
		return flex;
	}
	
	public double getWeight() {
		return this.bweight + this.sweight;
	}
	public void recordGoal() {
		this.numGoals = this.numGoals + 1;
	}

	public int getNumGoals() {
		return numGoals;
	}
	
	public String toString() {
		return "Stick has recorded " + this.numGoals + " goals";
	}

}
