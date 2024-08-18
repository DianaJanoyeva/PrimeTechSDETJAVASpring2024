package codingChallenges;

import java.util.Arrays;

public class Coding_challenge2 {

	public static void main(String[] args) {
		//Given an array of integers, reverse and return the array.
		int[] arrayOfNum = {1,2,3,4,5};
		System.out.println(Arrays.toString(intOfArrays(arrayOfNum)));

	}



		static int[] intOfArrays(int[] arrayOfNum) {
			int[] reversedArray = new int[arrayOfNum.length];
			
		int i2 = 0;
		for(int i = arrayOfNum.length-1; i>=0; i--) {
			reversedArray[i2] = arrayOfNum[i];
			i2++;
			
			
		}
		return reversedArray;
		
		
		}
			
	}
