package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsThree {

	//Adding the elements from different array lists
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Rohith");
		friends.add("Ramya");
		
		ArrayList<String> bestfriends = new ArrayList<String>();
		bestfriends.add("Rags");
		bestfriends.add("Sai");
		bestfriends.add("Hari");
		bestfriends.add("Mitesh");
		bestfriends.add("Vaibhav");
		bestfriends.add("Anish");
		
		friends.addAll(bestfriends);
		
		Iterator itr = friends.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		

	}

}
