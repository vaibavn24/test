package exercises.exercises3;
import support.cse131.ArgsProcessor;

public class timestable2 {

		public static void main(String[] args) {
			ArgsProcessor ap = new ArgsProcessor(args);
			int N = ap.nextInt("Max value for table?");
			int table [][] = new int[N+1][N+1];
			
			//perform calculations
			for (int r=0; r<table.length; ++r) {				
				for (int c=0; c<table[r].length; ++c ) {					
					table[r][c] = r*c;										
				}		
			}
			
			System.out.print("     ");
			for (int c =0; c<=N; ++c) {				
				System.out.print(c + "  ");				
			}			

			System.out.println();
			for (int c =0; c<=N; ++c) {				
				System.out.print("-----");			
			}
			
			System.out.println();
			
			for (int r =0; r<=N; ++r) {
				System.out.print(r + " | ");

				for (int c =0; c<=N; ++c) {
					
					int entry = table[r][c];
					if (entry<10) {
						System.out.print(" " + table[r][c] + " ");
					}
					else {
				System.out.print(table[r][c] + " ");
					}
				}
				System.out.println();

			}

			
			
			
			
			}
			
	

			
		}

