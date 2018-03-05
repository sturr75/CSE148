package interfaces;

public class RubberDuckie implements Duck{

	@Override
	public void move() {
		System.out.println("Rubber duckie moves...");
	}

	@Override
	public void fly() {
//		System.out.println("Rubber duckie flys...");		
	}

	@Override
	public void quack() {
		System.out.println("Rubber duckie quacks...");		
	}

	@Override
	public void swim() {
		System.out.println("Rubber duckie swims...");		
	}
	
	

}
