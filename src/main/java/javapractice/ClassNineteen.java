package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ClassNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hshmp = new HashMap<Integer, String>();
		
		hshmp.put(1, "Rohith");
		hshmp.put(2, "Rags");
		hshmp.put(3, "Sai");
		
		System.out.println(hshmp.size());
		
		for (Map.Entry hm : hshmp.entrySet()) {
			System.out.println(hm.getKey()+" "+hm.getValue());
		}
		
		if (hshmp.containsKey(3)) {
			System.out.println(hshmp.get(3));
		} else {
			System.out.println("Sorry mate, negative!");
		}
		
		Set hshmpOne = hshmp.entrySet();
		
		Iterator itr = hshmpOne.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}

}
