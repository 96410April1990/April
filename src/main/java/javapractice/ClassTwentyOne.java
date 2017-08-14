package javapractice;

import java.util.Hashtable;
import java.util.Map;

public class ClassTwentyOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Rohith");
		//ht.put(null, null);
		ht.put(2, "Vaibhav");
		ht.put(3, "Sai");
		//ht.put(4, null);
		
		for (Map.Entry htOne : ht.entrySet()) {
			System.out.println(htOne.getKey()+" "+htOne.getValue());
		}
		
		Thread.sleep(3000);
		
		ht.remove(1, "Rohith");
		ht.put(4, "Rags");
		
		for (Map.Entry htTwo : ht.entrySet()) {
			System.out.println(htTwo.getKey()+" "+htTwo.getValue());
		}
		
		Thread.sleep(3000);
		
		System.out.println(ht.size());
		
		if (ht.containsKey(1)) {
			System.out.println("Yeah mate, the value that you are looking for is available in the Hash table");
		} else {
			System.out.println("I am sorry mate, the value that you are looking for is not available");
		}
		
		
		
	}

}
