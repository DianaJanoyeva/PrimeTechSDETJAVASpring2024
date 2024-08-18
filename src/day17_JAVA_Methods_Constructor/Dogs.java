package day17_JAVA_Methods_Constructor;

public class Dogs {
	
	String breed;
	double size;
	int age;
	String color;

	public static void main(String[] args) {
		
		Dogs dog1 = new Dogs();
		dog1.breed = "German Shephard";
		dog1.size = 50.5;
		dog1.age = 12;
		dog1.color = "Black and Tan";
		
		System.out.println("The breed is " + dog1.breed + " weighs " + dog1.size + " age is " + dog1.age + " and color is " + 
		dog1.color);
		
		
		Dogs dog3 = new Dogs();
		dog3.breed = "Labrador Retriever";
		dog3.size = 35.7;
		dog3.age = 5;
		dog3.color = "Black";
		
		System.out.println("The breed is " + dog3.breed + " weighs " + dog3.size + " age is " + dog3.age + " and color is " + 
				dog3.color);
	}

}
