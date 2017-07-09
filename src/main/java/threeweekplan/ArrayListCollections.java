package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Rohith");
		friends.add("Sai");
		friends.add("Rags");
		friends.add("Rohith");
		
		ArrayList<String> newfriends = new ArrayList<String>();
		newfriends.add("Ramya");
		
		friends.addAll(newfriends);
		
		System.out.println("Adding all the friends:"+"\n");
		
		Iterator friend = friends.iterator();
		
		while (friend.hasNext()) {
			System.out.println(friend.next());			
		}
		
		friends.removeAll(newfriends);
		
		System.out.println("\n"+"Removing all the friends:"+"\n");		

	}

}
