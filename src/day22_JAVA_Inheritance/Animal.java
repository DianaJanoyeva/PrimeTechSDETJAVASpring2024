package day22_JAVA_Inheritance;

public class Animal {
	
//Instance Variables	
	private String name;
	private int age;
	private String animalType;
	
//Parametrized Constructor
	
	public Animal() {
		this.name = "Dog Name";
		this.age = 0;
		System.out.println("No arg constructor");
	}
	
	public Animal(String name, int age) {
		this();//calling no arg constructor in Animal
		this.name = name;
		this.age = age;
		
	}
	
	//Setter and Getter Methods
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() { 
		System.out.println(name);
		return name;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		System.out.println(age);
		return age;
	}
	
	//custom method
	
	public void makeSound(String sound ) {
		System.out.println("Animal is making a " +sound);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal("",0);//default constructor gone
//		a.setAge(10);
//		a.setName("Smith");
//		a.getAge();
//        a.getName();
//		a.makeSound("Bark");
		
		Animal a = new Animal();
		//a.setBreed; Does not compile since Animal parent class does not have access to child class

	}

}