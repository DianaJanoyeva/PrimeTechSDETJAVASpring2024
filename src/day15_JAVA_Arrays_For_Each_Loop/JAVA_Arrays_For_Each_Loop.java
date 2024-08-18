package day15_JAVA_Arrays_For_Each_Loop;

public class JAVA_Arrays_For_Each_Loop {

	public static void main(String[] args) {
	//Declaration is simply creating the variable
	// Assigning a value intializes the variable
	int a,b,c;//3 variables are declared.
	a = 2; b = 3; c =4; //initialized 3 variables	
	
    //declare an array of Integer data type
	// dataType[] variable_name; (Creation of the array)
	int[] goals;//variable name is goals
	int apples[];//variable name is apples
	
	//what type of data is expected in goals and apples ?
	//only integer values are acceptable
	//"String" 1.25 --> (converted into int) true 'a' --> Not acceptable
	// 1 2 3 , 85738, --> Acceptable values
	
	//instantiating goals Array with 20 values. 
	//Index starts from zero 0 --> 19
	// Length of Array = 20 
    goals = new int[20];
    //Java allocates 20 memory slots with default value of 0
    //Access the first index of Array 
    System.out.println(goals[0]);//0
    
    //instantiating apples to have 5 values
	apples = new int[5];
	//Add values to the array
	apples[0] = 1;
	apples[1] = 2;
	apples[2] = 3;
	apples[3] = 4;
	apples[4] = 5;
	//apples[5] = 6; //Should not be allowed since the size of the array is set to 5
	
	//intarray x = new int[25];
	//Compilation errors - Errors that happen during compile time (syntax issues)
	//Exceptions - Errors that happen during runtime
	
	System.out.println(apples[0]);//1
	//System.out.println(apples[5]);//Array Index Out Of Bounds Exception
	
	//create an Array of double data type and assigned 5 values
	//length - 5
	
	double[] decimalValues = {1.1,1.2,1.3,1.4,1.5};
    System.out.println(decimalValues[2]);//1.3
    
    //Next Class 
    String[] nextClass = new String[25];
    nextClass[0] = "New Student";
    //Current Class 
    String[] currentClass = {"Adila","Hussein"};
    
    //Create an Array of char data type
    //add the characters in your name in the specific order that its in
    // Ajay - 'A' 'j' 'a' 'y'
    
    char[] myName = {'A', 'j','a','y'};
    System.out.println(myName[0]);
    
    char[] myName2 = new char[4];
    myName2[0] = 'A';
    myName2[1] = 'j';
    myName2[2] = 'a';
    myName2[3] = 'y';	
    
    
    
    //boolean data type , holds 3 elements, true|false|false 
    boolean[] boolArray = {true, false,false};
    
    String name = "Adila Moyo";
   
    //Create a for loop, each iteration each character should print out
    // 1st iteration 'A' , 2nd 'd'
    
    for(int i = 0; i <= name.length() -1;i++ ) {
    	System.out.println(name.charAt(i));
    	// 0 - A , 1 - d, 2 - i , 3 - l 
    }
    
    for(int c1 = 0; c1 <= boolArray.length -1; c1++) {
    	System.out.println(boolArray[c1]);
    	
    }
    
    //Create a String array that holds 5 different types of apples 
    
    String[] appleNames = {"Red Delicious","Fuji","Gala","Granny Smith" ,"Honey Crisp"};
    System.out.println(appleNames[4]);
    
    //For loop 
    for(int t=0; t<=appleNames.length -1; t++) {
    	System.out.println(appleNames[t]);
    }
    
    //For Each Loop also known as the enhanced for loop
    for(String apples1: appleNames) {
    	System.out.println(apples1);
    }
    
    for(boolean boolForEachLoop:boolArray) {
    	System.out.println(boolForEachLoop);
    }
    
    /* TASK 
     * Step1: Declare an Array of String Data type and explicitly size it to 5.
     * Step 2: Provide the following values for your array from step 1
     * index 0 - BMW 
     * index 1 - Mercedes 
     * index 2 - Honda 
     * index 3 - Fiat
     * index 4 - Tesla
     * Step 3: Create a For loop to iterate and print the entire Array
     * Step 4: Create a For each loop to iterate and print the entire Array
     */
    
     String[] favoriteCarBrands = new String[5];
     
     favoriteCarBrands[0] = "BMW";
     favoriteCarBrands[1] = "Mercedes";
     favoriteCarBrands[2] = "Honda";
     favoriteCarBrands[3] = "Fiat";
     favoriteCarBrands[4] = "Tesla";
     
     //For Loop
     for(int z = 0; z <= favoriteCarBrands.length-1; z++) {
    	 System.out.println(favoriteCarBrands[z]);
     }
    
     //For Each Loop
     for(String car: favoriteCarBrands) {
    	 System.out.println(car);
     }
    
	}

}