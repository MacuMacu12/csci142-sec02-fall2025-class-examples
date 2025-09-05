package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
    	Scanner input = new Scanner(System.in); 
        
        try {
            System.out.println("Please enter a side length for the square:");
            double sideLength = input.nextDouble();

           
            Square mySquare = new Square(sideLength);

          
            System.out.println(mySquare); 
            System.out.println("Area: " + mySquare.getArea());

        } 
        catch (InputMismatchException e) {
            System.err.println("Error: Input must be a valid number.");
        } 
        catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Program finished.");
            input.close();
        }
    }
}