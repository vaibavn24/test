package exercises.exercises4;

import java.util.Scanner;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import support.cse131.ArgsProcessor;

public class readSpotifyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		double sum = 0;
		int i = 0;
		int a = 0;
		int b = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int j = 0;
		int k = 0;


		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		String readText3 = "";
		

		In filename = new In ("\\Users\\vaiba\\OneDrive\\Desktop\\TXT_ExtendedSpotifyHistory.txt");

    	while (filename.hasNextLine()) {      		
    		String readText = filename.readString(); 
			String c = "\"artistName\":";
//			System.out.println(readText);

			int lengthText = readText.length();
			
			if (lengthText>5) {
			 readText3 = readText.substring(1, 5);
	//		System.out.println(readText3);
			


    		if (readText.equals(c)) {
				++i;
			}
    		
    		if (readText3.equals("2015")) {
				++a;
			}
    		
    		if (readText3.equals("2016")) {
				++b;
			}
    		if (readText3.equals("2017")) {
				++e;
			}
    		if (readText3.equals("2018")) {
				++f;
			}
    		if (readText3.equals("2019")) {
				++g;
			}
    		if (readText3.equals("2020")) {
				++h;
			}
    		if (readText3.equals("2021")) {
				++j;
			}
    		if (readText3.equals("2022")) {
				++k;
			}
    		
			}
    		
    	}   		
		System.out.println("Total # of Plays (Since account creation): " + i);
		System.out.println();
		System.out.println("Total # of Plays in 2015: " + a);
		System.out.println("Total # of Plays in 2016: " + b);
		System.out.println("Total # of Plays in 2017: " + e);
		System.out.println("Total # of Plays in 2018: " + f);
		System.out.println("Total # of Plays in 2019: " + g);
		System.out.println("Total # of Plays in 2020: " + h);
		System.out.println("Total # of Plays in 2021: " + j);
		System.out.println("Total # of Plays in 2022: " + k);

		
	}

}
