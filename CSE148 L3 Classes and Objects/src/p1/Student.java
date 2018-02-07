package p1;

public class Student {
	private String name;
	private String phoneNumber;
	private double gpa;
	
	
	// overloaded constructors
	public Student(String newName, String newPhone, double newGpa) { //parameters
		name = newName;
		phoneNumber = newPhone;
		gpa = newGpa;
	}
	
	public Student() { // no-arg constructor
		
	}
	
	public Student(String newName) {
		name = newName;
	}
	
	// bad practice. Because methods are the best when they are 
	// pure for doing one thing and one thing only.
	public String setAndGetName(String newName) {
		name = newName;
		return name;
	}

	// setter/mutator method
	public void setAll(String newName, String newPhoneNumber, double newGpa) {
		name = newName;
		phoneNumber = newPhoneNumber;
		gpa = newGpa;
	}

	public void setName(String newName) {
		name = newName;
	}

	// getter / accessor method
	public String getName() {
		return name;
	}

	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setGpa(double newGpa) {
		gpa = newGpa;
	}

	public double getGpa() {
		return gpa;
	}
	// toString method
	public String toString() {
		return "Name: " + name + "\nPhone: " + phoneNumber  + "\nGPA: " + gpa  + "\n";
	}

}
