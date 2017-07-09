package threeweekplan;

public class LearningPolymorphismFour extends LearningPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearningPolymorphism names = new LearningPolymorphismOne();
		LearningPolymorphism namesone = new LearningPolymorphismTwo();
		LearningPolymorphism namestwo = new LearningPolymorphismThree();
		
		System.out.println(names.name());
		System.out.println(namesone.name());
		System.out.println(namestwo.name());		
		
	}

}
