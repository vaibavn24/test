package exercises.exercises4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Color_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for new Color(r, g, b)  r = red, g = green, b = blue
		//values for each component range from 0 to 255, inclusively
		Color c = new Color(250,250,250);
		StdDraw.setPenColor(c);
		StdDraw.filledSquare(0.5, 0.5, 0.5);
		
		
		
		
	}

}
