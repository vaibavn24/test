package exercises.exercises7;

public class State {
	

	
	private String name;
	private int ev,voters;
	private double lean;
	
	public State(String name, int ev, int voters, double lean) {
		this.name = name;
		this.ev = ev;
		this.voters = voters;
		this.lean = lean;
	}
	
	public int getEv() {
		return this.ev;
	}
	
	public double getRandomNumber(double min, double max) {
	    return (double) ((Math.random() * (max - min)) + min);
	}
	
	public boolean simStateResults(String state) {
	    // initialize variables to store candidate votes and percentages
		   
	    int bidenVotes = 0;
	    int trumpVotes = 0;
	    double bidenPercentage = 0;
	    double trumpPercentage = 0;
	    // simulate state results
	    
	    //simulate how each vote goes
	    for (int i = 0; i < voters; i++) {
	        if (getRandomNumber(0.0, 2.0)*lean < 50) {
	            bidenVotes++;
	        } else {
	            trumpVotes++;
	        }
	    }
	    //once votes are simulated, introduce variance in them as the above loop just gives a 50-50 result
	    
	    //this introduces variance in the election results
	    bidenVotes = (int) (bidenVotes * getRandomNumber(0.95, 1.05));
	    trumpVotes = (int) (trumpVotes * getRandomNumber(0.95, 1.05));
	    
	    int totalVotes = bidenVotes + trumpVotes;
	    
	    
	    // calculate candidate percentages
	    bidenPercentage = (double) bidenVotes / totalVotes * 100;
	    trumpPercentage = (double) trumpVotes / totalVotes * 100;
	    // determine state winner
//	     
//	    System.out.println("Results for " + state + ":");
//	    System.out.println("Joe Biden: " + bidenVotes + " " + bidenPercentage +"%");
//	    System.out.println("Donald Trump: " + trumpVotes + " " + trumpPercentage +"%");
//	    System.out.println();
//	    System.out.println("-----------------------------------");
//	    System.out.println();
	    if (bidenPercentage > trumpPercentage) {
	        return true;
	    } else {
	        return false;
	    } 
	}
	
	
	
	
	

	
}
