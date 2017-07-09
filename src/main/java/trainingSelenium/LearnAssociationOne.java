/* Aggregation - It is a special form of Association in java
 *  - forms a relationship between two classes */

package trainingSelenium;

public class LearnAssociationOne {
	
	int rollnum;
	String studentname;
	LearnAssociation studentaddr;
	
	LearnAssociationOne(int roll, String name, LearnAssociation addr) {
		
		this.rollnum = roll;
		this.studentname = name;
		this.studentaddr = addr;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnAssociation details = new LearnAssociation(329, "Chennai", "TamilNadu", "India");
		
		LearnAssociationOne detailsone = new LearnAssociationOne(324049, "Rohith", details);
		
		System.out.println(detailsone.rollnum);
		System.out.println(detailsone.studentname);
		//System.out.println(detailsone.studentaddr);
		System.out.println(detailsone.studentaddr.streetnum);
		System.out.println(detailsone.studentaddr.city);
		System.out.println(detailsone.studentaddr.state);
		System.out.println(detailsone.studentaddr.country);
		

	}

}
