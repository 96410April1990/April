package threeweekplan;

public class LearningStringComparionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rohith";
		char s2[] = {'r','o','h','i','t','h'};
		String s3 = new String(s2);
		String s4 = "ROHITH";
		
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
	}

}
