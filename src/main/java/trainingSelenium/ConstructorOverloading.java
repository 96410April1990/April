package trainingSelenium;

/*It is a technique in java where the class has many number of constructors that differ in 
 * parameter lists. 
 * 
 * The compiler differentiates these constructors taking into account, the number of parameters
 * in the list and their type. * 
 */

public class ConstructorOverloading {

	int id;
	String name;
	int age;
	
	ConstructorOverloading(int i, String n) {
		
		id = i;
		name = n;
		
	}
	
	ConstructorOverloading(int i, String n, int a) {
		
		id = i;
		name = n;
		age = a;
		
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+age);
		
	}
	
	public static void main(String args[]) {
		
		ConstructorOverloading sampleobject = new ConstructorOverloading(324049, "Rohith");
		ConstructorOverloading sampleobjectone = new ConstructorOverloading(324049, "Rohith", 26);
		
		sampleobject.display();
		sampleobjectone.display();
		
	}
	
}
