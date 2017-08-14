package javapracticeone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PracticeFourFIS {
	
	
	@AfterClass
	public static void methodOne() {
		
		System.out.println("Hi, I am method one and i will run last");		
		
	}
	
	@Test
	public void methodTwo() {
		
		System.out.println("Hi, I am a test method!");
		
	}
	
	@Before
	public void methodThree() {
		
		System.out.println("Hi, I will run before the test method!");
		
	}
	
	@BeforeClass
	public static void methodFour() {
		
		System.out.println("Hi, I will run first!");
		
	}
	
	@After
	public void methodFive() {
		
		System.out.println("Hi, I will run after the test method!");
		
	}
	
	@Test
	public void methodSix() {
		
		System.out.println("Hi, I am another test method!");
		
	}
	
	

}
