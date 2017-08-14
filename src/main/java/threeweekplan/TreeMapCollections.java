package threeweekplan;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollections {
	
	/* TreeMap - contains only unique values.
	 *           maintains ascending order 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> names = new TreeMap<Integer, String>();
		names.put(26, "Rohith");
		names.put(25, "Sai");
		names.put(24, "Rags");
		
		for (Map.Entry friends : names.entrySet()) {
			System.out.println(friends.getKey()+" "+friends.getValue());
		}

	}

}
