package day22_23_JAVA_Inheritance;

public class Fish extends Animal{
	
	//instance variable 
	private String waterType;

	
    //Child Class Constructor 	
	
	public Fish(String name, int age, String waterType) { 
		super(name,age); //calls parent class constructor that accepts name and age
		this.waterType = waterType;//sets the instance variable
	}
	
	public Fish() {
		super();
		this.waterType = "Salt water";
	}
	
	//create get and set method for waterType 
	
	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
	
	public String getWaterType() {
		System.out.println(waterType);
		return waterType;
	}
	
	//Overiding parent class method
	@Override
	public void makeSound(String sound) {
		System.out.println("Fish bubbles");
	}
	
	public static void main(String[] args) {
		Fish f1 = new Fish("Salmon",2,"Salt water");
		f1.getWaterType();
		f1.setWaterType("Fresh Water");
		f1.getWaterType();
		f1.makeSound("glub glub");

	}

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		
	}

}