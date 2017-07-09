package threeweekplan;

import java.awt.List;
import java.util.ArrayList;
import java.util.*;

/* ArrayList - uses dynamic array to store elements
 * 			   Manipulation in ArrayList is slow
 * 			   Can act only as a list
 * 			   better for storing and accessing data
 * 
 * LinkedList - uses doubly linked list to store elements
 * 				Manipulation in LinkedList is faster
 * 				Can act as a list as well as a queue
 * 				better for manipulating data 
 */

public class CollectionsSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> india = new ArrayList<String>();
		india.add("Dhoni");
		india.add("Kohli");
		
		LinkedList<String> pakistan = new LinkedList<String>();
		pakistan.add("Misbah");
		pakistan.add("Afridi");
		
		System.out.println("arraylist:" +india);
		System.out.println("linkedlist:" +pakistan);
		

	}

}
