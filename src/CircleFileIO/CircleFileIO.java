package CircleFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Circle.Circle;

public class CircleFileIO {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Title: Circle Demo");
		System.out.println("Lanaguage: Java");
		System.out.println("Decription:\n\tA circle Demo to print out radius Cirtcumference and Area");
		System.out.println("------------------------------------------------------------------");
		System.out.println("");

		ArrayList<Circle> circleList = new ArrayList<>();

		Circle unitCircle = new Circle();
		Circle myCircle = new Circle(5);
		Circle yourCircle = new Circle(12.75);

		fillArrayList(circleList);
		printCircles(circleList);

		// end main

	}

	private static void fillArrayList(ArrayList<Circle> circleAL) {
		// TODO Auto-generated method stub
		Scanner infile;

		try {

			infile = new Scanner(new File("circles_data.txt"));
			Circle temp;
			double radius;

			while (infile.hasNext()) {
				radius = infile.nextDouble();
				temp = new Circle(radius);
				circleAL.add(temp);
			} // end while

			// close file
			infile.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Error accessing File.");
		} // end try-catch
	}// end fillArrayList

	private static void printCircles(ArrayList<Circle> circleAL) {
		PrintWriter pw;
		try {

			pw = new PrintWriter("circles_output.txt");
			for (Circle c : circleAL) {
				// Print to Console
				System.out.println("---------------------------");
				System.out.println("Radius: \t" + c.getRadius());
				System.out.println("Circumference: \t" + c.circumference());
				System.out.println("Area: \t" + c.area());
				System.out.println("---------------------------");
				System.out.println("");

				// Print to File
				pw.println("---------------------------");
				pw.println("Radius: \t" + c.getRadius());
				pw.println("Circumference: \t" + c.circumference());
				pw.println("Area: \t" + c.area());
				pw.println("---------------------------");
				pw.println("");
			} // end for loop

			// close PrintWriter pw to complete
			pw.close();

		} catch (FileNotFoundException ex) {

			System.out.println("No File Found");

		} // end try-catch

	}// end PrintCircles

}// EOF
