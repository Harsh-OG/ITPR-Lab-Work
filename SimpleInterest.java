//write a program to calculate simple interest. 

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, time, si;

        // Taking input from user
        System.out.print("Enter Principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        // Check for valid input
        if (principal <= 0 || rate <= 0 || time <= 0) {
            System.out.println("Please enter positive values only.");
            return;
        }

        // Formula: SI = (P × R × T) / 100
        si = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest = " + si);
    }
}