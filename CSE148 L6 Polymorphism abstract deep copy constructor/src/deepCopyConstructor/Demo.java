package deepCopyConstructor;

public class Demo {

	public static void main(String[] args) {
		Cat c1 = new Cat("Bill");
		Cat c2 = new Cat("Adam", 10);
		Cat c3 = new Cat(c2); // deep copy
		
		System.out.println(c1 == c3);
		System.out.println(c2.getAge());
		System.out.println(c3.getAge());
		
		
		
		
	}

}
