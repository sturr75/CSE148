package p2;

public class Dog extends Pet {
	private double length;

	public Dog(String name, int age, double length) {
		super(name, age);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Dog [Name=" + getName() + ", Age=" + getAge() + ", length=" + length + "]";
	}
	
	

}
