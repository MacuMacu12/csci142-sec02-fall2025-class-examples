package shapes;

import java.util.Scanner;

public class Main {

static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double sideLength = 0;
		
		System.out.println("Please enter a sidelength!");
		sideLength = input.nextFloat();
		
		
		Square square1 = new Square(sideLength);
		Square square2 = new Square(sideLength);
		
		double square2Area = square2.getArea();
		
		
		System.out.println(square2Area);
		System.out.println(square1);
		
		
	}

}
