package threeweekplan;

public class LearningStringComparisonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rohith";
		char s2[] = {'r','o','h','i','t','h'};
		String s3 = new String(s2);
		String s4 = "ROHITH";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
	}

}
