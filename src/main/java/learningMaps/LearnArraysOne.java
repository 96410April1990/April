package learningMaps;

import java.util.Arrays;

public class LearnArraysOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] friends = new String[4];
		friends[0] = "rohith";
		friends[1] = "rags";
		friends[2] = "sai";
		friends[3] = "anish";
		
		System.out.println(friends.length+"\n");
		System.out.println(friends[3]+"\n");
		System.out.println(friends[0]+"\n");
		System.out.println(friends[2]+"\n");
		Arrays.sort(friends);
		//After sorting
		System.out.println(friends[0]);
		
		Arrays.fill(friends, "saba");
		System.out.println(friends[0]);
		
		int[] days = {1,2,3,4,5,6,7};
		System.out.println(days[3]);
		
		int[] daysone = days.clone();
		System.out.println(daysone[2]);
		
		System.out.println(Arrays.equals(days, daysone));

	}

}
