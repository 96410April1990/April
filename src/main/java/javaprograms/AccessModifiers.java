package javaprograms;

public class AccessModifiers {
	
	private String privateHoliday = "Feb 14";
	public String publicHolidays = "Jan 1, May 1";
	protected String floatingHolidays = "Bakrith, Ugadi, Onam";
	String defaultHolidays = "Saturday, Sunday";

	public boolean holidays() {
		
		System.out.println(privateHoliday);
		System.out.println(publicHolidays);
		System.out.println(floatingHolidays);
		System.out.println(defaultHolidays);
		
		
		return false;
				
	}
	
	public void printHoliday() {
		
		holidays();
		
	}

}
