package threeweekplan;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableCollections {
	
	/* HashTable - it contains only the unique elements.
	 *             it may or may not have null key or value pairs.
	 * 		       it is synchronized.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> fav = new Hashtable<Integer, String>();
		fav.put(25, "Margot Robbie");
		fav.put(26, "Megan Fox");
		fav.put(27, "Mila Kunis");
		
		for (Map.Entry actress : fav.entrySet()) {
			System.out.println(actress.getKey()+" "+actress.getValue());						
		}

	}

}
