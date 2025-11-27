/ Program to check voting eligibility using Custom Exception
import java.util.Scanner;

// Custom Exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class VotingEligibility {
    int age;

    VotingEligibility(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18) {
            System.out.println("Person is eligible to vote.");
        } else {
            System.out.println("Person is NOT eligible to vote.");
        }
    }
}

public class VotingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            VotingEligibility voter = new VotingEligibility(age);
            voter.checkEligibility();

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}
