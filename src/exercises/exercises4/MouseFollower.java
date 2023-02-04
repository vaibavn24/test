package exercises.exercises4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.ArgsProcessor;

public class MouseFollower {

	public static void main(String[] args) {
		
		StdDraw.enableDoubleBuffering();
		double x = 0.0;
		double y = 0.0;

		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much history?");
		StdDraw.setPenColor(Color.MAGENTA);
		
		//let's keep a history of where the mouse has been
		double[] histX = new double[N];
		double[] histY = new double[N];		
		int cur = 0;		
		//this is a standard form for an animated program!
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			x = StdDraw.mouseX();
			y = StdDraw.mouseY();			
			//history
			//cur is where the current values go
			histX[cur] = x;
			histY[cur] = y;
			cur = cur + 1;			
			//reset to 0 of we have used up the whole array
			if (cur>=histX.length) {
				cur = 0;
			}			
			int oldest = cur;			
			StdDraw.filledCircle(histX[oldest], histY[oldest], 0.05);
			//  
			// End of your frame
			//
			// Stdraw.show() achieves double buffering and
			//   the pause(10) avoids the tight spinning loop
			StdDraw.show();
			StdDraw.pause(10);
		}

	}

}
