package inheritance;

public class Student extends Person {

	public Student(String name, String id) {
		super(name, id);
	}

	@Override
	public void display(Person person) {
		System.out.println("I'm a student... My name is " + person.getName());
	}

	
}
