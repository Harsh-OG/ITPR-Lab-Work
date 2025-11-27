// Write a program to calculate area and perimeter of a rectangle Use custom execption
import java.util.Scanner;

// Custom Exception to handle invalid dimensions
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

class Rectangle {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) throws InvalidDimensionException {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException("Length and breadth must be positive values!");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter breadth of rectangle: ");
            double breadth = sc.nextDouble();

            // Creating Rectangle object
            Rectangle rect = new Rectangle(length, breadth);

            // Display area and perimeter
            System.out.println("Area of Rectangle: " + rect.calculateArea());
            System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());

        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}
