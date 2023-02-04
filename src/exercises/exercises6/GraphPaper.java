package exercises.exercises6;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class GraphPaper {
	
	/**
	 * Process one layer of the graph paper
	 * @param llx lower-left-hand corner x coordinate
	 * @param lly lower-left-hand corner y coordinate
	 * @param size length and height of the current square
	 */
	public static void gp(double llx, double lly, double size) {
		// base case, stop when the size is sufficiently small
		if (size < .05) {
			return;  // abandon recursion
		}
		// draw one horizontal and one vertical line to quadrisect
		//  the square (divide into 4 portions). Your code goes
		//  below here:
		//
		
		StdDraw.line(llx, lly+size/2, llx+size, lly + size/2);
		StdDraw.line(llx+size/2, lly, llx+size/2, lly + size);

		
		// 
		// Now, after you have drown athose two lines,
		// let's pause to accentuate the recursive drama
		//
		StdDraw.pause(1);
		//
		//
		// Now recursively consider the
		//   lower left, uppert left, upper right, lower right
		//   subcases
		//   Your code for those subcases should go below here:
		//
		
		//lower left
		gp(llx, lly, size/2);
		
		//upper left
		gp(llx, lly+size/2, size/2);

		//upper right
		gp(llx+size/2, lly+size/2, size/2);

		//lower right
		gp(llx+size/2, lly, size/2);

		
	}

	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		// 
		// Once you get things working, you an uncomment the two
		//   calls below to StdDraw.show
		//   and that will speed up what you see greatly
		//
		StdDraw.show(10);  // don't show anything
		gp(0, 0, 1);
		StdDraw.show(10);  // until now

	}

}
