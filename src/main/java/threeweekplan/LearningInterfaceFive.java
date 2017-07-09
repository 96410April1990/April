package threeweekplan;

public class LearningInterfaceFive implements LearningInterfaceTwo, LearningInterfaceThree, LearningInterfaceFour {
	
	public void name() {
		
		System.out.println("My name is Rohith");
		
	}
	public void print() {
		
		System.out.println("Hi, My name is Rohith");
		
	}
	public void rohith() {
		
		System.out.println("Hello, My name is Rohith");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningInterfaceFive inter = new LearningInterfaceFive();
		inter.name();
		inter.print();
		inter.rohith();		

	}

}
