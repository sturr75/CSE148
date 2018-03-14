package defaultMethods;

public interface Showable {
	default public void show() {
		System.out.println("Show a duck...");
	}
	
	default public void fly() {
		System.out.println("The duck is flying...");
	}
}
