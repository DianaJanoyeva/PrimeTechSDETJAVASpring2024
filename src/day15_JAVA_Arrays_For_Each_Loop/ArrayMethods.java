package day15_JAVA_Arrays_For_Each_Loop;
import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5};
		
		String arrayNumbers = Arrays.toString(numbers);
		System.out.println(arrayNumbers);
		//arrayNUmbers = "[1,2,3,4,5]"
		//COnverts an array into String represenation
		//toString - accept parameters - array 
		
		boolean[] values = {true,true};
		System.out.println(values[0]);
		String boolValues = Arrays.toString(values);
		System.out.println(boolValues);
		
		//sort method
		
		int[] numSequence = {0,-1000, 345, -89, 100, 1200};
		//-1000, -89, 0, 100, 345, 1200
		//The sort method will sort an Array in ascending order
		//Ascending order - smallest values to largest values
		
		Arrays.sort(numSequence);//sorts the Array in ascending order
		
		for(int nums: numSequence) {
			System.out.println(nums);
		}
		
		String[] students = {"Ahmed","Mina","Adila","Dan"};
		Arrays.sort(students);// {Adila, Ahmed, Dan, Mina} ascending order a-z
		
		for(String student: students) {
			System.out.println(student);
		}
		
		for(int i = students.length-1; i >= 0 ; i--) {
			System.out.println(students[i]);
		}
		
		int[] nums = {1,2,3,4,4,5};
		
		int index = Arrays.binarySearch(nums, 3);
		System.out.println(index);//2
		
		char[] alphabet = {'a','b','c'};
		int index2 = Arrays.binarySearch(alphabet, 'c');//2
		System.out.println(index2);
		
		String[] cars = {"BMW", "Honda"};
		int index3 = Arrays.binarySearch(cars, "BMW");
		System.out.println(index3);
		
		//Expected to copy all of numbers1 into numbers2 

		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = Arrays.copyOf(numbers1, numbers.length);
		System.out.println(numbers1);
		System.out.println(numbers2);
		
		for(int num: numbers1) {
			System.out.println(num);
		}
		

		for(int num: numbers2) {
			System.out.println(num);
		}
        
		String[] players1 = {"Messi", "Ronaldo", "Bruno", "Neur"};
		String[] players2 = {"Messi", "Ronaldo", "Bruno", "Neur"};
		String[] players3 = {"Messi", "Ronaldo", "Bruno", "Alisson"};
		
		boolean p1MatchP2 = Arrays.equals(players1, players2);
		boolean p1MatchP3 = Arrays.equals(players1, players3);
		
		System.out.println(p1MatchP2);//True
		System.out.println(p1MatchP3);//False
		
		String order = "Order #666245044afd37000206e862 is complete.";
	}

}