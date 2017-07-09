package trainingSelenium;

public class LearningLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Learn for.. each.. loop
		int [] numbers = {10, 20, 30, 40, 50};
		
		System.out.println(numbers.length);
		for(int x:numbers) {
			System.out.println(x);
			System.out.println(",");
		}
		System.out.println("\n");
		
		String [] names = {"Rohith", "Sai", "Rags", "Vaibhav", "Anish"};
		
		System.out.println(names.length);
		for(String y:names) {
			System.out.println(y);
			System.out.println(",");
		}
	}

}
