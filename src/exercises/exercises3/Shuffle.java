package exercises.exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};
		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
		System.out.println();
		String [] shuffled = new String[original.length];
		
		for (int i=shuffled.length-1; i >=0; --i) {
	//		System.out.println(i);
			int c = (int) (Math.random() * (i+1));
	//		System.out.println(c);

	// by counting i down, you are preventing repeats of the value c
			
			shuffled[i] = original[c];	
			
//			System.out.println(shuffled[0]);
//			System.out.println(shuffled[1]);
//			System.out.println(shuffled[2]);
//			System.out.println(shuffled[3]);
//			System.out.println(shuffled[4]);
//			System.out.println(shuffled[5]);
//			System.out.println(shuffled[6]);
//			System.out.println(shuffled[7]);
//			System.out.println();
//	


			//move all the cards up from c+1 to length-1
			
			for (int j=c; j < shuffled.length-1; ++j) {
				original[j] = original [j+1];
				
//				System.out.println(original[0]);
//				System.out.println(original[1]);
//				System.out.println(original[2]);
//				System.out.println(original[3]);
//				System.out.println(original[4]);
//				System.out.println(original[5]);
//				System.out.println(original[6]);
//				System.out.println(original[7]);
//				System.out.println();
//				System.out.println();
//				System.out.println();
//				System.out.println();
			}
		
			
		}
		
		for (int i=0; i<shuffled.length; ++i) {
			System.out.println("Shuffled at " + i + " is " + shuffled[i]);

		}
		
		
		
		
		
		
		
		
		
		
		
		String[] original2 = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};
		

		
		
		
		System.out.println();
		for (int i = original2.length-1; i>=0; --i) {
			int c = (int) (Math.random()*(i+1));
			String t = original2[i];
			original2[i] = original2[c];
			original2[c] =t;
			
			System.out.println(i+" " + c);

		
		}
		
//	for (int i=0; i<original.length; ++i) {
//		System.out.println("Shuffled at " + i +" is " + shuffled[i]);
//	}
	System.out.println();
	for (int i=0; i<original2.length; ++i) {
		System.out.println("Now original at " + i +" is " + original2[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//

	}
	
}