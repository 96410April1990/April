package javapractice;

import java.util.EnumMap;
import java.util.Map;

public class ClassTwentyThreeEnumMap {
	
	public enum Days {
		
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EnumMap<Days, String> enMp = new EnumMap<Days, String>(Days.class);
		
		enMp.put(Days.SUNDAY, "1");
		enMp.put(Days.MONDAY, "2");
		enMp.put(Days.TUESDAY, "3");
		enMp.put(Days.WEDNESDAY, "4");
		enMp.put(Days.THURSDAY, "5");
		enMp.put(Days.FRIDAY, "6");
		enMp.put(Days.SATURDAY, "7");
		
		for (Map.Entry enMpOne : enMp.entrySet()) {
			System.out.println(enMpOne.getValue()+" "+enMpOne.getKey());
		}
		
		if (enMp.containsKey(Days.FRIDAY)) {
			System.out.println("Yes mate, the key that you are looking for is available in the enum map");
		} else {
			System.out.println("No mate, the key that you are looking for is not available in the enum map");
		}
		
		Thread.sleep(3000);
		
		if (enMp.containsValue("3")) {
			System.out.println("Yes mate, the value that you are looking for is available in the enum map");
		} else {
			System.out.println("No mate, the value that you are looking for is not available in the enum map");
		}
		
		Thread.sleep(3000);
		
		System.out.println("The size of the enum map is:"+" "+enMp.size());
		
		enMp.remove(Days.TUESDAY, "3");
		
		if (enMp.containsValue("3")) {
			System.out.println("Yes mate, the value that you are looking for is available in the enum map");
		} else {
			System.out.println("No mate, the value that you are looking for is not available in the enum map");		
		}
		
		System.out.println("The size of the enum map is:"+" "+enMp.size());
		
		if (enMp.equals(7)) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}

}
