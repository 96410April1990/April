package javapracticeone;

public class UsingThisKeyword {

	/**
	 * this - 'this' keyword is used to distinguish between the instance variable and the local variable in a class if the method names are same.
	 * 
	 * this keyword refers to the local variables.
	 * 
	 */
	
	String name;
	int age;
	
	UsingThisKeyword(String name, int age) {
		
		this.name = name;
		this.age = age;	
		
	}
	
	public void displayResult() {
		
		System.out.println("The name of the candidate is:"+" "+name+" "+"and the age is:"+" "+age);
		
	}	
	
}
