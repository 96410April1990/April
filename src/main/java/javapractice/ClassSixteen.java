package javapractice;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ClassSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> qe = new PriorityQueue<String>();
		
		qe.add("Rohith");
		qe.add("Rags");
		qe.add("Rohith");
		qe.add("");
		qe.add("Lavanya");
		
		Iterator<String> itr = qe.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		qe.remove("");
		
		System.out.println("head"+" "+qe.poll());
		System.out.println("head"+" "+qe.element());
		System.out.println(qe.peek());
		
		Iterator<String> itrOne = qe.iterator();
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		

	}

}
