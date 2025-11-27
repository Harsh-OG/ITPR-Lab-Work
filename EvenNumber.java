//write a program to input any 20 number and display even number among them .

import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20]; // to store 20 numbers

        System.out.println("Enter 20 numbers:");

        // Taking 20 inputs from user
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nEven numbers are:");

        // Checking and displaying even numbers
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) { // check if number is even
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
