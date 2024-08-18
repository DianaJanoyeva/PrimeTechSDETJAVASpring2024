package day18_Automation_Preview;

public class Automation_Preview {

	
	//Step 1: Go to a website
	
	public void goToURL(String url) {
		System.out.println("Launching " + url);
	}
	
	public static void main(String[] args) {
		Automation_Preview obj1 = new Automation_Preview();
		obj1.goToURL("http://crater.primetech-apps.com/login");
		obj1.goToURL("google.com");
		
	}

}
