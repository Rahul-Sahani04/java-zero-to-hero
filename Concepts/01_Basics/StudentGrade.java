
// Calculate and display student grades.
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter the student's score: ");
        int score = input.nextInt(); // Read the student's score

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The student's grade is: " + grade); // Print the student's grade
    }
}