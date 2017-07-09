package javaprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int limit = 45;
		boolean isPrime;
		
		for (i=3; i<=limit; i++) {
			isPrime = true;
			for (j=2; j<i; j++) {
				if (i%j==0) {
					isPrime = false;
					System.out.println(i+" "+"is not a primary number");
					break;
				}				
			}
			if (isPrime) {
				System.out.println(i+" "+"is a primary number");
			}
		}
		
	}

}
