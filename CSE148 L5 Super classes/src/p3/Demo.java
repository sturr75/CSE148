package p3;

public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student("Adam", "111", 3.5);
//		System.out.println(s1.getGpa());
//		Faculty f1 = new Faculty("Bill", "222", 100000);
//		System.out.println(f1.getSalary());
		
		Student s1 = new Student("Adam", "111", 3.5);
		// variable type: Student;
		// Object type: Student by looking at the constructor
		
		Person s2 = new Student("Adam", "111", 3.5); 
		// variable type: Person (Super class);
		// Object type: Student by looking at the constructor
		
		Person s3 = new Person("Zack", "333");
		
	}
	
	/*
	 * Inheritance describes a relationship called "Is A"
	 */

}
