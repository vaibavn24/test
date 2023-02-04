package exercises.exercises5;

public class investmentRemastered {

	
	public static double investment2(double s, double y, int c, int d) {
		
		if (c==d) {
			return s;
		}
		else {
			return investment2(1.06*s + y, y ,c+1, d);
		}
	}

	public static String comparision(double i, double j) {
		double deficit = 0;
		deficit = j - i;
		return calculation(deficit);
	}

	public static String calculation(double difference) {
		String deficit = "";
		if (difference >= 0) {
			deficit = "You are $" + difference + " behind";
		}
		return deficit;
	}

	public static void main(String[] args) {	
		double doc2 = investment2(0, 100000, 35, 65);
		double eng2 = investment2(0, 42000, 25, 65);

	
		System.out.println(doc2);
		System.out.println(eng2);
		System.out.println(comparision(doc2, eng2));


		
		
		
		
		

		
		
		
	}
	
	
	//old investment method
	
//	public static double investment(int s, int y, int c, int d) {
//		double startingMoney = s;
//		double yearlyContribution = y;
//		int limit = d - c;
//		double k = 0;
//		for (int i = 0; i < limit; ++i) {
//			startingMoney = 1.06 * startingMoney + yearlyContribution;
//			k = startingMoney;
//		}
//		return k;
//	}
	
}
