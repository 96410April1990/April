package learningMaps;

import java.util.ArrayList;
import java.util.List;

public class ArrayListChapterOne {
	
	/* List is an interface
	 * Can contain duplicate elements
	 * Maintains insertion order    
	 * 
	 * Methods used:
	 * 
	 * size()
	 * get(index)
	 * add
	 * remove 
	 * clear
	 * isEmpty 
	 */
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rohith");
		friends.add("Rags");
		friends.add("Sai");
		
		System.out.println(friends.size()+"\n");
		Thread.sleep(3000);
		friends.add("Vaibhav");
		System.out.println(friends.size()+"\n");
		
		System.out.println(friends.get(1));
		
		friends.remove("Sai");
		System.out.println(friends.size());
		
		for (String friend : friends) {
			System.out.println(friend);
		}
		
		if (friends.contains("Rohith")) {
			System.out.println("Done");
		} else {
			System.out.println("Negative");
		}
		
		friends.clear();
		
		if (friends.isEmpty()) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("Negative");
		}
		

	}

}
