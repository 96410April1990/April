package week1;

public class ExerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Program to print the fibanocci series
	
	//Declare the variables
	int n1=0, n2=1, n3, i, count=11;
	
	//Print the values of n1 and n2 first
	System.out.println(n1+"\n"+n2);
	
	//Print the values up to count 11
	for(i=2;i<=count;++i)
	{
		n3=n1+n2;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;
	}
	
	}

}
