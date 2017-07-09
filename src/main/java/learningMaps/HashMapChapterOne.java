package learningMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapChapterOne {
	
	/*
	 * TreeMap - make specific guarantees as to their order by key
	 * HashMap - does not guarantee any order
	 * LinkedHashMap - Maintains the order
	 * 
	 * Methods used in Map
	 * 
	 * get(key)
	 * put(key, value)
	 * containsKey(key)
	 * isEmpty
	 * entrySet
	 * clear
	 * remove(key)
	 * size
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> friends = new HashMap<Integer, String>();
		friends.put(1, "Rohith");
		friends.put(2, "Sai");
		friends.put(3, "Rags");
		
		for (Entry<Integer, String> friend : friends.entrySet()) {
			System.out.println("The elements are:"+" "+friend.getKey()+" "+friend.getValue());
		}
		

	}

}
