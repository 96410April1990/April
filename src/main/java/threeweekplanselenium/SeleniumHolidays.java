package threeweekplanselenium;

public class SeleniumHolidays {
	
	private String privateHoliday = "Feb 14";
	public String publicHoliday = "Jan 1, May 1";
	protected String floatingHoliday = "Bakrid, Onam";
	String defaultHoliday = "Saturday, Sunday";
	
	public boolean methodHolidays() {
		
		System.out.println(privateHoliday);
		System.out.println(publicHoliday);
		System.out.println(floatingHoliday);
		System.out.println(defaultHoliday);
		
		return true;
		
	}
	
	public void printHolidays() {
		
		methodHolidays();
		
	}

}
