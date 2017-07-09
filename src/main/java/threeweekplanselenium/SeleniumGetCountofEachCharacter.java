package threeweekplanselenium;

import java.util.LinkedHashMap;
import java.util.Map;

public class SeleniumGetCountofEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "amazon";
		
		char[] allChars = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : allChars) {
			
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		

	}

}
