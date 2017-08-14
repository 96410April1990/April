package javapractice;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassFifteen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		boolean isContains;

		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Rohith");
		ts.add("Rags");
		ts.add("Rohith");
				
		System.out.println("The size of the tree set is:"+" "+ts.size());
		
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		Thread.sleep(3000);
		
		ts.remove("Rohith");
		
		Iterator<String> itrOne = ts.iterator();
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		
		if (ts.contains("Rohith")) {
			System.out.println("This tree set contains Rohith");
			isContains = true;
		} else {
			System.out.println("This tree does not contain Rohith");
			isContains = false;
		}
		
		
		
		
	}

}
