package trainingSelenium;

public class NestedClassesFive {
	
	void methodOne() {
		
		final int num = 270490;
		
		class ClassInaMethod {
			
			public void getnum() {
				
				System.out.println("The number is:" +num);
				
			}
			
		}
		
		ClassInaMethod printnum = new ClassInaMethod();
		printnum.getnum();
		
	}
	
	public static void main(String[] args) {
		
		NestedClassesFive finalnum = new NestedClassesFive();
		finalnum.methodOne();
		
	}
	

}
