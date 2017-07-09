package threeweekplan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SortingCollectionsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList numbers = new ArrayList();
		numbers.add(Integer.valueOf(350));
		numbers.add(Integer.valueOf(325));
		numbers.add(310);
		
		//Collections.sort(numbers);
		
		Iterator<Integer> num = numbers.iterator();
		
		while (num.hasNext()) {
			System.out.println(num.next());			
		}
		

	}

}
