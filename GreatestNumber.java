//write a program to create an array of 15 number and find the greatest number among them .

import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[15];  // array to store 15 numbers
        int max;  // to store the greatest number

        System.out.println("Enter 15 numbers:");

        // Taking 15 inputs from the user
        for (int i = 0; i < 15; i++) {
            num[i] = sc.nextInt();
        }

        // Assume first number is the greatest
        max = num[0];

        // Compare each number with current max
        for (int i = 1; i < 15; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        // Display result
        System.out.println("The greatest number is: " + max);
    }
}