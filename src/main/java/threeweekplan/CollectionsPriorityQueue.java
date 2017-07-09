package threeweekplan;

import java.util.Iterator;
import java.util.PriorityQueue;

/* Java Queue Interface - Queue interface basically orders the elements in FIFO manner.
 * 						  
 * PriorityQueue - provides the facility of using the queue but does not order the 
 * 				   elements in FIFO order. 
 */

public class CollectionsPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> names = new PriorityQueue<String>();
		names.add("Rohith");
		names.add("Kriti");
		names.add("Sonali");
		
		System.out.println("head:"+names.element());
		System.out.println("head:"+names.peek());

		System.out.println("Iterating the queue elements:\n");
		
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		names.remove();
		names.poll();
		
		System.out.println("after removing two elements");
		
		Iterator<String> itr1 = names.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());			
		}
		
	}

}
