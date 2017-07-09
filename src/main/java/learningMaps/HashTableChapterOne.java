package learningMaps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableChapterOne {
	
	/* It is synchronized
	 * No null values allowed
	 * Maintains no order
	 * 
	 * Methods used:
	 * 
	 * get(key)
	 * containsKey(key)
	 * entrySet()
	 * put(key, value)
	 * size
	 * remove
	 * clear
	 * isEmpty
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> friends = new Hashtable<Integer, String>();
		
		friends.put(1, "Rohith");
		friends.put(2, "Rags");
		friends.put(3, "Sai");
		friends.put(4, "Mitesh");
		friends.put(5, "Anish");
		friends.put(6, "Vaibhav");
		friends.put(7, "Hari");
		
		//Print the size of the hashtable
		System.out.println(friends.size()+"\n");
		
		//Find the value of 3
		System.out.println(friends.get(1)+"\n");
		
		//Print all the elements in the hashtable
		for (Entry<Integer, String> friend : friends.entrySet()) {
			System.out.println("The key is:"+" "+friend.getKey()+" "+"and the value is:"+" "+friend.getValue()+"\n");
		}
		
		if (friends.containsKey(5)) {
			System.out.println(friends.get(5));
		}
		else {
			System.out.println("Negative");
		}
		
		friends.remove(4);
		
		if (friends.contains(4)) {
			System.out.println(friends.get(4));
		} else {
			System.out.println("Negative");
		}
		
		friends.clear();
		
		if (friends.isEmpty()) {
			System.out.println("This is empty");
		} else {
			System.out.println("Negative");
		}
		

	}

}
