package threeweekplan;

public class LearnDynamicBindingTwo extends LearnDynamicBindingOne {
	
	void cricket() {
		
		System.out.println("Sachin is a great cricketer!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnDynamicBindingOne sachin = new LearnDynamicBindingTwo();
		sachin.cricket();
		
	}

}
