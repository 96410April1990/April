package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassTwentyFourCollections {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<String>();
		
		al.add("Rohith");
		al.add("Rags");
		al.add("Sai");
		
		System.out.println("The size of the array list is:"+" "+al.size());
		
		System.out.println(al);
		
		Thread.sleep(3000);
		
		Collections.addAll(al, "Ramya", "Lavanya");
		
		System.out.println(al);
		
		String alOne[] = {"Saba", "Vaibhav"};
		
		Collections.addAll(al, alOne);

		System.out.println(al);
		
		//Collections.replaceAll(al,);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
		
	}

}
