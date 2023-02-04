package exercises.exercises6;

public class Lesson_Finding_Recursive_Substructure {
	
	
	
	
	
	// Example
	// sum(n) = 0 + 1 + ... + n
	
	// Think of sum(n) function as a generator of the expression
	// you see on the right
	
	// Believe that sum(n) really generates such an expression
	
	// sum(4) = 0 + 1 + 2 + 3 + 4
	// sum(3) = 0 + 1 + 2 + 3 + 4
	
	// sum(4) = ** sum(3) ** + 4
	
	// We see a smaller example of the expression itself
	
	
	// Where is the recursive substructure?
	
	// sum (n) = 0 + 1 + ... + n
	
	// sum (n) = sum (n-1) + n
	
	// now we have an explicitly recursive formula
	
	// but it is missing a base case
	
	//what is the smallest example of sum(n)?
	
	// sum(n) = 0 , if n ==0
	// sum(n) = sum(n-1) + n, otherwise
	
	
	// Thus,
	
	private static int sum(int n) {
		if (n==0) {
			return 0;
		}
		else
			return sum(n-1) + n;
	}
	
	
	
	// Why does the following substructure not work?
	
	// sum(n) = 0 + ** 1 + 2 + ... + (n-1) + n **
	
	// boxed expression is sum(n) - 0
	
	
	// Leads to:
	// sum(n) = 0 + sum(n) - 0

	//This is true, mathematically
	// But it does not lead to a simpler use of the sum function
	
	
	//We must find a SMALLER instance of the function

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
	}
	
	
	//Visual Recursion and base cases
	
	
	// box of cacao and newspaper
	
	
	
	

}
