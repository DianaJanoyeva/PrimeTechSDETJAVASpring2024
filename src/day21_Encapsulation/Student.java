package day21_Encapsulation;

public class Student {
	public static String universityName = "UVA";
	//Instance Variables - These are default variables
	private double gpa;
	private String name;
	private int studentId;
	private int year;
	
//No Argument Constructor
	
	public Student() {
		this.gpa = 0.00;
		this.name = "Jane Doe";
		this.studentId = 0;
		this.year = 1;
	}
	
//Parameterized Constructor
	public Student(double gpa, String name, int studentId, int year) {
		this.gpa = gpa;
		this.name = name;
		this.studentId = studentId;
		this.year = year;
		
	}
	
	//methods to get student details
	
	public void displayStudentDetails() {
		System.out.println(studentId + " : "  + name + " : " + year
				+ " : " + gpa);
	}
	
	//Create set method to set the GPA for the student
	public void setGPA(double gpa) {
		this.gpa = gpa; //referencing the instance variable created
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public static void main (String[] args) {
		
	}
	
}
		
	

