package threeweekplanselenium;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ArrayList_ChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rohith");
		al.add("Rags");
		al.add("Sai");
		
		//Using iterator in while loop
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		System.out.println("\n");
		
		//Using for loop
		for (String entry : al) {
			System.out.println(entry+" "+"\n");
		}
		
		

	}

}
