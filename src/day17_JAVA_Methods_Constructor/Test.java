package day17_JAVA_Methods_Constructor;

public class Test {

	public static void main(String[] args) {
		
		Dogs dog2 = new Dogs();
		dog2.breed = "Golden Retriever";
		dog2.size = 40.9;
		dog2.age = 3;
		dog2.color = "Light brown";
		
		System.out.println("The breed is " + dog2.breed + " weighs " + dog2.size + " age is " + dog2.age + " and color is " + 
		dog2.color);
	}

}
