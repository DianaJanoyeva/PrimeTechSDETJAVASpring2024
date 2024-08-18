package Day26_Polymorphism;

public class Calculator {

	
	public int addNumbers(int a, int b) {
		//create integer to return the addition of 2 numbers
		int result = a + b;
		System.out.println("Result is: " + result);
		return result;
	}
	
	//Access Modifier - Public
	
	//To overload the method we need to come up with any set of parameters other than int and int
	public int addNumbers(int a, int b, int c, int d, int e, int f) {
		//create integer to return the addition of 2 numbers
		int result = a + b + c +d +e +f;
		System.out.println("Result is: " + result);
		return result;
	}
	
	public long addNumbers(long a, long b) {
		//create integer to return the addition of 2 numbers
		long result = a + b;
		System.out.println("Result is: " + result);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
