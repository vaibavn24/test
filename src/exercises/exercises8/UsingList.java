package exercises.exercises8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//
		List<String> eating =  new LinkedList<String>();
		List<String> eating2 =  new ArrayList<String>();
		
		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		eating.add("chew");
		eating.add("swallow");

		
		
		System.out.println(eating);
	}

}
