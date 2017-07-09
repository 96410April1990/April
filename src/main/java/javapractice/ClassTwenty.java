package javapractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(1, "Rohith");
		lhm.put(2, "");
		lhm.put(3, "Rags");
		lhm.put(null, null);
		lhm.put(4, null);
		lhm.put(null, "Sai");
		
		System.out.println(lhm.size());
		
		for (Map.Entry lhmOne:lhm.entrySet()) {
			System.out.println(lhmOne.getKey()+" "+lhmOne.getValue());
		}

	}

}
