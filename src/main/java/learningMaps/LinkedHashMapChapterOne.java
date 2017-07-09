package learningMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * LinkedHashMap
		 * 
		 * - contains only unique elements.
		 * - maintains insertion order.
		 * - may have only one null key and multiple null values. 
		 */
		
		Map<Integer, String> friends = new LinkedHashMap<Integer, String>();
		
		friends.put(1, "Rohith");
		friends.put(null, "Sai");
		friends.put(3, null);
		friends.put(4, null);
		
		System.out.println("The number of entries in the LinkedHashMap is:"+" "+friends.size()+"\n");
		System.out.println(friends.get(3)+"\n");
		friends.put(5, "Mitesh");
		System.out.println(friends.size()+"\n");
		System.out.println(friends.remove(4));
		
		if (friends.containsKey(1) && friends.containsValue("Rohith")) {
			System.out.println("TRUE");
		} else {
			System.out.println("Negative");
		}
		
		for (Entry<Integer, String> friend : friends.entrySet()) {
			System.out.println(friend.getKey()+" "+friend.getValue());
		}
				
		friends.clear();
		
		if (friends.isEmpty()) {
			System.out.println("TRUE");
		} else {
			System.out.println("Negative");
		}
		
		
	}

}
