
// Program to check voter eligibility based on age.
import java.util.Scanner;

public class VoterAgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            checkAge(age);
            System.out.println("You are eligible to vote.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18 to vote.");
        }
    }
}