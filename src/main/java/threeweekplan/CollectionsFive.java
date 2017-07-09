package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> guys = new ArrayList<String>();
		guys.add("Rohith");
		guys.add("Rags");
		guys.add("Sai");
		
		ArrayList<String> girls = new ArrayList<String>();
		girls.add("Megan fox");
		girls.add("cameron diaz");
		girls.add("Scarlett johansson");
		
		guys.addAll(girls);
		
		Iterator addList = guys.iterator();
		
		while (addList.hasNext()) {
			System.out.println(addList.next());
		}
		
		

	}

}
