package threeweekplan;

import java.util.HashSet;
import java.util.Iterator;

/* Hashset - uses hashtable to store the elements. 
 * 			 extends AbstractSet class and implements Set interface
 * 			 contains unique elements only
 * 
 * Difference between list and set
 * 
 * List can contain duplicate elements whereas set can contain only unique elements 
 */

public class CollectionsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hash = new HashSet<String>();
		hash.add("Rohith");
		hash.add("Shraddha");
		hash.add("Katrina");
		hash.add("Alia");
		hash.add("Rohith");
		
		Iterator<String> itr = hash.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		
	}

}
