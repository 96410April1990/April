package trainingSelenium;

public class ImplementingInterface implements LearningInterface, LearningInterfaceOne {

	@Override
	public void wakeup() {
		// TODO Auto-generated method stub
		
		System.out.println("I wake up early in the morning!");
		
	}

	@Override
	public void school() {
		// TODO Auto-generated method stub
		
		System.out.println("I go to school!");
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
		System.out.println("I study!");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		System.out.println("I play cricket!");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I am a vegetarian!");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("I sleep at 9 in the night!");
		
	}

	public static void main(String args[]) {
		
		ImplementingInterface aboutme = new ImplementingInterface();
		
		aboutme.wakeup();
		aboutme.school();
		aboutme.study();
		aboutme.play();
		aboutme.eat();
		aboutme.sleep();
		
	}
	
}
