package threeweekplan;

/*
 *  Connecting a method call to the method body is known as binding.
 *  
 *  Static Binding - also known as early binding
 *  Dynamic Binding - also known as late binding
 * 
 */

//Static binding - When the type of the object is determined at compile time

public class LearnStaticBinding {

	public void name() {
		
		System.out.println("Hi, My name is Rohith!");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnStaticBinding names = new LearnStaticBinding();
		names.name();
		
	}

}
