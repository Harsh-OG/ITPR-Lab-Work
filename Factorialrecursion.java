//write a program to find the factorial of a number by using rescurion

import java.util.Scanner;

class FactorialRecursion {
    // Recursive method to find factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base condition
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " = " + result);
        }
    }
}