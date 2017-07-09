package testngExamples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
  
	@BeforeMethod
	public void usingBeforeSuite() {
		System.out.println("Hi, i am in before suite");
	}

	@BeforeTest
	public void usingBeforeTest() {
		System.out.println("Hi, i am in before test");
	}

}
