package Circle;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Title: Circle Demo");
		System.out.println("Lanaguage: Java");
		System.out.println("Decription:\n\tA circle Demo to print out radius Cirtcumference and Area");
		System.out.println("------------------------------------------------------------------");
		System.out.println("");

		Circle unitCircle = new Circle();
		Circle myCircle = new Circle(5);
		Circle yourCircle = new Circle(12.75);

		printCircleData(unitCircle);
		printCircleData(myCircle);
		printCircleData(yourCircle);

	}// end main

	private static void printCircleData(Circle circle) {
		System.out.println("Radius = " + String.format("%.2f", circle.getRadius()));
		System.out.println("Circumference = " + String.format("%.2f", circle.circumference()));
		System.out.println("Area = " + String.format("%.2f", circle.area()));
		System.out.println("");

	}

}
