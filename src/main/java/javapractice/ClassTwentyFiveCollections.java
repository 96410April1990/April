package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassTwentyFiveCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> alOne = new ArrayList<Integer>();
		
		alOne.add(1);
		alOne.add(199);
		alOne.add(21);
		
		System.out.println(alOne.size());
		
		System.out.println(alOne);
		
		System.out.println(Collections.max(alOne));
		System.out.println(Collections.min(alOne));
		Collections.reverse(alOne);
		System.out.println(alOne);
				

	}

}
