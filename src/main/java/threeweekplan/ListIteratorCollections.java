package threeweekplan;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCollections {

	/* The List Iterator is used to traverse the elements in an array list in forward and 
	 * backward directions.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Wolf of Walstreet");
		movies.add("Fight Club");
		movies.add("American History X");
		
		ListIterator<String> moviecompilation = movies.listIterator();
		
		System.out.println("Movie names in forward direction");
		System.out.println("\n");
		
		while (moviecompilation.hasNext()) {
			System.out.println(moviecompilation.next());
		}
		
		System.out.println("\n");
		System.out.println("Movie names in backward direction");
		System.out.println("\n");
		
		while (moviecompilation.hasPrevious()) {
			System.out.println(moviecompilation.previous());			
		}
		

	}

}
