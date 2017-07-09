package trainingSelenium;

//Program to learn runtime exception

public class ExceptionHandlingChapterOne {
	
	public static void main(String[] args) throws ArithmeticException {
		
		try {
			int a = 10;
			System.out.println(a/0);	
		}
		catch (ArithmeticException e) {
			System.out.println("I am in catch block");						
		}
		finally {	
			System.out.println("I am in the finally block");
		}
		
		System.out.println("Exception done");
	}
	
	

}
