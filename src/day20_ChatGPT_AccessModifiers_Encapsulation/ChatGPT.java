package day20_ChatGPT_AccessModifiers_Encapsulation;

import day20_ChatGPT_AccessModifiers_Encapsulation2.AccessModifierDemoProtected;

public class ChatGPT {
	
	//Data Numbers
	public String version = "ChatGPT 3.5";
	public static String founder = "Sam Altman";

	public static String reverseString(String value) {
		String reverseString = "";
		for(int i = value.length()-1; i>=0;i--) {
			reverseString = reverseString + value.charAt(i);
		}
		System.out.println(reverseString);
		return reverseString;
	}
	
	private void printSomething() {
		System.out.println("Something");
	}
	
	public static void main(String[] args) {
		String team = "England";
		//Reverse a String without String builder or String Buffer
		//team = team.reverse();
		String team2 = "Italy";
		System.out.println(team.equals(team2)); //will compare the literal and object
		System.out.println(team==team2); //comparison operator. Used to compare values of variables. 
		reverseString(team);
		System.out.println(founder);
		
		//AccessModifierDemoDefault obj1 = new AccessModifierDemoDefault();
		//Does not compile since we are creating an object of a default class outside of its package
		
		AccessModifierDemoProtected obj2 = new AccessModifierDemoProtected();
		//System.out.println(obj2.name); //--> not accessible due to protected access modifier
		//obj2.displayCompanyName("Tesla");// not accessible due to protected access modifier
	
	}

}
