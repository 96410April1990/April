package trainingSelenium;

public class JavaConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello, World !!!");
		
		//declare an integer variable and a String variable
		int i = 10;
		double j;

		//convert the integer variable to double and print the value
		j = i;

		//Print the value of the declared and converted variable
		System.out.println("The value of the given variable is:" + j);
		
		//declare a string variable and convert it into an integer variable
		String k = "100";
		int l = Integer.parseInt(k);
		
		//print the value of the declared and converted variable
		System.out.println("The value of the given variable is:" + l);
		
		//declare a string variable and convert it into double
		double m = Double.parseDouble(k);
		
		//print the value of the declared and converted variable
		System.out.println("The value of the given variable is:" + m);
		
		//declare a string variable and convert it into long
		long n = Long.parseLong(k);
		
		//print the value of the declared and converted variable
		System.out.println("The value of the given variable is:" + n);
		
		int [] numbers = {10, 20, 30, 40, 50};
		
		for (int x : numbers) {
			System.out.println(x);
			//System.out.println(",");
		}
		
		//System.out.println("\n");
		
		String [] names = {"Rohith", "Rags", "Sai", "Anish", "Vaibhav"};
		
		for (String y : names) {
			System.out.println(y);
			//System.out.println(",");
		}
	}

}
