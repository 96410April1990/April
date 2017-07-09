package trainingSelenium;

public class LearnEncapsulationOne {
	
	private String name;
	private String sex;
	private int age;
	
	private String getname() {
		
		return name;
		
	}
	
	private String getsex() {
		
		return sex;
		
	}
	
	private int getage() {
		
		return age;
		
	}
	
	public void setname(String newValue) {
		
		name = newValue;
		
	}
	
	public void setsex(String newValue) {
		
		sex = newValue;
		
	}

	public void setage(int newValue) {
		
		age = newValue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnEncapsulationOne details = new LearnEncapsulationOne();
		
		details.setname("Rohith");
		details.setsex("Male");
		details.setage(26);
		
		System.out.println("The name of the employee is:" +" "+details.getname());
		System.out.println("The sex of the employee is:" +" "+details.getsex());
		System.out.println("The age of the employee is:" +" "+details.getage());
		
	}

}
