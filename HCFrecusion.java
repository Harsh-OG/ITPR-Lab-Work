//write a program to find out the hcf of two number by using recursion

import java.util.Scanner;

class HCFRecursion {
    // Recursive method to find HCF
    static int hcf(int a, int b) {
        if (b == 0) {
            return a;  // Base condition
        } else {
            return hcf(b, a % b);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check for negative numbers
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive numbers only.");
            return;
        }

        int result = hcf(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " = " + result);
    }
}