package exercises.exercises6;

public class Add {
	
	//
	// Complete using the formula:
	//   add(x,y) =           x , if y == 0
	//   add(x,y) = add(x+1,y-1), otherwise
	//
	private static int add(int x, int y) {		
		if (y==0) {
			return x; //base case
		}		
		else {
			return add(x+1, y-1); 
		}		
	}
	
	//
	// Answer in comments below:
	//
	//  For what values of x and y does your method operate correctly?
	//
	//  Your answer: positive values
	//
	//  Can you complete the following method
	//   so that it calls add but returns the correct answer
	//   for any x and y?
	//  As a hint, consider that  (x+y) = -(-x + -y)
	//
	
	//what if y is negative?
	public static int addAny(int x, int y) {
		if (y<0) {
			
			//??????
			
			// if x is also negative? you can treat it like you're adding them, so add negative sign
			// to x and y, then get the value from the add method, then just multiply that value
			// by -1 to get the negative answer
			
			if (x<0) {
				return -add(-x,-y);
			}
			// if x is positive while y is negative?, just swap those values so that the negative
			// value feeds into int x of the add method while the positive one into int y
			else { //  x>=0
				return add(y,x); //swap and feed into add method
			}
		}
			else {
				return add(x,y);
			}
		}
		
	

	public static void main(String[] args) {		
		System.out.println(add(-2,4));
		System.out.println(addAny(-2,-4));	

	}	
}
