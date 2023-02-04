package exercises.exercises5;

public class Method_Syntax {

	public static int mpy(int c, int d) {
		int sum = 0;
		for (int i = 0; i < d; ++i) {
			sum = sum + c;
		}
		return sum;
	}

	public static int mpy1(int c, int d) {
		if (d < 0)
			return 0;
		int sum = 0;
		for (int i = 0; i < d; ++i) {
			sum = sum + c;
		}
		return sum;
	}

	public static int doubleIt(int in) {
		return mpy(in, 2);
	}

	public static String twoDigs(double d) {
		int t100 = (int) (d * 100);
		double result = t100 / 100.0;
		return "" + result;
	}

	public static void main(String[] args) {
		int x = mpy(2, 5);
		System.out.println(x);
		int y = doubleIt(x);
		System.out.println(y);

	}

}
