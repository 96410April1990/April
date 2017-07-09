package threeweekplan;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(1);
		numbers.add(9);
		numbers.add(3);
		
		LinkedList<Integer> numbersone = new LinkedList<Integer>();
		
		numbersone.add(11);
		
		numbers.addAll(numbersone);
		
		Iterator<Integer> numbergame = numbers.iterator();
		
		while (numbergame.hasNext()) {
			System.out.println(numbergame.next());			
		}
		
	}

}
