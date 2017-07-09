package week7;

import java.util.LinkedHashMap;
import java.util.Map;


public class IsThereDuplicateCharacters {

	public static void main(String[] args) {
		
		// Lets write Psuedocode first
		// Goal ?? If there is repeating character -- then print false ; else true
		
		// 1, Convert the string to the character array(toCharArray())
		// 2, Loop through each character (use foreach)
		// 3, If the character is in map key then print duplicate and break
		// 4, If not add to the map
		
		String date = "tes123";
		
		char[] allChars= date.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		boolean bDuplicate = false;
		for (char c : allChars) {
			
			if(map.containsKey(c)){
				bDuplicate = true;
				System.out.println("has Duplicate characters");
				break;
			}else{
				map.put(c, 1);
			}
		}
		if(!bDuplicate){
			System.out.println("all Unique Characters");
		}
		
		System.out.println(map);
	}

	
	
	
	
	
	
	
}
