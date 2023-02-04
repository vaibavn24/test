package exercises.exercises6;

public class Factorial {

	
	
	//modeled after the code from slides
	public static int factorial(int n) {
		
		if (n <= 0) {
			
			return 1; 
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	
}
