package day30_JAVAExceptions;

public class ExceptionsOverview {

	public static void main(String[] args) {
		
		
		//Test case 7
				try {
					//Try block houses the code that may or may not cause an exception
					int num4 = Integer.parseInt("999999");
				} catch (Exception e){
					//will catch the exception caused by the code in the try block.
					//The exception will be handled inside of the catch block
					//catch block only runs if there is an exception
					System.out.println("Inside Catch Block");
					System.out.println(e.getMessage());
				}finally {
					//An optional block that will run whether an exception occurs or not
					System.out.println("Inside Finally BLock");
					System.out.println("Test case 7");
					
				}	
		
		String inputValue = "Prime tech 2024";
		
		//Convert String to Integer
		//Requirements: The String must only have numerical values
		//Solution: Class Integer, parseInt method which accepts a String and converts to Integer
		
		//test case 1
		int num3 = Integer.parseInt("999999");
		System.out.println(num3);
		//test case 2
//		int num2 = Integer.parseInt(inputValue);
//		System.out.println(num2);//exception occurs because the string provided does not contain only numerical values
		//test case 3
		int num = Integer.parseInt("1928718");
		System.out.println(num);
		
		// test case 4
		System.out.println("test case 4");
		// test case 5
		System.out.println("test case 5");
		
		//Test case 6
		int a = 10;
		int b = 10;
		int c = a/b;
		
		System.out.println(c); //arithmetic exception
		
		//Exceptions are logical errors that can be handled by the programmer
		//Errors are issues that are unable to be handled by the programmer
		//How to handle an Exception in Java? - Surround the code that results in an exception by try catch block
		
		
		//Test case 6
		try {
			//Try block houses the code that may or may not cause an exception
			int num4 = Integer.parseInt("999999");
		} catch (Exception e){
			//will catch the exception caused by the code in the try block.
			//The exception will be handled inside of the catch block
			//catch block only runs if there is an exception
			System.out.println("Inside Catch Block");
			System.out.println(e.getMessage());
		}finally {
			//An optional block that will run whether an exception occurs or not
			System.out.println("Inside Finally BLock");
			System.out.println("Test case 7");
			
		}
		
		
}

}
