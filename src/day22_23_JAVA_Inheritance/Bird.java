package day22_23_JAVA_Inheritance;

public class Bird extends Animal {
	
	private String species;
	
	public void setSpecies(String speciesName) {
		this.species = speciesName;
	}
	
	public String getSpecies() {
		System.out.println(species);
		return species;
	}

	public static void main(String[] args) {
		Bird b1 = new Bird();
		b1.setName("Hello");
		b1.getName();
		//b1.makeSound("Chirpping");
		b1.setSpecies("Humming Bird");
		b1.getSpecies();//Humming Bird
		
		Dog d1 = new Dog();
		//d1.makeSound("German Shephard");

	}

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		
	}

}
