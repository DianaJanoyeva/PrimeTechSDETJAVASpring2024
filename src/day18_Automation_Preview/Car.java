package day18_Automation_Preview;

public class Car {
	
    //Instance Variables	
	String make;
	String model;
	String color;
	String trimLevel;
	boolean sunRoofAvailable;
	boolean remoteStarter;
	double tireSize;
	String fuelType;
	boolean builtInNavigation;
	
	//Static Global Variables
	static double fuelLevel = 50;
	static String factory = "Mercedes Germany";
	
	
//	Example of default constructor
//    public void Car() {
//    	
//    }
	
	//Example of No-Argument Constructor 
	
	public Car() {
		//No Arguement constructor
		System.out.println("No Argument Constructor");	
	}
	
	//Example of Parameterized Constructor
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public Car(String make, String model, int speed) {
		
	}
	
	public Car(int model, String company, String miles) {
		
	}
	
	//Example of Parameterized Constructor with all instance variables
	public Car(String brand, String model, String color,boolean sunRoofAvailable,boolean remoteStarter,double tireSize,String fuelType, 
	boolean builtInNavigation) {
		this.make = brand;
		this.model = model;
		this.color = color;
		this.sunRoofAvailable = sunRoofAvailable;
		this.remoteStarter = remoteStarter;
		this.tireSize = tireSize;
		this.fuelType = fuelType;
		this.builtInNavigation = builtInNavigation;	
	}
	
	
	//Method to check current Fuel Level and provide a status message
	
	public String fuelStatus (int fuelLevel) {
		String result = "";
		
		if(fuelLevel >=70 && fuelLevel <= 100) {
			result = "Fuel Level is good";
		}else if(fuelLevel >=40 && fuelLevel <= 69) {
			result = "time to Stop at gas station";
		}else if(fuelLevel >=0 && fuelLevel <= 39) {
			result = "Fuel at low levels";
		}else {
			result = "Invalid Fuel Level";
		}
		
		return result;
		
	}
	
	
	public double currentSpeed(double distance, double time) {
		
		double result = (distance/time);
		return result;
		
	}
	

	public static void main(String[] args) {
	  
		Car car1 = new Car();//object 1 --> default constructor --> No Arg constructor
		car1.make = "Mercedes";
		car1.model = "AMG GT";
		car1.color = "Satin Black";
		
		System.out.println("Make: " +  car1.make + " Model: " + car1.model + " color " + car1.color );
        
		Car car2 = new Car();//object 2 --> default constructor --> No Arg constructor
		car2.make = "Audi";
		car2.model = "Q7";
		car2.color = "White";
		
		System.out.println("Make: " +  car2.make + " Model: " + car2.model + " color " + car2.color );
		
		Car car3 = new Car();//object 3 --> default constructor --> No Arg constructor
		car3.make = "BMW";
		car3.model = "750 LI";
		car3.color = "Blue";
		String fuelStatus = car3.fuelStatus(80);
		System.out.println(fuelStatus);//"Fuel Level is good"
		System.out.println(car3.fuelStatus(10));//"Fuel at low levels";
		System.out.println(car3.currentSpeed(15, 10) + " MPH");
		
		System.out.println("Make: " +  car3.make + " Model: " + car3.model + " color " + car3.color );
		
		Car car4 = new Car();//object --> No Arg constructor
		
		Car car5 = new Car("BMW","X5","Black");
		
		System.out.println("Make: " +  car5.make + " Model: " + car5.model + " color " + car5.color );
        
		Car car6 = new Car();
		System.out.println(car6.make);
		
		Car car7 = new Car("Toyota", "Tundra","Tan",true, true, 30, "Premium", false);
		System.out.println(car7.make + car7.model + car7.color + car7.tireSize);
		
		Car car8 = new Car();
		System.out.println(car8.make); //null
		System.out.println(car8.tireSize);//0.0
	}

}