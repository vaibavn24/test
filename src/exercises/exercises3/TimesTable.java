package exercises.exercises3;

import support.cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		
		//  Table should include rows and columns for 0...N  
		//     mkaing N+1 rows and columns
		
		
		int table [] [] = new int [N+1][N+1];
		
		System.out.println(table.length);	
		for (int r = 0; r<table.length; ++r) {
			for (int c=0; c<table[r].length; ++c) {				
				table[r][c] = r*c;			
			}			
		}		
			System.out.print("     ");
			for (int c=0; c<=N; ++c) {	
				System.out.print(c + "  ");
				}
			
			System.out.println();

			for (int c=0; c<=N; ++c) {	
				System.out.print("----");			
				}
			System.out.println();
		
			
				for (int r = 0; r<=N; ++r) {		
					System.out.print(r + " | ");					
					for (int c=0; c<=N; ++c) {														
						int entry =table[r][c];						
						if (entry <10) {
							System.out.print(" " + table[r][c] + " ");
						}
						else {
						System.out.print(table[r][c] + " ");
						}
					}			
			System.out.println();
			
			
			
		
			
			
		}
		
				System.out.println();

				int table2 [] [] = new int [N+1][N+1];
				
				//System.out.println(table2.length);	
				for (int r = 0; r<table2.length; ++r) {
					for (int c=0; c<table2[r].length; ++c) {				
						table2[r][c] = r*c;			
					}			
				}		
				System.out.print( "     ");	

					for (int c=0; c<=N; ++c) {				
							System.out.print(c + "  ");	
					}			
					
					System.out.println();	

					for (int c=0; c<=N; ++c) {	
						System.out.print("----");			
						}
					System.out.println();				
				
				
					for (int r = 0; r<table2.length; ++r) {
						System.out.print(r + " | ");
						for (int c=0; c<table2[r].length; ++c) {							
							int entry = table2[r][c];							
							if (entry <10) {								
								System.out.print(" " + table2[r][c] + " ");		
								}
							else {
							System.out.print(table2[r][c] + " ");		
									}						

				}
					System.out.println();
	
		
	}
	}
}
