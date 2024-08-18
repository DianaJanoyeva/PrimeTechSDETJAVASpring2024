package codingChallenges;


public class Coding_challenge3 {

	public static void main(String[] args) {
		//Given an integer 1990, reverse this integer and return it.
		int birthYear = 1990;
		
		System.out.println(reverseInt(birthYear));

	}

	static int reverseInt(int birthYear) {
		String str = Integer.toString(birthYear);
		String reversedBirthYear = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			reversedBirthYear = reversedBirthYear + str.charAt(i);
			
			
		}
		int reversedBirthYearInt = Integer.parseInt(reversedBirthYear);
		return reversedBirthYearInt;
	}
		
}
