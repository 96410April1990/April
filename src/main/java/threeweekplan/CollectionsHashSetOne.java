package threeweekplan;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSetOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> actors = new HashSet<String>();
		actors.add("Alia");
		actors.add("Bipasha");
		actors.add("Kriti");
		actors.add("Shraddha");
		
		System.out.println(actors);
		
		Iterator<String> act = actors.iterator();
		while (act.hasNext()) {
			System.out.println(act.next());			
		}

	}

}
