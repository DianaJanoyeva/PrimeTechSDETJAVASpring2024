package day25_ATM_Interface_Abstraction_Example;

public interface MyFirstInterface {

	//Variable - all are considered public static final
	String name = "value";
		
	//methods
	//Only abstract methods can be inside of an interface
	
	public abstract void method1();
	
	public String printValue(String Value);
	}


