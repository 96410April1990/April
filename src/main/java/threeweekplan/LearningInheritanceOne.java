package threeweekplan;

public class LearningInheritanceOne extends LearningInheritance {

	int salary = 850000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		LearningInheritanceOne employeeDetails = new LearningInheritanceOne();
		System.out.println("The name of the employee is:" +employeeDetails.name);
		System.out.println("The age of the employee is:" +employeeDetails.age);
		System.out.println("The date of the birth of the employee is:" +employeeDetails.dob);
		System.out.println("The salary of the employee is:" +employeeDetails.salary);
		

	}

}
