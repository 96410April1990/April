package learningMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCharCountUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String man = "rohith";
		String woman = "abhinaya";
		
		//Converting both the string variables to char variables
		char[] convMan = man.toCharArray();
		char[] convWoman = woman.toCharArray();
		
		Map<Character, Integer> mapMan = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> mapWoman = new LinkedHashMap<Character, Integer>();
		
		for (char countChar : convMan) {
			
			if (mapMan.containsKey(countChar)) {
				mapMan.put(countChar, mapMan.get(countChar)+1);
			} else {
				mapMan.put(countChar, 1);
			}
			
		}
		
		System.out.println(mapMan+"\n");
		
		for (char countCharOne : convWoman) {
			
			if (mapWoman.containsKey(countCharOne)) {
				mapWoman.put(countCharOne, mapWoman.get(countCharOne)+1);
			} else {
				mapWoman.put(countCharOne, 1);
			}
			
			
		}
		
		System.out.println(mapWoman);
		

	}

}
