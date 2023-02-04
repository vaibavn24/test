package exercises.exercises4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released		
		while (!StdDraw.isMousePressed()) {
			// do nothing wait
		}
		System.out.println("Pressed");

		// here, the mouse has been pressed		
		while (StdDraw.isMousePressed()) {
			// do nothing, wait
		}
		System.out.println("Released");

		// here the mouse is released
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.05);
		
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		StdDraw.point(x, y);
		
		// draw a point at the location of the mouse
		
		
		// here, a q has been typed		
		
		
		char gotKey = ' ';	
		while(gotKey != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
			//wait
		}	
		
		 gotKey =StdDraw.nextKeyTyped();
		//here, a q has been typed
		}
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

						
			
		
	

}
