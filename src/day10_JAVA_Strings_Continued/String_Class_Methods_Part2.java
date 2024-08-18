package day10_JAVA_Strings_Continued;

import java.util.Scanner;

public class String_Class_Methods_Part2 {
	public static void main(String[] args) {
		//declare Scanner object
				Scanner object1 = new Scanner(System.in);
				System.out.println("Hello");
				
				
		        //String Methods
		       
		        //Length - The length method returns the number of characters in a string including spaces.
		       
		        String name10 = " Haaland ";//contains 9 characters
		        int stringLength = name10.length();
		        System.out.println(stringLength);
		       
		        //First name must be less than or equal to 50 characters
		       
		        //charAt method - the charAt method returns the character present in the index provided in the method argument.
		        String name11 = "Jason Rojas";//11 characters
		        System.out.println(name11.charAt(8));//j
		        char a = name11.charAt(8);
		        System.out.println(a);
		        // System.out.println(name11.charAt(25));//exception created, exception is a programmatic execution error
		        //Specific exception - StringIndexOutOfBoundsException
		        int charIndex = name11.length();//11
		       
		        //pre-decreemnted the charIndex to 10
		        System.out.println(name11.charAt(--charIndex));
		       
		       
		        //toUpperCase - converts the string to upper case letters.
		        System.out.println(name11.toUpperCase());
		        //Jason Rojas --> JASON ROJAS
		       
		       
		        //toLowerCase - converts the string to lower case letters.
		        //Jason Rojas --> jason rojas
		        System.out.println(name11.toLowerCase());
		       
		        //re-assign name 11 to a new value
		        name11 = name11.toUpperCase();
		        name11 = name11.toLowerCase();
		        name11 = name11 + "chagpt";
		        System.out.println(name11);
		       
		        //substring(number)Method
		        String item = "Espresso Machine 123456";
		        System.out.println(item.substring(17));//everything after
		        System.out.println(item.substring(0,8));//specific section
		       
		        //indexOf("")method-Accepts char, returns index value
		        String programming = "I am learning Java";
		        System.out.println(programming.indexOf("J"));
		        System.out.println(programming.indexOf("a"));
		       
		        //Replace(existing value,new value)Method
		        System.out.println(programming.replace("J", "H"));
		        System.out.println(programming.replace("a","b"));
		       
		        //equals(String)Method-checks if 2 string are equal-returns a boolean value
		        String str1 = "Java";
		        String str2 = "Java";
		        String str3 = new String("Java");
		        System.out.println(str1.equals(str3));
		        System.out.println(str1==str2);
		        System.out.println(str1==str3);
		        //equal methods can be used to compare:
		        //literal to literal, literal to object, and object to object,
		        //while == can only compare literal to literal
		       
		        //equalsIgnoreCase(String)Method
		        String str4 = "Jaguar";
		        String str5 = str4.toUpperCase();
		        System.out.println(str4.equals(str5));//case sensitive
		        System.out.println(str4.equalsIgnoreCase(str5));//NOT case sensitive
		       
		        //compareTo()Method-returns 0 when equal, and anything >0 when not equal
		        System.out.println(str1.compareTo(str2));
		        System.out.println(str1.compareTo(str4));
		        System.out.println(str4.compareToIgnoreCase(str5));
		        //compareToIgnoreCase-Not Case Sensitive
		       
		        //concat() Method
		        System.out.println(str1.concat(str4));
		       
		        //contains() Method-returns a boolean value-Case Sensitive-sequence sensitive
		        String fruit1 = "Apple";
		        String fruit2 = "Orange";
		        System.out.println(fruit1.contains("Al"));
		        System.out.println(fruit2.contains("Or"));
		       
		        //endsWith() Method-returns a boolean value-Case Sensitive-sequence sensitive
		        System.out.println(fruit1.endsWith("le"));
		        System.out.println(fruit2.endsWith("Orange"));
		        System.out.println(fruit2.endsWith("ang"));
		       
		        //startsWith() Method-similar to endsWith()-returns a boolean value-Case Sensitive-sequence sensitive
		       
		        //isEmpty Method-returns a boolean value, including "spaces" will be considered as false
		        String myStr1 = "";
		        String myStr2 = "Hello";
		        System.out.println(myStr1.isEmpty());
		        System.out.println(myStr2.isEmpty());
		       
		        //trim() Method-removes the spaces on both sides
		        String student = " Benjamin Franklin ";
		        System.out.println(student.trim());
		       
		        //valueOf() Method-convert non string data type into String data type
		        int x = 10;
		        String num = String.valueOf(x);
		        System.out.println(num + x);
		       
		        //split() Method
		        String studentList = "Ajay,Dan,Armen";
		        String[] myArray = studentList.split(",");
		        System.out.println(myArray[0]);
		        System.out.println(myArray[1]);
		        System.out.println(myArray[2]);
		        
		        //converting from in int to string
		        //String.valueOf(x); creating a new String
		        
		        //converts to an integer from string
		        //Integer.parseInt(string value);
		        
		        //object.toString //converting stringbuilder and stringbuffer to a string
		       
	}
}
		        
		        