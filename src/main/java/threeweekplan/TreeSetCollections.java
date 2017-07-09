package threeweekplan;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollections {
	
	/* Tree Set - contains only the unique elements like the hash set
	 * 			  it maintains the ascending order 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> bowlers = new TreeSet<String>();
		bowlers.add("Zaheer");
		bowlers.add("Irfan");
		bowlers.add("Shami");
		bowlers.add("Ishant");
		bowlers.add("Bhuvi");
		
		Iterator<String> pacers = bowlers.iterator();
		
		System.out.println("Some of the best indian bowlers are:"+"\n");
		while (pacers.hasNext()) {
			System.out.println(pacers.next());			
		}

	}

}
