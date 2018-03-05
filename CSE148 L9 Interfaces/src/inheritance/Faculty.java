package inheritance;

public class Faculty extends Person {
	
	public Faculty(String name, String id) {
		super(name, id);
	}

	@Override
	public void display(Person person) {
		System.out.println("I'm a faculty member... My name is " + person.getName());
	}

}
