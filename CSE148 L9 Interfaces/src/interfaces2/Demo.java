package interfaces2;

public class Demo {

	public static void main(String[] args) {
		MallardDuck md1 = new MallardDuck();
		md1.fly();
		md1.quack();
		md1.swim();
		md1.show();
		
		DecoyDuck dd1 = new DecoyDuck();
		dd1.show();
		// interfaces allow the inheritance of data type but not code from the interface
		Codable cd1 = new CrazyDuck();
		cd1.code();
		
	}

}
