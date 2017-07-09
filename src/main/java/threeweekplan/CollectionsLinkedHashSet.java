package threeweekplan;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* LinkedHashSet - Contains unique elements only.
 * 				   Extends HashSet class and implements Set interface.
 * 				   Maintains Insertion order.
 */

public class CollectionsLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> actors = new LinkedHashSet<String>();
		actors.add("Shraddha");
		actors.add("Alia");
		actors.add("kriti");
		actors.add("Katrina");
		actors.add("Shraddha");
		
		System.out.println(actors);
		
		Iterator<String> display = actors.iterator();
		
		while (display.hasNext()) {
			System.out.println(display.next());			
		}
		
	}

}
