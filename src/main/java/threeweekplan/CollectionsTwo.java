package threeweekplan;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionsOne first = new CollectionsOne("rohith", 26, 324049);
		CollectionsOne second = new CollectionsOne("rags", 26, 315545);
		CollectionsOne third = new CollectionsOne("sai", 26, 388412);
		
		ArrayList<CollectionsOne> details = new ArrayList<CollectionsOne>();
		details.add(first);
		details.add(second);
		details.add(third);
		
		Iterator itr = details.iterator();
		
		while(itr.hasNext()) {
			
			CollectionsOne co = (CollectionsOne)itr.next();
			System.out.println(co.name+" "+co.age+" "+co.rollno);
			
		}
		
	}

}
