package threeweekplan;

public class LearningStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "rohith";
		String nameone = "ROHITH";
		String trimname = " rohith ";
		String nametwo = new String("rohith");
		String namethree = nametwo.intern();
		int num = 6;
		String numone = String.valueOf(num);
		String replacename = "Rohith is a nice guy";
		String replacenameone = replacename.replace("Rohith", "rohith");
		
		System.out.println(nameone.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(trimname.trim());
		System.out.println(trimname.startsWith(" r"));
		System.out.println(trimname.endsWith("h "));
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(namethree);
		System.out.println(numone+10);
		System.out.println(replacenameone);

		
	}

}
