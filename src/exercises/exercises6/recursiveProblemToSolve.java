package exercises.exercises6;

public class recursiveProblemToSolve {

	
	// I don't think this is recursive????
		
	public static int findSum(int[] arr, int index) {
				
		if (arr.length-index<=0) {
		return 0;
		}
		else {			
			return arr[index] + findSum(arr, index+1);
		}		
	}	
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int index = 4;
		System.out.println(findSum(arr, index));
	}
}
