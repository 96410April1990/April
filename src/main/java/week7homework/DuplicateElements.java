package week7homework;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();

		// add the elements to the ArrayList
		names.add("Rohith");
		names.add("Sai");
		names.add("Rags");
		names.add("Vaibhav");
		names.add("Anish");
		names.add("Mitesh");
		names.add("Hari");

		// get the count of the ArrayList
		System.out.println("The number of elements in the ArrayList is:" + names.size());

		// Add a new entry to the ArrayList
		names.add("Rohith");

		//get the count of the ArrayList
		System.out.println("The number of elements in the ArrayList is:" + names.size());
		
		// Check for duplicate entries
		String duplicateNames = "Rohith";
		int i = 0;

		for (String duplicate : names) {

			if (duplicate.equals(duplicateNames)) {
				i++;
			}

		}

		System.out.println(i);
		
		int duplicateCount = i;
		
		System.out.println("The number of duplicate elements in the ArrayList is:" +duplicateCount);

	}

}
