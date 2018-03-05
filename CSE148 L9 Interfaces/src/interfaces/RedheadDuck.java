package interfaces;

public class RedheadDuck extends Bird implements Duck, Chicken{

	@Override
	public void fly() {
//		System.out.println("Redhead duck flys...");
	}

	@Override
	public void quack() {
		System.out.println("Redhead duck quacks...");		
	}

	@Override
	public void swim() {
		System.out.println("Redhead duck swims...");		
	}

	@Override
	public void layEggs() {
		System.out.println("Redead ducl lays eggs...");
	}

	@Override
	public void move() {
		
	}

}
