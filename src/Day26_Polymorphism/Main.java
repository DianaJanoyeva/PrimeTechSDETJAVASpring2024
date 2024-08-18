package Day26_Polymorphism;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square();
		square1.area();//area

		Calculator c1 = new Calculator();
		c1.addNumbers(5, 10);
		c1.addNumbers(5,10,65, 70, 80, 100);
		c1.addNumbers(654654654654l, 065465464l);
	}

}
