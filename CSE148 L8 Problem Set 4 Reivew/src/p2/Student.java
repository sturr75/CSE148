package p2;

public class Student {
	private String name;
	private int id;
	private double gpa;
	private Address address;

	public Student(String name, int id, double gpa, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Address getAddress() {
//		return address; // shallow copy
		return new Address(address); // deep copy
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + ", address=" + address + "]";
	}

	
}
