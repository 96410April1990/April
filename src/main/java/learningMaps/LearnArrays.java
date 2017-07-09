package learningMaps;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] friends = new String[6];
		friends[0] = "rohith";
		friends[1] = "rags";
		friends[2] = "sai";
		friends[3] = "mitesh";
		friends[4] = "hari";
		friends[5] = "vaibhav";
		
		//Print the elements stored in the array
		System.out.println("The number of elements in the array are:"+" "+friends.length);
		
		System.out.println(friends[1]+" "+friends[2]);
		//System.out.println(friends[6]);
		Arrays.sort(friends);
		System.out.println("The elements in the array after sorting:"+" "+friends[0]+" "+friends[5]);
		Arrays.fill(friends, "anish");
		System.out.println(friends[0]);
		
		int[] days = {1,2,3,4,5,6,7};
		System.out.println(days[0]);
		
		System.out.println(Arrays.binarySearch(days, 3));
		
		int[] daysone = days.clone();
		System.out.println(daysone.length);

	}

}
