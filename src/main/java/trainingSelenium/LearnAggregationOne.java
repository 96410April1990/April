package trainingSelenium;

public class LearnAggregationOne {
	
	int empid;
	int phone;
	LearnAggregation address;
	
	LearnAggregationOne(int emp, int ph, LearnAggregation add) {
		
		this.empid = emp;
		this.phone = ph;
		this.address = add;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnAggregation biodata = new LearnAggregation("Rohith", 26, "Male", "Chennai", "TN", "India");
		
		LearnAggregationOne details = new LearnAggregationOne(324049, 994009641, biodata);
		
		System.out.println(details.empid);
		System.out.println(details.phone);
		System.out.println(details.address.name);
		System.out.println(details.address.age);
		System.out.println(details.address.sex);
		System.out.println(details.address.city);
		System.out.println(details.address.state);
		System.out.println(details.address.country);

	}

}
