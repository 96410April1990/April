package threeweekplan;

public class LearningInterfaceOne implements LearningInterface {
	
	public void print() {
		
		System.out.println("Hey there, This is Rohith!");
		
	}
	
	public static void main(String[] args) {
		
		LearningInterfaceOne printInt = new LearningInterfaceOne();
		printInt.print();
		
	}
	
}
