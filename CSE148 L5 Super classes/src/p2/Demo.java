package p2;

public class Demo {

	public static void main(String[] args) {
		Cat c1 = new Cat("John", 5, 15.5);
		c1.setName("Billy");
		c1.meow();
		System.out.println(c1);
		
		System.out.println("------------");
		
		Dog d1 = new Dog("Zack", 4);
		System.out.println(d1);
		
	}

}
