package codingChallenges;

import java.util.Arrays;

public class Coding_challenges1 {

	public static void main(String[] args) {
		String[] arrayOfStrings = {"Simon","Diana","Iliev","Artem","Uliana"};
		System.out.println(Arrays.toString(reverseArray(arrayOfStrings)));
	}

	
	//Given an array of integers, reverse and return the array.
	 
	
	//Given an array of strings of any length, reverse the array and return it
	 	static String[] reverseArray(String[] arrayOfStrings) {
	 		String[] reversedString = new String[arrayOfStrings.length];
	 		
	 		int i2 = 0;
	 		for(int i = arrayOfStrings.length-1; i>=0; i--) {
	 			reversedString[i2] = arrayOfStrings[i];
	 			i2++;
	 		}
	 		
	 		return reversedString;
	 		
	 	}
	 		
	 	//Given an integer 1990, reverse this integer and return it.
	 	
	 	//Given an array of Strings, reverse the first string/element in the array and return it
	 	
	 	//Given an array of characters, reverse the array of characters using a while loop without using a new empty array
	 	
	 	//_________________________________________________________________________________________________________________
}
		//Given an array of Strings, reverse every string in the array and return the same array back with the reversed string inside

		//You have array of integers. Reverse the array of integers using the while loop.

		//Given the array of strings, reverse the array using the while loop.


	