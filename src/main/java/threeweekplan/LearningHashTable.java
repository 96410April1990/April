package threeweekplan;

import java.util.Hashtable;
import java.util.Map;

/* HashTable - It is an array of list.
 * 			   Contains value based on the key.
 * 			   Contains only the unique values.
 * 			   May or not may not have any null key or value.
 * 			   It is synchronized.
 */

public class LearningHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> cricketers = new Hashtable<Integer, String>();
		cricketers.put(07, "Dhoni");
		cricketers.put(18, "Virat");
		cricketers.put(99, "Tendulkar");
		cricketers.put(01, "Ganguly");
		
		for (Map.Entry players:cricketers.entrySet()) {
			System.out.println(players.getKey()+" "+players.getValue());
		}
		
	}

}
