package trainingSelenium;

/* Chaining constructors is nothing but a concept of calling different constructors from the same 
 * class. The constructors from the same class can be called using 'this' statement.
 * 
 * for example: to call a constructor with single string argument, we may use 'this("hello");'
 */

public class LearningChainingConstructors {

	public LearningChainingConstructors() {
		
		System.out.println("This is the default constructor");		
		
	}
	
	public LearningChainingConstructors(String str) {
		
		this();
		System.out.println("This is a constructor with single argument");
		
	}
	
	public LearningChainingConstructors(String str, int num) {
		
		this("Hello");
		System.out.println("This is a constructor with double arguments");
		
	}
	
	public LearningChainingConstructors(int num, int num2, int num3) {
		
		this("Hello", 2);
		System.out.println("This is a constructor with triple arguments");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningChainingConstructors callconstructors = new LearningChainingConstructors(2,4,6);
		

	}

}
