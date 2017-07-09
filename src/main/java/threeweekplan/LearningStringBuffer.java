package threeweekplan;

public class LearningStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer name = new StringBuffer("Rohith");
		name.append(" Nandakumar");
		
		System.out.println("The name is:" +name);
		
		StringBuffer nameone = new StringBuffer("Nanda");
		nameone.insert(1, "Rohith");
		System.out.println(nameone);
		
		nameone.replace(2, 3, "xyz");
		System.out.println(nameone);
		
		nameone.delete(2, 3);
		System.out.println(nameone);
		
		name.reverse();
		System.out.println(name);

	}

}
