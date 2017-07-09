package week8;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class KarimRules {


	// @ how many times : Once
	@AfterSuite(groups={"dineIn","delivery"})
	public void refreshAndSleep(){
		System.out.println("Refresh and sleep");

	}


	// @ how many times : Once
	@BeforeSuite(groups={"dineIn","delivery"})
	public void wakeUpAndmakeUp(){
		System.out.println("Wake up in the morning and make up!!");
	}

}
