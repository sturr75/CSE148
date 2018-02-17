package p2;

public class Circle {
	private int radius;

	public Circle() {
		
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	// getters // accessors
	public double getArea() {
		return radius * Math.PI * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

}
