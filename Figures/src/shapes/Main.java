package shapes;

import java.util.Scanner;

public class Main {

static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float sideLength = 0;
		
		System.out.println("Please enter a sidelength!");
		sideLength = input.nextFloat();
		
		Square square1 = new Square();
		Square square2 = new Square(sideLength);
		
		
		System.out.println(square2.getArea());
		
		
	}

}
