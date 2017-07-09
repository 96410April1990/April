package trainingSelenium;

/* Rules for creating a construtor:
 * 
 * 1. Constructor name must be the same as its class name.
 * 2. Constructor must have no explicit return type.
 * 
 * There are two types of constructors in java:
 * 
 * 1. Default constructors - without arguments
 * 2. Parameterized constructors
 * 
 * Default constructor - Provides the default values to object like 0, null etc. depending on the
 * data type
 *  
 */

public class LearningConstructors {
	
	int id;
	String name;
	
	void display() {
		
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningConstructors s1 = new LearningConstructors();
		LearningConstructors s2 = new LearningConstructors();
		
		s1.display();
		s2.display();

	}

}
