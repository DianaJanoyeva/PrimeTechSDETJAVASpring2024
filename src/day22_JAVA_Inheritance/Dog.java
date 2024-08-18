package day22_JAVA_Inheritance;

public class Dog extends Animal{

	

	private String breed;
	
	//child class construcutor
	public Dog(String name, int age) {
		super(name, age);//calling parent class constructor
	}
	
	public Dog() {
		super();
	}
	
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		System.out.println(breed);
		return breed;
	}
     
	public static void main(String[] args) {
		Dog dog1 = new Dog("Layla",4);
		//dog1.setName("Belle");
		//dog1.setAge(4);
		dog1.getName();
		dog1.getAge();
		dog1.makeSound("Woof");
		//dog1.animalType; --> Does not compile since variable is private and setter/getter not provided by parent
		
         Dog dog2 = new Dog();
         dog2.getAge();
         dog2.getName();
	}
	
}