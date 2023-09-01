import java.util.Scanner;

// Abstract base class Shape
abstract class Shape {
    protected double side;

    // Abstract methods to be implemented by subclasses
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Concrete subclass Square which extends Shape
class Square extends Shape {
    public Square(double side) {
        this.side = side;
    }

    // Override method to calculate square area
    @Override
    public double getArea() {
        return side * side;
    }

    // Override method to calculate square perimeter
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Continuous loop for user input until negative or zero input is provided
        while(true){
            System.out.print("Enter the side length of the square (use 0 or less to exit): ");
            double sideLength = scanner.nextDouble();

            if(sideLength <= 0){
                break; // Exit loop if non-positive input is given
            }

            Square square = new Square(sideLength);
            
            System.out.println("Square Area: " + square.getArea());
            System.out.println("Square Perimeter: " + square.getPerimeter());
        }
        
        scanner.close(); // Close the scanner to release resources
    }
}
