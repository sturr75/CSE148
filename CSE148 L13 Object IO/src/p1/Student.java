package p1;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	private double gpa;

	public Student(String name, String gender, double gpa) {
		super(name, gender);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [Name=" + getName() + ", Gender=" + getGender() + ", GPA=" + gpa + "]";
	}
	
	
}
