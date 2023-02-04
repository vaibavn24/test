package exercises.exercises6;

public class explicitRecursion {

	public static int factorial(int n) {
		if (n <= 0) {  //base case
			return 1;
		}
		else {
			return n * factorial(n - 1); //factorial call, we're using the result to feed into the method again
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
