package trainingSelenium;

public class StaticBindingOne extends StaticBinding {

	public void walk() {
		
		System.out.println("I am walking");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBindingOne samp = new StaticBindingOne();
		
		samp.walk();

	}

}
