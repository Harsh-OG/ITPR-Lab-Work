//write a program to calculate the area and perimeter of a triangle.

import java.util.Scanner;

class TriangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, s, area, perimeter;

        // Taking input for three sides of the triangle
        System.out.print("Enter first side of triangle: ");
        a = sc.nextDouble();

        System.out.print("Enter second side of triangle: ");
        b = sc.nextDouble();

        System.out.print("Enter third side of triangle: ");
        c = sc.nextDouble();

        // Validate the triangle (sum of two sides > third side)
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides. Please enter valid values.");
            return;
        }

        // Calculate perimeter
        perimeter = a + b + c;

        // Calculate semi-perimeter
        s = perimeter / 2;

        // Calculate area using Heron's formula
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display results
        System.out.println("Perimeter of triangle = " + perimeter);
        System.out.println("Area of triangle = " + area);
    }
}
