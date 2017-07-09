package trainingSelenium;

/*If a class has multiple methods by the same name but different parameters or data types, it is 
known as method overloading*/


public class MethodOverloading {
	
	public void sum(int x, int y) {
		
		System.out.println("The sum of two numbers is:"+(x+y));
		
	}
	
	public void sum(int x, int y, int z) {
		
		System.out.println("The sum of three numbers is:"+(x+y+z));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading calc = new MethodOverloading();
		calc.sum(10, 20);
		calc.sum(20, 20, 30);
		
	}

}
