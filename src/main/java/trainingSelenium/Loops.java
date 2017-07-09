package trainingSelenium;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Normal for loop:: " +i);
			
		}
		
		List<String> names = new ArrayList<String>();
		
		names.add("Rohith");
		names.add("Rags");
		names.add("Sai");
		names.add("Anish");
		names.add("Vaibhav");
		names.add("Mitesh");
		names.add("Hari");

		for (String list : names) {
			
			System.out.println("The elements in the array list are:" +list+""+"and the number of elements in the array list are:" +names.size());
			
		}
		
		for (int i=0; i<=names.size(); i++) {
			
			System.out.println("Printing the size:" +names.get(i));
			
		}
		
		int i=0;
		while(i<=names.size()) {
			
			System.out.println("Get the size of the loop collection:" +names.get(i));
		
		}
		
		do {
			
			System.out.println("Please enter your PIN");
			
		} while(false);
		
		while(true) {
			
			System.out.println("I am infinite");
			
		}
		
	}

}
