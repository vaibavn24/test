package exercises.exercises5;

public class StringMethods2 {
	
	public static String concat (String n) {	
		return concatInt(n, 2);		
	}
	public static String concatInt (String x, int y) {
//		String text = "";
//		for (int i = 0; i<y; ++i) {			
//			text = text + x;	
//		}
//		return text;
		String text [] = new String[y];
		for (int i = 0; i<y; ++i){
			text[i] = x;
		}
		return join(text, "");
	}
	public static String join(String[] array, String joiner) {
		
		String a = "";
		for (int i = 0; i<array.length; ++i) {
			a = a + array[i] + joiner;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(concat("echo"));
		System.out.println(concatInt("echo", 4));
		
		String s = "I like computer science!";
		String[] words = s.split(" ");
		
		for (String w : words) {
			System.out.println(w);
		}
		
		System.out.println(join(words," "));
		

	}

}
