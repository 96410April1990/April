package threeweekplan;

import java.util.Iterator;
import java.util.LinkedList;

/*Using LinkedList in collections */

public class CollectionsSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> men = new LinkedList<String>();
		men.add("Rohith");
		men.add("Rags");
		men.add("Sai");
		
		Iterator<String> guys = men.iterator();
		while (guys.hasNext()) {
			System.out.println(guys.next());			
		}
		
	}

}
