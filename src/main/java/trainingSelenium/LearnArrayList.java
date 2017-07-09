package trainingSelenium;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Array list in java
		List<String> usingArray = new ArrayList<String>();
		
		usingArray.add("Hi");
		usingArray.add("Hello");
		usingArray.add("Howdy");
		usingArray.add("What's up");
		usingArray.add("Bye");
		
		System.out.println("\n"+usingArray.get(0));
		System.out.println(usingArray.get(1));
		System.out.println(usingArray.get(2));
		System.out.println(usingArray.get(3));
		System.out.println(usingArray.get(4));
		
		for (String wishes : usingArray) {
			
			System.out.println("\n"+"The elements in the array list are:" +wishes);
			
		}
		
		System.out.println("\n"+"That's it, folks!");
		
		System.out.println("\n"+"Adding some more values to the existing array list");
		
		System.out.println("\n");
		
		usingArray.add("Hi There!");
		usingArray.add("How is it going?");
		usingArray.add("Take care");
		
		System.out.println("\n"+usingArray.get(5));
		System.out.println(usingArray.get(6));
		System.out.println(usingArray.get(7));
		
		for (String wishes : usingArray) {
			
			System.out.println("\n"+"The elements in the array list are:" +wishes);
			
		}
		
		System.out.println("\n"+"That's it, folks!");
	}

}
