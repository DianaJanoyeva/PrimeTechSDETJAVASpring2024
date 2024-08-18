package Day27__28_JAVACollections;

import java.util.ArrayList;

public class CollectionsArrayList {

	public static void main(String[] args) {
		
		//Declare an array of String data type, with 5 members inside.
		//5 represents the number of items - length, max index is 4
		String[] students = new String[5];
		//assigning members to index
		
		students[0] = "Adila";
		students[1] = "Dan";
		students[2] = "Hayder";
		students[3] = "Negin";
		students[4] = "Ben";
		
		//Re-assignment
		students[1] = "Diana";
		/*
		 * Limitations:
		 * 1. Does not have methods to remove members. (Students withdraw)
		 * 2. Cannot re-size (Students joining late/leaving)
		 * 
		 * 
		 */
		
		//When do you use an Array?
		//Use an array when you know for sure how many members should be inside the array
		
		//How do you handle situations where the data itself is dynamic? - ArrayList
		
		//Declaration of Array List object 
		
		ArrayList <String> studentEnrollment = new ArrayList<String>();
		//Adding Student 1
		studentEnrollment.add("Adila");
		System.out.println(studentEnrollment.get(0)); //Adila
		//Adding Student 2
		studentEnrollment.add("Dan");
		System.out.println(studentEnrollment.get(1)); //Dan
		
		//Adding armen under index 2
		studentEnrollment.add("Armen");
		System.out.println(studentEnrollment.get(2));
		
		//We can not add members outside of the ordered index
		studentEnrollment.add(3,"Hayder");
		System.out.println(studentEnrollment.get(3));
		
//		studentEnrollment.add(3,"Diana");
//		System.out.println(studentEnrollment.get(3));
		
		//Update an index
		studentEnrollment.set(3, "Diana");
		System.out.println(studentEnrollment.get(3));
		
		//Add out of order is not allowed in Array List
		studentEnrollment.add(4,"Negin");
		System.out.println(studentEnrollment.get(4));
		
		studentEnrollment.add("Ben");
		System.out.println(studentEnrollment.get(5));
		
		studentEnrollment.add(1, "New Student");
		
		studentEnrollment.add("Dan");
		
		//item1 - index: 0
		//item2 - index: 1
		//item3 - index: 2
		//item4 - index: 3
		//item5 - index: 4
		
		//remove new Student by index
		studentEnrollment.remove(1);
		
		
		// remove element by value
		studentEnrollment.remove("Dan");
		
		
		for(int i = 0; i<=studentEnrollment.size()-1;i++ ) {
			System.out.println("Index" + i + " " + studentEnrollment.get(i));
			
		}
		
	}

}
