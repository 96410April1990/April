package trainingSelenium;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, count;
		
		System.out.println("The odd numbers are:");
		for(n=100; n<=200; n++){
			
			if(n%2!=0){
				count = n;
				System.out.println(count);
				
			}
			else if(n%2==0) {
				System.out.println("Sorry, these are even numbers");
			}
			
		}
		
	}

}
