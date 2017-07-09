package threeweekplan;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollections {
	
	/* Linked HashSet - contains only the unique elements like the hashset.
	 * 					maintains the order of insertion 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> babes = new LinkedHashSet<String>();
		babes.add("Margot Robbie");
		babes.add("Megan Fox");
		babes.add("Megan Fox");
		babes.add("margot robbie");
		
		Iterator<String> itr = babes.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}

	}

}
