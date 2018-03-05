package inheritance;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", "111");
		Faculty f1 = new Faculty("Bill", "222");
		s1.display(s1); // polymorphism
		f1.display(f1);
		System.out.println("s1's name is: " + s1.getName());
		System.out.println("f1's name is: " + f1.getName());
		// inheritance allows the inheritance of code and data type from the super class
	}

}
