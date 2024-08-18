package javaCollectionYoutubeVideo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <String> mylist= new ArrayList<String>();
	
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		
		//Size of arraylist
		System.out.println(mylist.size()); //4
		
		//Printing arraylist
		System.out.println(mylist);
		
		//Remove element from arraylist
		mylist.remove(3);
		System.out.println(mylist);
		
		//Insert element in the arraylist
		
		
		
	}

}
