package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

//removeAll method removes all the elements from the array list

public class CollectionsFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> family = new ArrayList<String>();
		family.add("Rohith");
		family.add("Archana");
		family.add("Harsha");
		family.add("Advith");
		family.add("Anvita");
		
		ArrayList<String> newfamily = new ArrayList<String>();
		newfamily.add("Rohith");
		newfamily.add("Archana");
		newfamily.add("Harsha");
		newfamily.add("Advith");
		
		family.removeAll(newfamily);
		
		Iterator itr = family.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}

		family.retainAll(newfamily);
		
		Iterator itrone = family.iterator();
		
		while (itrone.hasNext()) {
			System.out.println(itrone.next());			
		}
		
	}

}
