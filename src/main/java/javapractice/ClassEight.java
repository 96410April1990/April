package javapractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ClassEight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohith");
		al.add("Rags");
		al.add(1,"Sai");
		System.out.println("Element at position 3:"+al.get(3));
		
		for (String alOne : al) {
			System.out.println(alOne);
		}
		
		//List Iterator
		ListIterator<String> itrOne = al.listIterator();
		System.out.println("Traversing elements in forward direction:");
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		Thread.sleep(3000);
		System.out.println("Traversing elements in backward direction");
		while (itrOne.hasPrevious()) {
			System.out.println(itrOne.previous());			
		}
	}

}
