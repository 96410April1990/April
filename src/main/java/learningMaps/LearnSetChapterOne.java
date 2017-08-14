package learningMaps;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSetChapterOne {
	
	/* TreeSet
	 * 
	 * - contains only unique elements.
	 * - maintains ascending order. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> friends = new LinkedHashSet<String>();
		friends.add("rohith");
		friends.add("rags");
		friends.add("sai");
		
		Iterator<String> itr = friends.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
				
		}


}
