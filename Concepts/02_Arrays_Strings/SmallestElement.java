// Find the smallest element in an array.
public class SmallestElement {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 5, 3, 8, 1, 2 };

        // Find the smallest element
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest element in the array: " + smallest);
    }
}