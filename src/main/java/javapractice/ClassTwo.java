package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ClassTwo extends ClassOne implements InterfaceOne {
	
	int rollNo;
	String name;
	int age;
	
	@Test
	public void collectionsChapterOne() throws InterruptedException {
		
		/* collections - It is a framework.
		 * used to store and manipulate group of objects.
		 * insertion, sorting, deletion, manipulation, searching are some of the functions performed using collections
		 * 
		 * Interfaces - set, list, queue, dequeue
		 * Classes - ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet etc).
		 */
		
		/* Methods in collection interface 
		 * 
		 * add
		 * addAll
		 * remove
		 * removeAll
		 * retainAll
		 * size
		 * clear
		 * contains
		 * containsAll
		 * iterator
		 * toArray
		 * isEmpty
		 * equals
		 * hashCode 
		 */
		
		//ArrayList
		
		/* can contain duplicate elements
		 * maintains insertion order
		 * non-synchronized
		 */
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohith");
		al.add("Rags");
		al.add("Sai");
		al.add("Ramya");
		al.add("Lavanya");
		
		//Traversing through the list using Iterator
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		Thread.sleep(3000);
		//Using for each loop
		for (String al1 : al) {
			System.out.println(al1);
		}
		Thread.sleep(3000);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rohith");
		al2.add("Rags");
		al2.add("Sai");
		al2.add("Ramya");
		al2.add("Lavanya");
		
		//adding two array lists
		al.addAll(al2);
		
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());			
		}
		Thread.sleep(3000);
		//using removeAll method
		al.removeAll(al2);
		
		Iterator itr3 = al.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());			
		}
		Thread.sleep(3000);
		//using retainAll method
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Sachin");
		al3.add("Ganguly");
		al3.add("Dravid");
		al3.add("Kumble");
		al3.add("Laxman");
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Dhoni");
		al4.add("Kohli");
		al4.add("Sachin");
		al4.add("Ganguly");
		
		al3.removeAll(al4);
		
		Iterator itr4 = al3.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());			
		}
		Thread.sleep(3000);
		
		al3.retainAll(al4);
		
		Iterator itr5 = al3.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());			
		}
	}
	
	

}
