package week7homework;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ReverseStringAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] company = new String[] {"infosys", "cognizant", "TCS", "verizon"};
		
		
		//Sort the array in alphabetical order
//		Map<Integer, String> companies = new TreeMap<Integer, String>();
//		companies.put(1, "infosys");
//		companies.put(2, "cognizant");
//		companies.put(3, "TCS");
//		companies.put(4, "verizon");
//		
		//Print the size of the array
		System.out.println("The number of companies in the list is:" +company.length);
		
		//Print the values in the array
		System.out.println("The companies in the list are:" +company);
		
		//Sort the values in the Array
		//Arrays.sort(company);
		
		//Reverse the values in the array
		for(int i = company.length-1; i>=0; i--){
			
			System.out.println("The values in the array in reverse order:" +i);
		
		//System.out.println("Print the values in the array in reverse:" +company.);
			
			
		}
		
	}

}
