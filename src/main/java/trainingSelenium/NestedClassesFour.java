package trainingSelenium;

public class NestedClassesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedClassesTwo printNum = new NestedClassesTwo();
		NestedClassesTwo.NestClass printNumOne = printNum.new NestClass();
		
		System.out.println(printNumOne.getNum());

	}

}
