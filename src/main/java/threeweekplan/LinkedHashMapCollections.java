package threeweekplan;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollections {
	
	/* LinkedHashMap - contains only unique elements.
	 * 				   may have one null key and multiple null values.
	 * 				   maintains insertion order. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> age = new LinkedHashMap<Integer, String>();
		
		age.put(26, "Rohith");
		age.put(25, "Sai");
		age.put(24, "Rags");
		
		for (Map.Entry names : age.entrySet()) {
			System.out.println(names.getKey()+" "+names.getValue());
		}

	}

}
