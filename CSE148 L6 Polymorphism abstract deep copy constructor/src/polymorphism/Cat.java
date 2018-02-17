package polymorphism;

public class Cat extends Pet {
	private int age;

	// overloaded constructors
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	public Cat(String name) {
		super(name);
		age = 0;
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
