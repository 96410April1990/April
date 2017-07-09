package week8;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TheEnd implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Set an alarm to call Karim to fly back to India");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Karim is back!! - To testleaf :D");
	}

	
	
	
	
}
