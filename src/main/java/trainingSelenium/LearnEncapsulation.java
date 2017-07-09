package trainingSelenium;

public class LearnEncapsulation {
	
	private int ssn;
	private String name;
	private int phone;

	private int getssn() {
		
		return ssn;
		
	}
	
	private String getname() {
		
		return name;
		
	}
	
	private int getphone() {
		
		return phone;
		
	}
	
	public void setssn(int newValue) {
		
		ssn = newValue;
		
	}
	
	public void setname(String newValue) {
		
		name = newValue;
		
	}
	
	public void setphone(int newValue) {
		
		phone = newValue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnEncapsulation empdetails = new LearnEncapsulation();
		empdetails.setssn(1234567890);
		empdetails.setname("Rohith");
		empdetails.setphone(994009641);
		
		System.out.println("The SSN of the employee is:" +empdetails.getssn());
		System.out.println("The name of the employee is:" +empdetails.getname());
		System.out.println("The phone number of the employee is:" +empdetails.getphone());		
		

	}

}
