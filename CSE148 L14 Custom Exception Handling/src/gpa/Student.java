package gpa;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		if(gpa > 4.0 || gpa < 0.0) {
			try {
				throw new IllegalArgumentException("fdsfdsaf");
			} catch (IllegalArgumentException e) {
				if(gpa > 4.0) {
					gpa = 4.0;
				} else {
					gpa = 0.0;
				}
				
			}		}
		this.name = name;
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
		if(gpa > 4.0 || gpa < 0.0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				if(gpa > 4.0) {
					gpa = 4.0;
				} else {
					gpa = 0.0;
				}
				
			}		}
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
