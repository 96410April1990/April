package javapractice;

import java.util.LinkedList;

public class ClassSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<ClassFive> ll = new LinkedList<ClassFive>();
		
		ClassFive a1 = new ClassFive(324049, "Rohith", 27);
		ClassFive a2 = new ClassFive(324050, "Lavanya", 27);
		
		ll.add(a1);
		ll.add(a2);
		
		for (ClassFive classFive : ll) {
			System.out.println("The employee Id is:"+""+classFive.id+" and the name is:"+""+classFive.name+" and the age is:"+""+classFive.age);
		}

	}

}
