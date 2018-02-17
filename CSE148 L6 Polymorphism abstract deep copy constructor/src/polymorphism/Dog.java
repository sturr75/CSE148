package polymorphism;

public class Dog extends Pet {
	private String breed;
	
	// overloaded constructors
	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public Dog(String name) {
		super(name);
		breed = "Unknown";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + ", breed=" + breed + "]";
	}
	
	
}
