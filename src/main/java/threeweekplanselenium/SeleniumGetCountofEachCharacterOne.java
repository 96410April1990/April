package threeweekplanselenium;

import java.util.LinkedHashMap;
import java.util.Map;

public class SeleniumGetCountofEachCharacterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "rohith nandakumar";
		char[] convchar = name.toCharArray();
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		
		for (char count : convchar) {
			
			if (charCount.containsKey(count)) {
				charCount.put(count, charCount.get(count)+1);								
			} else {
				charCount.put(count, 1);
			}
			
		}
		
		System.out.println(charCount);

	}

}
