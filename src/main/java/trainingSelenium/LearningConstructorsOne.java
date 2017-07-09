package trainingSelenium;

/* 
 * Parameterized constructors - Constructors that have parameters are called parameterized 
 * constructors and these are used to provide different values to distinct objects
 */

public class LearningConstructorsOne {
	
	int id;
	String name;
	
	LearningConstructorsOne(int i, String n) {
		
		id = i;
		name = n;
		
	}
	
	void display() {
		
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningConstructorsOne s1 = new LearningConstructorsOne(111, "Rohith");
		LearningConstructorsOne s2 = new LearningConstructorsOne(222, "Kajal");
		s1.display();
		s2.display();
		

	}

}
