package week7homework;

import java.util.Map;
import java.util.TreeMap;

public class StringOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company = "Cognizant";
		
		//Convert the String variable to Char Array
		char[] charcompany = company.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for (char c : charcompany) {
			
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
				
			}else{
				map.put(c, 1);
			}			
			
		}
		
		System.out.println(map);
		
	}

}
