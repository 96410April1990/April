package threeweekplan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Map Interface - Contains values on the basis of key and value pairs. 
 * 				   Each Key and Value pair is known as an entry.
 * 				   Map contains only unique keys.
 * 				   Map is useful if you have to search, update or delete elements 
 * 				   on the basis of key.
 * 
 * HashMap - Contains value based on the key.
 * 			 Contains only unique elements.
 * 			 May have one null key and multiple null values.
 * 			 It maintains no order.  
 * 
 * Difference between HashSet and HashMap - HashSet contains only the values whereas the 
 * HashMap contains both key and values. 
 */

public class LearningHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Rohith");
		hm.put(101, "Kriti");
		hm.put(102, "Mila");
		
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());					
		}
		
		
	}

}
