package Circle;

public class Circle {

	private double radius;

	// no-arg ctor
	public Circle() {
		this(1.0);
	}// end no-arg ctor

	// main ctor
	public Circle(double radius) {
		this.radius = radius;
	}// end ctor

	// Circumference Method
	public double circumference() {
		return 2 * Math.PI * radius;
	}// end Circumference method

	// Area Method
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}// end Area method

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}// end Circle