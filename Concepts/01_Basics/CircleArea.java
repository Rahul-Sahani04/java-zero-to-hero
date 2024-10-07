// Calculate the area of a circle.
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); // Read the radius from the user
        double area = Math.PI * radius * radius; // Calculate the area using the formula πr²
        System.out.println("The area of the circle is " + area); // Print the area
    }
}