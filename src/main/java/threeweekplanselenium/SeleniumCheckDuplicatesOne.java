package threeweekplanselenium;

import java.util.ArrayList;
import java.util.List;

public class SeleniumCheckDuplicatesOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cricketers = new ArrayList<String>();
		cricketers.add("Virat");
		cricketers.add("Vijay");
		cricketers.add("Dhoni");
		cricketers.add("Virat");
		cricketers.add("Ashwin");
		cricketers.add("Virat");
		
		System.out.println("The number of elements in the array list is:"+" "+cricketers.size());
		System.out.println("\n"+"The elements in the array list are:"+" "+cricketers+"\n");
		
		//Check if the array list contains any duplicate values
		String duplicateValue = "Virat";
		int i = 0;
		for (String duplicates : cricketers) {
			
			if (duplicates.equals(duplicateValue)) {
				i++;
			}
							
		}

		System.out.println("The number of duplicate values in the array list is:"+" "+i+"\n");
		System.out.println("The length of the duplicate value in the array list is:"+" "+duplicateValue.length());
		
	}

}
