package exercises.exercises8;

import java.awt.Color;
import java.util.List;

import exercises.exercises7.Account;

public class ThinkingAboutLists {

	
	
	List<String> ceoHolder;
	
	List<Double> inflationRate;

	List<Color> trafficLightColor;
	
	List<Account> accountOpenedTimeLog;
	
	
	// Roulette 
	
	List<Integer> numberRolled;
	
	
	
	
	
	
	
	//Solution:
	
	//Examples 
	
	//List<Color>
	//rainbow, order is important
	//Want to paint a room and use colors in a particular order
	
	//Traffic Light: green, yellow, red
	//Color of eyes of people as they walk into a room
	////blue, brown, brown, blue, blue, blue, green
	
	//List<Account>
	//Bank wants to track its accounts by opening date
	//first account, second account
	
	//List of accounts from which funds should be taken,
	//should the primary account overdraw
	
	
	//----------
	
	//Roulette wheel - numbers 0 to 36
	// 13, 24, 0, 13, ....
	
	//List<Integer> may be the right thing to use
	
	//Some wheels have 00, 000, and so on
	// so you'd use List<String> would be needed in those cases
	
	//-----------
	
	// example where List<Boolean> is useful
		// coin toss: heads or tail as useful outcome
	
	//use List<Boolean> to record whether each toss
	// in turn is a heads (or not)
	
	//If we have a List<?> - what might we do with it
	
	// Add something to the list
	// to beginning, or end, or maybe in the middle
	
	// Delete something from the list
	// the thing I delete might be anywhere
	
	// Does my List contain something
	// Join two lists together
	// Determine what's in one list but not the other
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
