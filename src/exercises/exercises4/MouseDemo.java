package exercises.exercises4;

import edu.princeton.cs.introcs.StdDraw;

public class MouseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//continuosly report the location of the mouse
		
		while(true) {  //loop forever
		
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		boolean isPressed = StdDraw.mousePressed();
		
		System.out.println("X = " + x + " and Y = " + y);
		System.out.println("Mouse pressed? " + isPressed);
		StdDraw.pause(1000);
		
		
		
		}
	}

}
