package learningMaps;

import java.util.Arrays;

public class LearningArraysTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int arrayOne[] = new int[3];
				
		arrayOne[0] = 1;
		arrayOne[1] = 2;
		arrayOne[2] = 3;
		
		for (int i = 0;  i < arrayOne.length; i++) {
			System.out.println(arrayOne[i]);
		}
		
		int arrayTwo[] = {100, 99, 98};
		int j;
		
		for (j = 0; j < arrayTwo.length; j++) {
			System.out.println(arrayTwo[j]);
		}
		
		//Multidimensional array
		int[][] arrThree = new int[2][2];
			
		arrThree[0][0] = 1;
		arrThree[0][1] = 2;
		arrThree[1][0] = 3;
		arrThree[1][1] = 4;
		
		for (int k = 0; k < arrThree.length; k++) {
			
			for (int l = 0; l < arrThree.length; l++) {
				System.out.println(arrThree[k][l]+"");
			}
		
			System.out.println();
			
		}		
		
		int[][] arrayFour = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int m = 0; m < arrayFour.length; m++) {
			
			for (int n = 0; n < arrayFour.length; n++) {
				
				System.out.println(arrayFour[m][n]+" ");
				
			}
			
			System.out.println();
			
		}
		
		/*int arrayFive[] = {1,2,3};
		
		Class c = arrayFive.getClass();
		String name = c.getName();
		
		System.out.println(name);*/

		//Copying an array in Java
		char[] copyFrom = {'a','b','r','o','h','i','t','h','c','d'};
		char[] copyTo = new char[6];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 6);
		System.out.println(new String(copyTo));
		
		//Adding two matrices in java
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{7,8,9},{10,11,12}};
		
		int c[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			
			for (int k = 0; k < 3; k++) {
				
				c[i][k] = a[i][k] + b[i][k];
				System.out.println(c[i][k]+" ");
				
			}
			
			System.out.println();
			
		}
		
		String[] friends = new String[6];
		friends[0] = "rohith";
		friends[1] = "rags";
		friends[2] = "sai";
		friends[3] = "anish";
		friends[4] = "vaibhav";
		friends[5] = "mitesh";
		
		System.out.println(friends.length);
		Arrays.sort(friends);
		Thread.sleep(3000);
		System.out.println(friends[0]);
		System.out.println(friends[5]);
		Arrays.fill(friends, "hari");
		System.out.println(friends[0]);
		
		
				
	}

}
