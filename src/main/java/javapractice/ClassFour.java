package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ClassThree> detailsOne = new ArrayList<ClassThree>();
		
		ClassThree a1 = new ClassThree(324049, "Rohith", "Software Engineer", 27);
		ClassThree a2 = new ClassThree(317115, "Lavanya", "Business Development Analyst", 27);
		ClassThree a3 = new ClassThree(342105, "Ramya", "Software Engineer", 27);
		
		detailsOne.add(a1);
		detailsOne.add(a2);
		detailsOne.add(a3);
		
		Iterator itr = detailsOne.iterator();
		for (ClassThree details : detailsOne) {
			System.out.println(details.id+" "+details.name+" "+details.profession+" "+details.age);
		}
		
		
	}

}
