package day20_ChatGPT_AccessModifiers_Encapsulation2;

import day20_ChatGPT_AccessModifiers_Encapsulation.ChatGPT;

public class AccessModifierDemoPrivate {

	public static void main(String[] args) {
		
		ChatGPT obj1 = new ChatGPT();
		//obj1.printSomething(); Private method call does not compile
		//System.out.println(obj1.founder);
		//Not possible to access Private variables or methods
		
		AccessModifierDemoProtected obj2 = new AccessModifierDemoProtected();
		System.out.println(obj2.name);
		obj2.displayCompanyName("Tesla");
		
	}

}
