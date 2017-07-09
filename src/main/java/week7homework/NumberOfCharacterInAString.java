package week7homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a string variable
		String name = "Rohith";
		
		//Convert the string variable into a char array
		char[] allChar = name.toCharArray();
		
		StringBuilder reversename = new StringBuilder(name);
		
		//Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		//Print the values in the char array
		System.out.println(name);
		
		//Print the number of character in the char array
		System.out.println("The total number of characters in the char array is:" +name.length());
		
		//Reverse and print the value stored in the char array
		System.out.println("After reversing the value:" +reversename.reverse());
		
		//Check the size of the string variable
		System.out.println("The size of the array is:" +reversename.length());
		
		

	}

}
