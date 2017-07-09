package threeweekplan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCollections {
	
	/* Map - contains key and value pair. Each key and value pair is called an entry.
	 *       contains only the unique keys.
	 *       it maintains no order.
	 *       may have one null key and multiple null values.
	 *       
	 *       Difference b/w HashSet and HashMap - HashSet contains only the values where as 
	 *       the HashMap contains the keys and values.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(324049, "Rohith");
		student.put(324050, "Rags");
		student.put(324051, "Sai");
		
		for (Map.Entry m:student.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());						
		}
		

	}

}
