package day21_Encapsulation;

public class StudentEncapsulationDemo {

	public static void main(String[] args) {
		
//		Student s1 = new Student(); //calling the no-arg constructor
//		s1.displayStudentDetails();
//		Student s2 = new Student(3.5,"Davron",123456,2); //parameterized constructor
//		s2.displayStudentDetails();
		
		Student s1 = new Student();
		//System.out.println(s1.gpa); Unable to access private member of Student class
	
		s1.setGPA(3.5);
		System.out.println(s1.getGPA());
		System.out.println(Student.universityName);
		Student.universityName = "Harvard";
		System.out.println(Student.universityName);
	}

}
