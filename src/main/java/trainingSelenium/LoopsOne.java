package trainingSelenium;

public class LoopsOne {

	public static void main(String[] args) throws InterruptedException {

		int x = 5;
		x = x + 10;
		System.out.println("The value is:" + x);

		int a = 10;
		int total;
		int totalvalue;

		do {
			System.out.println(a);
			a++;
			System.out.println("");
		} while (a <= 25);
		total = a;
		System.out.println("The total number of values is:" +total);
		
		Thread.sleep(2000);
		
		if(total <= 30) {
			System.out.println("The given value is true");
		}
		else if(total > 30) {
			System.out.println("you are pretty close");
		}
		else {
			System.out.println("Epic Fail !");
		}
		
		Thread.sleep(2000);
		
		while (total <= 30) {
			System.out.println("We now confirm that the total number of values is:" +total);
			break;
		}

		Thread.sleep(2000);
		
		switch(total) {
			case 1: totalvalue = 25;
					break;
			case 2: totalvalue = 27;
					break;
			case 3: totalvalue = 28;
					break;
			default: totalvalue = 26;
		
		}
		
		System.out.println(total);
	}
}
