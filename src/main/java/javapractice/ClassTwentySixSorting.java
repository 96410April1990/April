package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

import threeweekplan.Collections;

public class ClassTwentySixSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rohith");
		al.add("Sai");
		al.add("Rags");
		al.add("Vaibhav");
		
		Collections.sort(al);
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}

	}

}