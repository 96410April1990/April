package threeweekplan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listing = new ArrayList<String>();
		listing.add("Sasha");
		listing.add("Cobie");
		listing.add("Margot");
		
		Collections.sort(listing);
		
		Iterator<String> itr = listing.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		ArrayList listingone = new ArrayList();
		listingone.add(Integer.valueOf(500));
		listingone.add(Integer.valueOf(800));
		listingone.add(300);
		
		Collections.sort(listingone);
		
		Iterator<Integer> itrone = listingone.iterator();
		while (itrone.hasNext()) {
			System.out.println(itrone.next());			
		}
		
		
	}

}
