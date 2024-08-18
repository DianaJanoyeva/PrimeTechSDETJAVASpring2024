package day23_inheritance;

public class Parent {
	
	private String familyName;
	
	//create a parametrized constructor
	
	public Parent(String familyName) {
		
		this.familyName = familyName;
		System.out.println("Parent Constructor");
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getFamilyName() {
		System.out.println(familyName);
		return familyName;
	}

	public static void main(String[] args) {
		

	}

}
