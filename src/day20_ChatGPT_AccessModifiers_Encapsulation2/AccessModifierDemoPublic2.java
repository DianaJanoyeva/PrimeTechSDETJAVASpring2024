package day20_ChatGPT_AccessModifiers_Encapsulation2;
//Don't need to import because it is in the same package
public class AccessModifierDemoPublic2 {

	public static void main(String[] args) {
	
	AccessModifierDemoPublic obj1 = new AccessModifierDemoPublic();
	obj1.displayGreeting(); //displayGreeting method is not static
	
	AccessModifierDemoDefault obj2 = new AccessModifierDemoDefault();
	obj2.book("Outliers");
	
	}

}
