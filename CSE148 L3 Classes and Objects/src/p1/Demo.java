package p1;

public class Demo {

	public static void main(String[] args) {
		// create an object of the Student class
		Student student1 = new Student("John Doe", "(631)123-4567", 4.0);
//		student1.setName("John Doe");
//		student1.setPhoneNumber("");
//		student1.setGpa(4.0);
		// String name = student1.getName();
		// String phoneNumber = student1.getPhoneNumber();
		// double gpa = student1.getGpa();
//		System.out.println("The name is: " + student1.getName());
//		System.out.println("The phone Number is: " + student1.getPhoneNumber());
//		System.out.println("The GPA is: " + student1.getGpa());

		Student student2 = new Student();
		student2.setName("Jane Doe");
		student2.setPhoneNumber("(631)765-4321");
		student2.setGpa(3.0);
		// name = student2.getName();
		// phoneNumber = student2.getPhoneNumber();
		// gpa = student2.getGpa();
//		System.out.println("The name is: " + student2.getName());
//		System.out.println("The phone Number is: " + student2.getPhoneNumber());
//		System.out.println("The GPA is: " + student2.getGpa());
//		System.out.println("------------------");
//		System.out.println("Student1's name is: " + student1.getName());
//		System.out.println("Student2's name is: " + student2.getName());
		
		Student student3 = new Student();
		student3.setAll("Julie", "(516)345-1234", 2.5);
//		System.out.println("The name is: " + student3.getName());
//		System.out.println("The phone Number is: " + student3.getPhoneNumber());
//		System.out.println("The GPA is: " + student3.getGpa());
//		System.out.println("----------------------");
		student2.setAll("Suzy", "(718)987-1234", 3.5);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
