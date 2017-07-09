package threeweekplan;

import java.util.Enumeration;
import java.util.Vector;

import mx4j.tools.config.DefaultConfigurationBuilder.New;

/* Difference b/w arraylist and vector
 * 
 */

public class LearningVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> names = new Vector<String>();
		
		names.add("Rohith");
		names.addElement("Sai");
		names.addElement("Rags");
		
		Enumeration<String> enu = names.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());			
		}
		
		
		
	}

}
