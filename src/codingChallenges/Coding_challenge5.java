package codingChallenges;

import java.util.Arrays;

public class Coding_challenge5 {
	//Given an array of characters, reverse the array of characters using a while loop without using a new empty array
				public static String[] reverseArray(String[] arr) {
					int leftIndex = 0;
					int rightIndex = arr.length-1;
					
					while(rightIndex>leftIndex) {
						String name = arr[leftIndex];
						
						arr[leftIndex] = arr[rightIndex];
						arr[rightIndex] = name;
						rightIndex--;
						leftIndex++;
					}
					return arr;
				}
	
	
	
	
	
	
	public static void main(String[] args) {
		String[] arrayOfStr = {"Kate","Michael","Kostya","Larisa","Marina"};
		String[] arrayResult = (reverseArray(arrayOfStr));
		System.out.println(Arrays.toString(arrayResult));		
		
	}
}