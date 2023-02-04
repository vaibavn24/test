package exercises.exercises5;

public class debugger2 {

	public static int add(int a, int b) {
		return a + b;
	}
	public static int mpy(int c, int d) {
		int sum = 0;
		for (int i=0; i<d; ++i) {
			sum = add(sum, c);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		
		add(1, mpy(x,y));

	}

}
