package p3;

public class Student extends Person{
	
	private double gpa;

	public Student(String name, String id, double gpa) {
		super(name, id);
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
		return "Student [name=" + getName() + ", id=" + getId() + ", gpa=" + gpa + "]";
	}

}
