package trainingSelenium;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switchcase("TUE");
		
		
	}

	private static void switchcase(String day) {
		// TODO Auto-generated method stub
		
		switch (day) {
		case "SUN":
			System.out.println("The day is SUN day");
			break;
			
		case "MON":
			System.out.println("The day is MON day");
			break;
			
		default:
			System.out.println("Sorry, Invalid Entry");
		
		}
	}

}
