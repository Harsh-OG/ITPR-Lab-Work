//write a program to calculate CSA, TSA and volume of cylinder.

import java.util.Scanner;

class CylinderCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, height, csa, tsa, volume;
        final double PI = 3.14159; // value of π

        // Taking input from user
        System.out.print("Enter radius of the cylinder: ");
        radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        height = sc.nextDouble();

        // Validate input
        if (radius <= 0 || height <= 0) {
            System.out.println("Radius and height must be positive numbers.");
            return;
        }

        // Formulas
        csa = 2 * PI * radius * height;            // Curved Surface Area
        tsa = 2 * PI * radius * (height + radius); // Total Surface Area
        volume = PI * radius * radius * height;    // Volume

        // Display results
        System.out.println("Curved Surface Area (CSA) = " + csa);
        System.out.println("Total Surface Area (TSA) = " + tsa);
        System.out.println("Volume of Cylinder = " + volume);
    }
}