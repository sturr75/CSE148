package interfaces;

public interface Duck extends Animal{
	// in an interface, all variable are public, static and final
//	public static final String name = "Bill";
	// In an interface, all methods are public and abstract
	void fly();
	void quack();
	void swim();
	void display();

}
