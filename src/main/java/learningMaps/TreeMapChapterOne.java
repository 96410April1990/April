package learningMaps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapChapterOne {

	/* TreeMap
	 * 
	 * - contains only unique elements.
	 * - cannot have a null key but can have multiple null values.
	 * - maintains ascending order.
	 */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> friends = new TreeMap<Integer, String>();
		friends.put(1, "rohith");
		friends.put(2, "sai");
		friends.put(3, null);
		friends.put(4, null);
		
		for (Entry<Integer, String> friend : friends.entrySet()) {
			System.out.println(friend.getKey()+" "+friend.getValue());
		}
		
	}

}
