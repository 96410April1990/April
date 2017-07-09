package javapractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClassFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<ClassThirteen> lhs = new LinkedHashSet<ClassThirteen>();
		
		ClassThirteen ct1 = new ClassThirteen(324049, "Rohith", 27);
		ClassThirteen ct2 = new ClassThirteen(324050, "Lavanya", 27);
		ClassThirteen ct3 = new ClassThirteen(324051, "Ramya", 27);
		
		lhs.add(ct1);
		lhs.add(ct2);
		lhs.add(ct3);
		
		for (ClassThirteen classThirteenOne : lhs) {
			System.out.println(classThirteenOne.id+" "+classThirteenOne.name+" "+classThirteenOne.age);
		}

	}

}
