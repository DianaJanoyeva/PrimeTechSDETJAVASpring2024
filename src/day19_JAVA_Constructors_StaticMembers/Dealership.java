package day19_JAVA_Constructors_StaticMembers;

import day18_Automation_Preview.Car;

public class Dealership {
	
	//Static Variables
	static String dealershipName = "European Imports";
	//instance variable
	double price;
	double stateTax;
	int numberOfSales;
	static String state = "VA";
	String primaryReceptionist;
	String mileage;
	int year;
	
	//Create a non Arg Constructor and inside of it I want to set default values for price, stateTax, and number of sales
	
	public Dealership() {
		this("150,000",2018); //using "this" keyword to call another constructor //invoking constructor that accepts mileage and year
		this.price = 0; //"this" keyword is referencing the current object a.k.a "obj1"
		this.stateTax = .043;
		this.numberOfSales = 0;
		this.primaryReceptionist = "Unknown";
	}
	
	//Parameterized constructor that accepts tax and primary receptionist as parameters
	
	public Dealership(String mileage, int year) {
		this.mileage = mileage;
		this.year = year;
	}
	
	public Dealership(double tax, String primaryReceptionist) {
		this.stateTax = tax;
		this.primaryReceptionist = primaryReceptionist;
	}
	
	

	public static void main(String[] args) {
		
		Car stockA = new Car("BMW","M4","Black");
		Car stockB = new Car("Mercedes","C300","Silver");
		
		//call no arg constructor
		Dealership obj1 = new Dealership();
		System.out.println(obj1.numberOfSales);
		System.out.println(obj1.price);
		System.out.println(obj1.primaryReceptionist); //Unknown
		System.out.println(obj1.stateTax); //.043
		System.out.println(obj1.mileage); //150,000
		System.out.println(obj1.year); //2018
		
		Dealership obj2 = new Dealership();
//		System.out.println(obj2.numberOfSales);
//		System.out.println(obj2.price);
//		System.out.println(obj2.primaryReceptionist);
//		System.out.println(obj2.stateTax);
//		obj2.numberOfSales = 5;
//		System.out.println(obj2.numberOfSales);
		Dealership obj3 = new Dealership(.15,"Davron");
//		System.out.println(obj3.numberOfSales); //0
//		System.out.println(obj3.price); //0
//		System.out.println(obj3.primaryReceptionist); //Davron
//		System.out.println(obj3.stateTax); //.15
	}

}
