package exercises.exercises8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class whatCanWeDoWithAList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> eating =  new LinkedList<String>();
		List<String> eating2 =  new ArrayList<String>();
		
		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		eating.add("chew");
		eating.add("swallow");

		
		
		System.out.println(eating);
		
		
	}
	
	public interface ListTest<T> {
		
		//no constructors
		//not really a class
		//defining a signature of methods to come
		
		//no instance variables
		
		public boolean add(T e);		//Add element e to the end of this list
											// always returns true for a list
											//because adding to a list is a successful operation
		
		public T get (int i);		//Return the ith element in this list
		
		
		public int indexOf(T e); 	//Returns the index at which the specified
									//element first occurs in the list
											// 0 is the index of the first element
		
		public boolean remove (T e); //Removes the first occurrence of the specified element
		
		public T remove (int i);  //Remove (and return) the element at the
								  // ith index in the list
		
		
		public int size();

	
		//interface is pure design without implementation
			// so that alternative implementations can satisfy the interface
		
		
		
		
		//What implementations exist?
		
		//ArrayList
		////Does not change
		
		
		//LinkedList
		////insertion and deletion are relatively easy
		
		//Choosing the right data structure is important
		///This is covered in more detail in analysis of algorithms
		
		
		
	}
	
	


	


}
