package threeweekplan;

import java.util.Iterator;
import java.util.TreeSet;

/* TreeSet - contains only the unique elements.
 * 			 maintains the ascending order. 
 */

public class CollectionsTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> cricketers = new TreeSet<String>();
		cricketers.add("Sachin");
		cricketers.add("Dhoni");
		cricketers.add("Ganguly");
		cricketers.add("Kohli");
		cricketers.add("Sachin");
		
		Iterator<String> listcricketers = cricketers.iterator();
		
		while (listcricketers.hasNext()) {
			System.out.println(listcricketers.next());			
		}
		
	}

}
