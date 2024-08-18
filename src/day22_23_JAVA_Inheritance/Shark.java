package day22_23_JAVA_Inheritance;

public class Shark extends Fish{
	
	//instance variables 
	private int numberOfTeeth;
	
	//Constructor
	public Shark(String name, int age, String waterType, int numberOfTeeh) {
		super(name, age, waterType);
        this.numberOfTeeth = numberOfTeeth;
	}
	
	//Get and set methods 
	
	public void setNumberOfTeeth(int numberOfTeeth) {
		this.numberOfTeeth = numberOfTeeth;
	}
	
	
	public int getNumberOfTeeth() {
		System.out.println(numberOfTeeth);
		return numberOfTeeth;
	}
	
	//Override Method 
	
	@Override
	public void makeSound(String sound) {
		System.out.println("Shark roars");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shark s1 = new Shark("Joker",30,"Salt Water",150);
		s1.setNumberOfTeeth(200);
		s1.getNumberOfTeeth();
		s1.makeSound("gubble gubble");

		

	}

}