package instanceofPackage;

public class Demo {

	public static void main(String[] args) {
		Pet p1 = new Pet("Buddy");
		Cat c1 = new Cat("Adam", 5);
		Cat c2 = new Cat("Bill");
		Dog d1 = new Dog("Julie", "Golden");
		Dog d2 = new Dog("Zack");
		
		// polymorphism
		Pet c3 = new Cat("Bo", 3);
		Pet d3 = new Dog("Joe", "Mixed");
		Pet p3 = new Pet("Judy");
		System.out.println(c3 instanceof Cat);
		
	}
	
	private static void show(Pet x) {
		System.out.println("My animal is: " + x);
	}
	
}
