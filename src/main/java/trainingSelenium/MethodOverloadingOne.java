package trainingSelenium;

public class MethodOverloadingOne {
	
	public void sumCalc(int a, int b) {
		
		System.out.println("The sum of two integers is:" +(a+b));
		
	}
	
	public void sumCalc(double a, double b) {
		
		System.out.println("The sum of two double values is:" +(a+b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingOne calcVal = new MethodOverloadingOne();
		calcVal.sumCalc(10, 10);
		calcVal.sumCalc(20.5, 30.6);
		
	}

}
