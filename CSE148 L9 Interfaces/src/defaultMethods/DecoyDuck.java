package defaultMethods;

public class DecoyDuck implements Showable {
	private String name;
	private int age;

	public DecoyDuck(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void show() {
		System.out.println("Show a decoy duck!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DecoyDuck [name=" + name + ", age=" + age + "]";
	}

}
