package javapractice;

import java.util.HashSet;
import java.util.Iterator;

public class ClassEleven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Rohith");
		hs.add("Rags");
		hs.add("Sai");
		
		//Traversing elements
		Iterator<String> itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		Thread.sleep(3000);
		if (hs.contains("Rags")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}		
		Thread.sleep(3000);
		if (hs.isEmpty()) {
			System.out.println("The set is empty");
		} else {
			System.out.println("The set is not empty");
		}
		Thread.sleep(3000);
		/*hs.removeAll(hs);
		if (hs.isEmpty()) {
			System.out.println("The set is empty");
		} else {
			System.out.println("The set is not empty");
		}*/
		HashSet<String> hsOne = new HashSet<String>();
		hsOne = (HashSet)hs.clone();
		Iterator<String> itrOne = hsOne.iterator();
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		System.out.println(hs.size());
		System.out.println(hsOne.size());		
	}

}
