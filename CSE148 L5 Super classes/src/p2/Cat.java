package p2;

public class Cat extends Pet {
	private double weight;

	public Cat(String name, int age, double weight) {
		super(name, age);
		this.weight = weight;
	}

	public void meow() {
		System.out.println("Meow....");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + ", weight=" + weight + "]";
	}

	
}
