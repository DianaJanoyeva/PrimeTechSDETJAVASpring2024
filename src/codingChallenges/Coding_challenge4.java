package codingChallenges;


public class Coding_challenge4 {

	public static void main(String[] args) {
		//Given an array of Strings, reverse the first string/element in the array and return it
		String[] arrayOfChar = {"Diana", "Doina","Cristina","Artem", "Simon"};
		System.out.println(reverseString(arrayOfChar));
		

	}
		
		static String reverseString(String[] arrayOfChar) {
		String str = arrayOfChar[0];
		String reversed = "";
			for(int i = str.length()-1; i>=0; i--) {
				reversed = reversed + str.charAt(i);
			}
			
		
			return reversed;
		}
	
}