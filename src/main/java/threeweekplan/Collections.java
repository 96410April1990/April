package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

/* Collections - operations such as searching, sorting, insertion, manipulation and deletion can
 * be performed using collections.
 * 
 * Interfaces used in collections - set, list, queue, deque
 * Classes used in Java - ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet
 * TreeSet etc
 * 
 * Array List - uses a dynamic array of storing the elements
 * 				can contain duplicate elements
 * 				maintains insertion order
 * 				non-synchronized
 * 				 
 */


public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rohith");
		names.add("Rags");
		names.add("Sai");
		names.add("Hari");
		names.add("Anish");
		names.add("Mitesh");
		names.add("Vaibhav");
		
		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		ArrayList<String> newnames = new ArrayList<String>();
		newnames.add("Abhinaya");
		newnames.add("Divya");
		
		for (String obj : newnames) {			
			System.out.println(obj);					
		}
		
	}

	public static void sort(ArrayList numbers) {
		// TODO Auto-generated method stub
		
	}



}
