package exercises.exercises6;

import edu.princeton.cs.introcs.StdDraw;

public class Circles2u {

	
	/**
	 * Recursive draw circles
	 * 		Each centered at (0.5, 0.5)
	 * 		Each has a radius 90% of its outer circle's radius
	 * 		All drawn circles of radii of at least 0.01
	 * @param r
	 */
	
	
	
	
	//pascal's triangle white
	// go to smallest triangle we are willing to consider (three black triangles
	
	public static void circles(double r) {
		
		
		if (r<0.07) {
			return; // base case, simply return
		}
		
		StdDraw.circle(0.5, 0.5, r);
		StdDraw.pause(500);
		circles(0.9*r);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdDraw.setPenRadius(0.004);
		circles(0.5);
		
	}

}
