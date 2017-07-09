package week1;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Program to find whether a number is prime or not
	
		int limit = 45;
		
		System.out.println("The prime numbers between 30 and 45 are:");
		
		for(int i=3; i<=limit; i++){
			
			boolean isPrime = true;
			
			for(int j=2; j<i; j++){
			
			if(i%j == 0)			
			{
				isPrime = false;
				break;
			}
		}
			if(isPrime)
			{
				System.out.println(i+" is a prime number");
			}
		}
		
	}
		
		
	}
