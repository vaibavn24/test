package exercises.exercises4;

import edu.princeton.cs.introcs.StdDraw;

public class KeyboardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// did user type key?
		//
		//while there is no key typed, do nothing
		
		while (!StdDraw.hasNextKeyTyped()) {
			// do nothing
		//	System.out.println("No, not yet");
			//but don't spin tightly, pause
			StdDraw.pause(100);
		}
		
		char got = StdDraw.nextKeyTyped();
		
		if(got=='y') {
			System.out.println("Yes");
		}
		
		else if (got=='n') {
			System.out.println("No");
		}
		else {
		System.out.println("What?");
		}
		
		
	}

}
