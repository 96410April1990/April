package threeweekplan;

import java.util.LinkedHashMap;
import java.util.Map;

/* Linked HashMap - Contains value based on the key.
 * 					Implements the Map interface and extends HashMap class.
 * 					Contains only the unique elements.
 * 					Contains one null key and multiple null values.
 * 					Maintains the insertion order. 
 */

public class LearningLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> actors = new LinkedHashMap<Integer, String>();
		actors.put(50, "Salman");
		actors.put(42, "Hrithik");
		actors.put(45, "Akshay");
		actors.put(40, "John");
		actors.put(51, "");
		actors.put(52, "");
		
		for(Map.Entry bollyactors:actors.entrySet()) {
			System.out.println(bollyactors.getKey()+" "+bollyactors.getValue());			
		}
		
		
	}

}
