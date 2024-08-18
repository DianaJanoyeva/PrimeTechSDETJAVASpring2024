package day30_JAVAExceptions;

public class ExceptionOverview2 {

	
	//Custom Method to convert String to Integer
	
	public static void stringToInt(String value) {
		
		try{
			int num = Integer.parseInt(value);
		}
		catch (Exception e) {
			System.out.println("Exception Report: " + e.getMessage());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
			//Test case 1
		stringToInt("30498348");
		//Test case 2
		stringToInt("423049823");
	}

}
