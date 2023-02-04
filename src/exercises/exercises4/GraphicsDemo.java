package exercises.exercises4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		
		// larger green point
		
		// unfilled red triangle
		
		// yellow circle, filled

		// filled blue rectangle
		
//		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.8, 0.8);
		
		StdDraw.setPenRadius(0.2);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0.1, 0.1, 0.2, 0.1);
		StdDraw.line(0.2, 0.1, 0.15, 0.3);
		StdDraw.line(0.15, 0.3, 0.1, 0.1);
		
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.2, 0.8, 0.1);
		
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.7, 0.25, 0.2, 0.1);
		
		
		
		

	}

}
