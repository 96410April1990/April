package trainingSelenium;

public class ExtendInterface implements LearningInterfaceFour {

	@Override
	public void sex() {
		// TODO Auto-generated method stub
		
		System.out.println("I am a Male!");
		
	}

	@Override
	public void qualification() {
		// TODO Auto-generated method stub
		
		System.out.println("I am a MBA graduate!");
		
	}

	@Override
	public void relationshipStatus() {
		// TODO Auto-generated method stub
		
		System.out.println("I am single and ready to mingle!");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
		System.out.println("My name is Rohith Nandakumar!");
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		
		System.out.println("I am 26 years old!");
		
	}

	@Override
	public void dateOfBirth() {
		// TODO Auto-generated method stub
		
		System.out.println("My date of birth is 27/04/1990");
		
	}

	@Override
	public void employed() {
		// TODO Auto-generated method stub
		
		System.out.println("Yes, I am employed and i work at Cognizant!");
		
	}

	@Override
	public void languagesKnown() {
		// TODO Auto-generated method stub
		
		System.out.println("I speak Tamil, Telugu, Hindi, Urdu and English!");
		
	}
	
	public static void main(String args[]){
		
		ExtendInterface biodata = new ExtendInterface();
		
		biodata.name();
		biodata.age();
		biodata.dateOfBirth();
		biodata.sex();
		biodata.employed();
		biodata.languagesKnown();
		biodata.qualification();
		biodata.relationshipStatus();
		
	}

}
