package exercises.exercises6;

public class Substructure {
	
	
	// sum(n) = n + (n-1) + (n-2) + ... + 0
	
	//where can you find a smaller example of sum?
	///////(n-1) + (n-2) + ... + 0
	
	// sum(n) = n + sum(n-1)
	/////we need to find a way to stop it at zero
	
	//////////sum(0) = 0 

	
	
	//mpy(x,y) = x + x + ..... + x
	//			----------------
	//				y times
	
	// where do you see a smaller example of multiplication that's slightly smaller than the one here?
	//               x + ..... + x    everything after the first x
	//how many x's show up in the highlighted portion? 
	//// y-1
	// so what would the two parameters of mpy be in recursive call?
	//
	// mpy(x,y) = x + mpy(x, y-1)
	//                ----------
	//                   y times
	//mpy(x,0) = 0
	
	

	
	
	
	//	let's find substructure in pictures
	
	
	// see circle, if you had a program to draw circle, where in this diagram is the next smaller example?
	/////the smaller circles would be a smaller instance, everything except the outer circle
	
	// diagram consists of a recursive specification of a single circle followed by a recursive call of a picture with
	// a smaller diameter
	
	// Let's look at Circles2u
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
