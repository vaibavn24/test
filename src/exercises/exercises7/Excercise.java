package exercises.exercises7;

public class Excercise {

	
	//has a
	// weight  int
	// number of reps  int
	// name  String
	
	private int weight;
	private int numReps;
	private String name;
	
	public Excercise(int weight, int numReps, String name) {
		super();
		this.weight = weight;
		this.numReps = numReps;
		this.name = name;
	}
	
	public int getWorkDone() {
		
		return this.weight * this.numReps;
	}
	
}
