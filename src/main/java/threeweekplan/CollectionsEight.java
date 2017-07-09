package threeweekplan;

import java.util.ArrayList;
import java.util.ListIterator;

/* ListInterface - subinterface of collections. 
 * 				   contains methods to insert and delete elements in the index basis.
 * 
 * ListIterator - used to traverse the elements in forward and backward direction.
 * 
 * Commonly used methods used in ListIterator Interface:
 * 
 * public boolean hasNext();
 * public Object next();
 * public boolean hasPrevious();
 * public Object previous();
 * 
 */

public class CollectionsEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> actor = new ArrayList<String>();
		actor.add("Kamal");
		actor.add("Rajini");
		actor.add("Ajith");
		actor.add("Vijay");
		
		System.out.println(actor);
		
		ListIterator<String> itr = actor.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		

	}

}
