package p1;

public class Circle {
	private int radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// getters // accessors
	public double getArea() {
		return radius * Math.PI * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	// setter / mutator
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Radius: " + radius + "\tArea: " + getArea() + "\tCircumference: " + getCircumference();
	}
	

}
