package overriddenMethods;

public class Pet {
	private String name;

	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Agrrrr");
	}
	@Override
	public String toString() {
		return "name=" + name;
	}

}
