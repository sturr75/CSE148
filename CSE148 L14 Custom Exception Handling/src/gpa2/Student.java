package gpa2;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) throws Exception{
		super();
		this.name = name;
		if(gpa > 4.0 || gpa < 0.0) {
			throw new Exception("sdfdafds");
		}
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
