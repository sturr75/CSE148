package interfaces;

public class MallardDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("Mallad duck flys...");
	}

	@Override
	public void quack() {
		System.out.println("Mallad duck quacks...");
	}

	@Override
	public void swim() {
		System.out.println("Mallad duck swims...");
	}

}
