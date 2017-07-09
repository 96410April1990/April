package javapractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ClassSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> adq = new ArrayDeque<String>();
		adq.add("Rohith");
		adq.add("Rags");
		adq.add("");
		adq.add("Sai");
		
		for (String adqOne : adq) {
			System.out.println(adqOne);
		}
		
		adq.offerFirst("Sachin");
		adq.offerLast("Ganguly");
		
		for (String adqTwo : adq) {
			System.out.println(adqTwo);
		}
		
		

	}

}
