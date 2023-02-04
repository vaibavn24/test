package exercises.exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
//	//
//	The methods you should write:
//
//		-A method that takes in a String and returns that string concatenated with itself. This one is completed for you.
//		-A method that takes in a String and an int n, and returns n copies of the string concatenated together
//		-Now go back and rewrite your first method by having it call the second one.
//		-Take a look at Java’s split method, that splits a String into an array containing the parts split by the specified regular expression.
//	//
//	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {		
	//	return s + s;
	// reduce this to a call to copies
	return selfConcatInt(s,4);
	}
//////////////////////////////////////////////////////////////////////////////////	
	public static String selfConcatInt(String s, int n) {	
//		String concat = "";		
//		for (int i = 0; i<n; ++i) {			
//		 concat = concat + s;
//		}	
//		return concat;
		
		String[] array = new String[n];
		for (int i=0; i<n; ++i) {
			array[i] = s;
		}		
		//each index of array has a copy of s
		return join(array, "");
	}			
//////////////////////////////////////////////////////////////////////////////////	
	public static String join(String[] array, String joiner) {	
		//special case, array is of 0 length
		if(array.length==0) {
			return "";
		}
		
		String ans = array[0];		//collects first array variable
		for (int i =1; i<array.length; ++i) {			//adds on the other strings
			ans = ans + joiner + array[i];			
		}
		return ans;
	}
//////////////////////////////////////////////////////////////////////////////////		
	public static void main(String[] args) {	
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(selfConcatInt("echo", 5));
	
		String s = "I like computer science!";
		String[] words = s.split(" ");
		
		for (String w : words) {
			System.out.println("A word: " + w);
		}		
		System.out.println("Back together: " + join(words, " "));
		
		

	}

}
