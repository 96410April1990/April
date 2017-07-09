package threeweekplan;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollections {
	
	/* HashSet - used to store elements. Implements set interface
	 * 			 contains only the unique elements.
	 * 			 It prints elements in alphabetical order. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> friends = new HashSet<String>();
		friends.add("Rohith");
		friends.add("Rags");
		friends.add("Saba");
		friends.add("Rohith");
		
		Iterator<String> itr = friends.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}

}
