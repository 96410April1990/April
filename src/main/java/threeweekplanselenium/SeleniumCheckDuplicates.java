package threeweekplanselenium;

import java.util.ArrayList;
import java.util.List;

/*
 * Checking if there are duplicate values in a list 
 */

public class SeleniumCheckDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rohith");
		friends.add("Sai");
		friends.add("Rags");
		friends.add("Mitesh");
		friends.add("Vaibhav");
		friends.add("Hari");
		friends.add("Rohith");
		friends.add("Anish");
		
		String checkDuplicates = "Rohith";
		int i = 0;
		for (String duplicate : friends) {
			
			if (duplicate.equals(checkDuplicates)) {
				i++;
			}
			
		}
		System.out.println(i);
		System.out.println("\n"+"The length of the duplicate value in the array list is:"+" "+checkDuplicates.length());

	}

}
