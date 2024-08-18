package day20_ChatGPT_AccessModifiers_Encapsulation2;
import day20_ChatGPT_AccessModifiers_Encapsulation.ChatGPT;
public class AccessModifierDemoPublic {

	public void displayGreeting() {
		System.out.println("Hello");
	}
	
	
	
	public static void main(String[] args) {
		
		//2 options: use class name or create object
		
		//Creating Object
		ChatGPT newInstance = new ChatGPT();
		//Call reverse String Method
		newInstance.reverseString("Brazil");
		//Accessing method without creating object
		ChatGPT.reverseString("India");
		
		AccessModifierDemoDefault obj1 = new AccessModifierDemoDefault();
		obj1.book("JAVA OCA Study Guide");
	}

}
