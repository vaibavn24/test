package exercises.exercises3;

public class CopyArrayAndPigLatin {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Carole", "David", "Elaine" };
		
		// first copy the above array into an array named copy
		//  Pretend the names array is large
		//  So we cannot just do the following (too much to type):
		//     String[] copy = { names[0], names[1], names[2] };
		//
		
		
		// 
		// Follow the instructions on the web page to check
		// that your copy is correct.  Then cause the copy to store the
		// copied strings in "Pig Latin".  Do this by iteration without
		// assuming the length or contents of the names array.
		//
		
		
		
		String[] copy = new String [names.length];
		
		for (int i=0; i<=names.length-1; ++i) {
			
			copy[i] = names[i];
			
			System.out.println(copy[i]);
		}
		System.out.println();

		
		for (int i=0; i<=names.length-1; ++i) {
			
			copy[i] = names[i] + "ay";
			
			System.out.println(copy[i]);
		}
		
		for (String s : copy) {
			
			
			System.out.println(" copy is " + s);
		}
		
		
		
	}

}
