package trainingSelenium;

public class LearningEncapsulationTwo {

	private String name;
	private int age;
	private String dob;
	private String sex;
	private String qualification;
	
	private String getname() {
		
		return name;
		
	}
	
	private int getage() {
		
		return age;
		
	}
	
	private String getdob() {
		
		return dob;
		
	}
	
	private String getsex() {
		
		return sex;
		
	}
	
	private String getqualification() {
		
		return qualification;
		
	}
	
	public void setname(String newValue) {
		
		name = newValue;
		
	}
	
	public void setage(int newValue) {
		
		age = newValue;
		
	}
	
	public void setdob(String newValue) {
		
		dob = newValue;
		
	}
	
	public void setsex(String newValue) {
		
		sex = newValue;
		
	}
	
	public void setqualification(String newValue) {
		
		qualification = newValue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningEncapsulationTwo biodata = new LearningEncapsulationTwo();
		
		biodata.setname("Rohith");
		biodata.setage(26);
		biodata.setdob("27/04/1990");
		biodata.setsex("Male");
		biodata.setqualification("MBA");
		
		System.out.println("The name of the employee is:" +" "+biodata.getqualification());
		System.out.println("The age of the employee is:" +" "+biodata.getage());
		System.out.println("The dob of the employee is:" +" "+biodata.getdob());
		System.out.println("The sex of the employee is:" +" "+biodata.getsex());
		System.out.println("The qualification of the employee is:" +" "+biodata.getqualification());
		

	}

}
