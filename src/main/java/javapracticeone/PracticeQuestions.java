package javapracticeone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import edu.emory.mathcs.backport.java.util.Arrays;

public class PracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2017, 7, 26);
		date.plusYears(2);
		System.out.println(date);
		
		LocalDate dateOne = date.plusYears(3);
		System.out.println(dateOne);
		
		int i = 2;
		Integer i1 = 2;
		
		System.out.println(i+" "+i1);
		
		//ArrayList
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rohith");
		al.add("Rags");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		//Vector
		Vector<String> ve = new Vector<String>();
		
		ve.addElement("Rohith");
		ve.addElement("Rags");
		
		Iterator<String> itrOne = ve.iterator();
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		
		Enumeration<String> enu = ve.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());			
		}
 		
		
		String[] name = new String[] {"rohith", "rags"};
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(name));
		
		System.out.println(names);
		
		for (String nameOne : names) {
			System.out.println(nameOne);
		}
		
		Iterator<String> itrTwo = names.iterator();
		
		while (itrTwo.hasNext()) {
			System.out.println(itrTwo.next());			
		}
		
		//Converting an array list into array
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Rohith");
		friends.add("Sai");
		friends.add("Rags");
		
		String[] friendsOne = new String[friends.size()];
		friendsOne = friends.toArray(friendsOne);
		
		for (String friendsTwo : friendsOne) {
			System.out.println(friendsTwo);
		}
		
	}

}
