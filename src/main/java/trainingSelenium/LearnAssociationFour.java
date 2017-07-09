package trainingSelenium;

public class LearnAssociationFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnAssociationTwo carDe = new LearnAssociationTwo("Ford", 190.05, 4570);
		
		LearnAssociationThree driver = new LearnAssociationThree("Rohith", 26);
		
		System.out.println("The driver"+" "+driver.driverName+","+" "+"whose age is"+" "+driver.driverAge
				+" "+"drives the car"+" "+carDe.carName+" "+"whose number is"+" "+carDe.carId+" "+
				"and it's top speed is"+" "+carDe.carSpeed);
	
	}

}
