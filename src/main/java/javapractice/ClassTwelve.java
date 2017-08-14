package javapractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClassTwelve {

	//LinkedHashSet	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Rohith");
		lhs.add("Rohith");
		lhs.add("Sai");
		lhs.add("Anish");
		
		System.out.println("The size of the linkedhashset is:"+" "+lhs.size());
		
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}

	}

}
