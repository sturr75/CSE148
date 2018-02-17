package deepCopyConstructor;

public class Cat extends Pet {
	private int age;

	// overloaded constructors
	public Cat(Cat cat) { // deep copy constructor
		super(cat.getName());
		age = cat.getAge();
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	public Cat(String name) {
		super(name);
		age = 0;
	}
	
	public void makeSound()
	{
		System.out.println("Meow...");
	}
	// overridden methods
	public void setName(String name) {
		super.setName(name);
	}

	public String getName() {
		return "Cat " + super.getName();
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + ", age=" + age + "]";
	}

}
