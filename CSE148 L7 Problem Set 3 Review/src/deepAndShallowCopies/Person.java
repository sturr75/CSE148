package deepAndShallowCopies;

public class Person {
	private String name; // instance variables
	private int age;
	private String id;
	
	// static variables: They are shared by all objects of the class
	private static int idNumber = 0; // aka class variable
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = String.valueOf(idNumber++);
	}
	
	public Person(Person person) {
		this.name = person.name;
		this.age = person.age;
		this.id = String.valueOf(idNumber++);
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
// static methods
	public static int getIdNumber() {
		return idNumber;
	}

	public static void setIdNumber(int idNumber) {
		Person.idNumber = idNumber;
	}

	// instance methods
	public Person shallowCopy(Person person) { 
		return person;
	}
	
	public Person deepCopy(Person person) {
		return new Person(person.name, person.age);
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
	
//	public Person shallowCopy() {
//		return this;
//	}
//	
//	public Person deepCopy() {
//		return new Person(this.name, this.age);
//	}
	
	
	
}
