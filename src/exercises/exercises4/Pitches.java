package exercises.exercises4;

import support.cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A

		ArgsProcessor ap = new ArgsProcessor(args);
		int pitch1 = ap.nextInt("What is the pitch for #1?");
		int pitch2 = ap.nextInt("What is the pitch for #2?");

		
		
		double frequency1 = 440*Math.pow(2, pitch1/12.0);
		System.out.println("For pitch " + pitch1 + " we get " + frequency1);
		
		double frequency2 = 440*Math.pow(2, (pitch2)/12.0);
		System.out.println("For pitch " + pitch2 + " we get " +frequency2);

		double ratio = frequency2/frequency1;		
		System.out.println("Ratio is " + ratio);

	}

}
