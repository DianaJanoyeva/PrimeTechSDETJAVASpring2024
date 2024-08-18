package Day27__28_JAVACollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOverView {

	public static void main(String[] args) {
		
		//int[] numArr = new int[3];
		//System.out.println(numArr[0]);
		
		
		ArrayList <String> footballTeam = new ArrayList<String>(50); //only 2 values
		
		boolean value2 = footballTeam.isEmpty();
		System.out.println(value2);
		
		int size = footballTeam.size();
		System.out.println(size);
		
		footballTeam.add("Lionel Messi");//Index0
		footballTeam.add("Cristiano Ronaldo"); //Index1
		footballTeam.add("Kylian Mbappe"); //Index2 - Dynamically resized the ArrayList
		footballTeam.add("Kevin De Bruyne"); //Index 3
		footballTeam.add("Neymar");//Index 4
		footballTeam.add("Virgil van Dijk");//Index 5
		footballTeam.add("Sergio Ramos");//Index 6
		footballTeam.add("Luka Modric");//Index 7
		footballTeam.add("Mohamed Salah");//Index 8
		footballTeam.add("Robert Lewandowski");//Index 9
		footballTeam.add("Manuel Neur");//Index 10
		//Add method that accepts int index and value
		footballTeam.add(10,"alisson becker"); //Add value at index 10
		footballTeam.add("Vinni Jr");
		footballTeam.add("Toni Kross");
		footballTeam.add("another player");
		//remove index 0
		footballTeam.add("Lionel Messi");
		footballTeam.remove(0);
		footballTeam.remove(footballTeam.size()-1); //Lionel messi index 0 will be gone
		footballTeam.add("Sergio Ramos");
		footballTeam.remove("Sergio Ramos");
		footballTeam.remove("Sergio Ramos");
		//Set updates existing value in a specified index
		footballTeam.set(3, "Neymar Jr");
		
		
		
		boolean value1 = footballTeam.isEmpty();
		System.out.println(value1);
		
		
		int size2 = footballTeam.size();
		System.out.println(size2);
		
		/*Looping through Array list
		 * 
		 * Option 1: For Loop
		 * Option 2: For Each Loop
		 * Option 3: Iterator
		 * 
		 */
		
		
		
		
		for(int i = 0; i<=footballTeam.size()-1; i++) {
			
			System.out.println("Index" + i + " " + footballTeam.get(i));
		}
		
		//Creating For Each Loop to iterate through all values within Array List
		
		for(String player: footballTeam) {
		
		System.out.println("For each loop " + player);
		
		
		}
		
		Iterator<String> it = footballTeam.iterator();
		while(it.hasNext()) {
			System.out.println("iterator " + it.next());
			
		}
		
		
		
		
		footballTeam.clear(); //removes all values from the array list
		
		int size3 = footballTeam.size();
		System.out.println(size3);
		
		
		
		}
		

	}


