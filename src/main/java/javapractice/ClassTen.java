package javapractice;

import java.util.ArrayList;
import java.util.List;

public class ClassTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ClassNine> all = new ArrayList<ClassNine>();
		
		ClassNine a1 = new ClassNine("Rohith", 27, "B.Tech", "Software Engineer");
		ClassNine a2 = new ClassNine("Sai", 27, "B.Tech", "Software Engineer");
		
		all.add(a1);
		all.add(a2);
		
		for (ClassNine classNine : all) {
			System.out.println(classNine.name+" "+classNine.age+" "+classNine.profession+" "+classNine.qualification);
		}		

	}

}
