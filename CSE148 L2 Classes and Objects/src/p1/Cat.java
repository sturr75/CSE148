package p1;

public class Cat { // header of class; public: access modifier
	// state is described by instance variables
	// also known as fields, instance fields, attributes, properties
	/**
	 * Access modifiers:
	 * 1. private: only this class has access
	 * 2. unstated: package access. Classes in the same package can access
	 * 3. public: everyone in the world can access
	 * 4. protected: classes in this package and subclasses of this class can access
	 */
	private int age; 
	private String name;
	
	// behavior is described by methods
	// special method called a constructor
//	public Cat() {
	
//		age = 0;
//		name = "";
//	}
	
	// regular method
	protected void setName(String newName) {
		name = newName;
	}
	
	// regular method
	protected String getName() {
		return name;
	}
	
	protected void setAge(int newAge) {
		age = newAge;
	}
	
	protected int getAge() {
		return age;
	}
}
