package p1;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		c1.setRadius(1);
		System.out.printf("%15.2f\n", c1.getCircumference());
		
		Circle c2 = new Circle(6);
		c2.setRadius(3);
		System.out.printf("%.2f\n", c2.getArea());
	}

}
