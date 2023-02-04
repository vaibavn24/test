package exercises.exercises4;

import edu.princeton.cs.introcs.StdIn;
import support.cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");
		double sum = 0;
		int i = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		while (!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			System.out.println("We saw double " + d);
			if (d >max) {
				max = d;
			}
			
			if (d<min) {
				min = d;
			}
			sum = sum + d;
			++i;
		}
		
		System.out.println("Sum " + sum);
		System.out.println("Average " + sum/i);
		System.out.println("Count " + i);
		System.out.println("Min " + min);
		System.out.println("Max " + max);

		
		
		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
