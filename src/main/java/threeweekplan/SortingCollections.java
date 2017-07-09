package threeweekplan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rohith");
		names.add("Rags");
		names.add("Sai");
		
		Collections.sort(names);
		
		Iterator<String> name = names.iterator();
		
		while (name.hasNext()) {
			System.out.println(name.next());			
		}

	}

}
