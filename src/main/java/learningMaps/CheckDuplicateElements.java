package learningMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "rohith";
		char[] charName = name.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		
		boolean duplicateValue = false;
		
		for (char eachChar : charName) {
			
			if (charMap.containsKey(eachChar)) {
				
				duplicateValue = true;
				System.out.println("This contains duplicate characters");
				break;
				
			} else {
				
				charMap.put(eachChar, 1);
				
			}
			
		}
		
		if (!duplicateValue) {
			
			System.out.println("All are unique characters");
			
		}
		
		System.out.println(charMap);

	}

}
