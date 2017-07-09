package javapractice;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class ClassTwentyTwoEnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		
		Iterator<days> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());			
		}
		
		Set<days> setOne = EnumSet.allOf(days.class);
		System.out.println("Days:"+" "+setOne);
		
		Set<days> setTwo = EnumSet.noneOf(days.class);
		System.out.println("Days:"+" "+setTwo);
		
		Set<days> setThree = EnumSet.copyOf(setOne);
		System.out.println(setThree);
		
		Set<days> setFour = EnumSet.of(days.MONDAY);
		System.out.println(setFour);
		
		Set<days> setFive = EnumSet.range(days.MONDAY, days.FRIDAY);
		System.out.println(setFive);	
		
		

	}

}
