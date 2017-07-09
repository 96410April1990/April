package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "Rohith");
		mp.put(2, "Lavanya");
		mp.put(3, "Rags");
		mp.put(4, "Sai");
		
		for (Map.Entry m:mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//Traversing Map
		Set mapSet = mp.keySet();
		
		Iterator itrOne = mapSet.iterator();
		
		while (itrOne.hasNext()) {
			System.out.println(itrOne.next());			
		}
		

	}

}
