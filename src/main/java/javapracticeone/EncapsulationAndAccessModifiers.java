package javapracticeone;

public class EncapsulationAndAccessModifiers {
	
	/**
	 * Access modifiers 
	 * 
	 * private - can be applied to variables and methods. The variables and methods cannot be accessed outside the class. It will throw compile-time error.
	 * default - If we do not specify an access modifier, then the class or method is considered as default. This can be accessed within the package and not outside the package.
	 * protected - This cannot be applied to classes. If a variable or a method or a constructor is marked is protected, then it can be accessed within and outside the package but only using inheritance.
	 * public - This has the widest scope in Java. If a class, variable, method or a constructor is marked as public, then it can be accessed within/outside the package. 
	 */
	
	/**
	 * Encapsulation - A mechanism in which the code and data are wrapped into a single unit.
	 * 
	 * Advantages:
	 * 
	 * The user can mark the class as read-only or write only. The data can be passed/retrieved using getter and setter methods. 
	 */
	
	String name;

	public String getName() {
		
		return name;

	}
	
	public String setName(String name) {
		
		this.name = name;
		return name;
		
	}

}
