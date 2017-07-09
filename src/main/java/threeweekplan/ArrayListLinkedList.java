package threeweekplan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("Rohith");
		names.add("Rags");
		names.add("Sai");
		
		List<String> namesone = new LinkedList<String>();
		namesone.add("Rohith");
		namesone.add("Rags");
		namesone.add("Sai");
		
		System.out.println("Arraylist:"+names);
		System.out.println("Linkedlist:"+namesone);

	}

}
