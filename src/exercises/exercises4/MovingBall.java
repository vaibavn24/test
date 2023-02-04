package exercises.exercises4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class MovingBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//ball to move across the screen
		//when it reaches the right side
		//      start over at the left side
		
		
		
		// need to represented the current x location
		// of the ball
		
		double ballX = 0.0;
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.setPenRadius(0.05);
		
		//this is a standard form for an animated program!
		while(true) {
			//clear the canvas
			StdDraw.clear();
			
			ballX = ballX + 0.005;
			if (ballX>1.0) { //moved too far right
				ballX = 0;   // start again at left
			}
			StdDraw.point(ballX, 0.5);
			StdDraw.show(10);
		}
		
		
		
	}

}
