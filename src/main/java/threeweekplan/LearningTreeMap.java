package threeweekplan;

import java.util.Map;
import java.util.TreeMap;

/* TreeMap - Contains the value based on the key. 
 * 			 Implements the NavigableMap interface and extends AbstractMap class.
 * 			 Contains only the unique elements.
 * 			 Cannot have null key but can have null values.
 * 			 Maintains the ascending order.
 */

public class LearningTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> actors = new TreeMap<String, Integer>();
		actors.put("Kriti", 26);
		actors.put("Shraddha", 27);
		actors.put("Alia", 23);
		actors.put("Katrina", 0);
		actors.put("Kareena", 0);
		
		for(Map.Entry bollyactors:actors.entrySet()) {	
			System.out.println(bollyactors.getKey()+" "+bollyactors.getValue());
		}
		
		
	}

}
