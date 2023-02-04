package testing;

public class Factorial {

	//modeled after the code from slides
	public static int factorial (int n) {
		if (n<=0) {
			return 1;	//mistake!
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
