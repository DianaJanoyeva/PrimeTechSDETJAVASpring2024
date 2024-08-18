package day16ClassDesign;

import day17_JAVA_Methods_Constructor.Dogs;

public class Phone {
	static String countryOfManufacturing = "China";
	String brand;
	String model;
	int screenSize;
	String color;
	int Storage;
	String provider;
	double price;
	boolean isItInStock;
	String operatingSystem;
	String make;
	String[] contacts = new String[1];
	boolean wifiOn = false;
	//Length 100
	//Largest index in the array = 100 - 1 = 99
	
	

	
	//Method 1 - turn on the phone 
//	public void turnOn() {
//		System.out.println("Phone is on");
//		
//	}
	
	//Access Modifier - public 
	// return type - nothing/void 
	//name of Method - Turn On
	//Method Parameters - None
	
	
	
	//Method 2 - turn off the phone 
//	public void turnOff() {
//		System.out.println("Phone is off");
//	}
//	
//	//Method putting the phone on silent mode
//	
//	public void silentMode() {
//		System.out.println("Phone is on silent");
//
//	}

	//Access Modifier - public 
	//Return type - void (nothing)
	//name of method - silentMode
	// Parameters - None
	
	
	//Method sending text message to a phone number 
	//public 
	//return type - String
	//do we need parameters - phone number, message 
	
//	public String sendMessage(int phoneNumber, String message) {
//		boolean delivered = true;
//		System.out.println("Sending Message to: " + phoneNumber + " " + message);
//		String result;
//		if(delivered) {
//			 result = "Delivered";
//		}else {
//			result = "Not Delivered";
//		}
//		return result;	
	
//	}
	
	
	//Method to take pictures 
	
//	public String takePictures(int numberOfPictures) {
//		int i;
//		for(i = 1; i<=numberOfPictures; i++) {
//			System.out.println("Picture #: " + i);
//		}
//		
//		System.out.println(i);
//		String result = "You have taken " + numberOfPictures + " pictures";
//		
//		System.out.println(result);
//		return result;
//	}
	
	
	
	
	
	// Access Modifer - public 
	//Return Type - String 
	//name - takePictures
	//parameters - numberOfPictures
	
	
	// Method Add contacts
	
	public String addContact (String contact) {
		//String[] contacts = new String[1];
		String result = "";
		for(int i = 0; i <= contacts.length-1; i++) {
			if(contacts[i] ==null) {
				contacts[i] = contact;
				result = "Contact created " + contact;
				break;
			}else {
				result = "Contact not created " + contact;
				System.out.println("Contact List is full");
			}
			
		}
			return result;
	}
	
	
	
	
//		
//		return result;	//After this method exits
//	}
	//Task 1: 
	public void vibrateMode() {
		System.out.println("Phone is on vibrate mode");
	}
	
	//Task 2:
	public void airplaneMode() {
		System.out.println("Phone is on airplane mode");
	}
	
	//Task 5:
		public String sendEmail(String emailAddress, String emailContent) {
			String result;
			if(wifiOn) {
				System.out.println("Email is sent");
				result = "Email is delivered to " + emailAddress;
			}else {
				System.out.println("Internet connection not available");
				result = "email is not delivered to " + emailAddress;
			}
			System.out.println("Do you need to send another email");
			return result;
		}
	//Task 3:
	public void mutePhone() {
		System.out.println("Phone muted");
	}
	
	//Task 4:
	public void wifiStatus() {
		if(wifiOn) {
			System.out.println("wifi is on");
		}else {
			System.out.println("Wifi is off");
		}
	}
	

	
	
//	public String sendEmail(String emailAddress, String emailContent) {
//		String emailDeliveryResult;
//		if(wifiOn == true) {
//			  System.out.println("Email is sent");
//			   emailDeliveryResult = "email is delivered to " + emailAddress;
//		}else {
//			  System.out.println("Internet connection not available");
//			   emailDeliveryResult = "email is not delivered to " + emailAddress;
//			}
//		
//		System.out.println("Do you need to send another email");
//		return emailDeliveryResult;
//		
//	}
//	
//	public void remindAjayToSubmitRecordinfg() {
//		System.out.println();
//	}
	

	public static void main(String[] args) {
		//Object creation
		//Object name iphone
		//Iphone is an instance of Phone
		//String brand = "phone";
		Phone iphone = new Phone();
		iphone.brand = "Apple";
	    iphone.model = "Iphone 15 Pro Max";
	    iphone.screenSize = 8;
	    iphone.Storage = 500;
	    iphone.color = "Black";
	    iphone.provider = "T-mobile";
	    iphone.price = 1245.35;
	    iphone.isItInStock = true;
	    iphone.operatingSystem = "ios";
	    System.out.println(iphone.addContact("Adila 828918237"));
	    System.out.println(iphone.addContact("Adila 828918239"));
//	    iphone.turnOn();
//	    iphone.turnOff();
//	    String isMessageDelivered = iphone.sendMessage(48374827, "JAVA is getting interesting");
//	    System.out.println(isMessageDelivered);
//	    iphone.silentMode();
//	    iphone.takePictures(10);
//	    String result = iphone.takePictures(10);
//	    System.out.println(result);
	    //System.out.println(result); --> result is a string variable with scope to takePictures
//	    System.out.println(iphone.addContact("Armen 9984298492"));
//	    System.out.println(iphone.addContact("Adila 9984298223"));
//	    String pictures = iphone.takePictures(10);
//	    System.out.println(pictures);
	    iphone.vibrateMode();
	    iphone.airplaneMode();
	    iphone.mutePhone();
	    iphone.wifiStatus();
	    System.out.println(iphone.sendEmail("hello@gmail.com", "How are you doing?"));
	   
	    
	    
	    Phone samsung = new Phone();
	    samsung.brand = "Samsung";
	    samsung.model = "S 24";
	    samsung.screenSize = 10;
	    samsung.Storage = 500;
	    samsung.color = "Black";
	    samsung.provider = "Verizon";
	    samsung.price = 1045.35;
	    samsung.isItInStock = false;
	    samsung.operatingSystem = "android";
//	    samsung.turnOn();
//	    samsung.turnOff();
	    
	   
	    System.out.println(samsung.brand +samsung.model +  samsung.screenSize + samsung.Storage +  samsung.color + samsung.provider + samsung.price  + samsung.isItInStock + samsung.operatingSystem);//null
	    
	    System.out.println(iphone.brand + iphone.model + iphone.screenSize +  iphone.Storage +  iphone.color + iphone.provider + iphone.isItInStock +  iphone.operatingSystem);
	    //iphone.brand --> Apple
	    //System.out.println(brand);
	    
//	   iphone.turnOff();
//	   
//	   Phone lG = new Phone();
//	   lG.airplaneMode();
//	   lG.mutePhone();
//	   lG.vibrateMode();
//	   lG.wifiStatus();
	 
//	   String emailResult = lG.sendEmail("emailaddress@gmail.com", "Lets go");
//	   System.out.println(lG.sendEmail("emailaddress@gmail.com", "Lets go"));
	   
	   
	   Dogs dog3 = new Dogs();
		
		System.out.println(Phone.countryOfManufacturing);
		
	}

	
	
}