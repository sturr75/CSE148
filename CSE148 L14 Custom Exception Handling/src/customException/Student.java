package customException;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		if (gpa > 4.0) {
			try {
				throw new GpaTooBigException();
			} catch (GpaTooBigException e) {
//				System.out.println(e.getMessage());
				this.gpa = 4.0;
			}
		} else if (gpa < 0.0) {
			try {
				throw new GpaTooSmallException();
			} catch (GpaTooSmallException e) {
//				System.out.println(e.getMessage());
				this.gpa = 0.0;
			}
		} else {
			this.gpa = gpa;
		}
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
