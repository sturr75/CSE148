package p2;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2;
		c2 = c1; // shallow copy-- copy the address
		System.out.println(c1 == c2);
		c2.setRadius(1);
		System.out.println(c1);
		
		c2 = new Circle(c1.getRadius()); // deep copy
		c1.setRadius(3);
		System.out.println(c1 == c2);
	}

}
