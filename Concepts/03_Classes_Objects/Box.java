// Demonstrates the creation and use of a simple class.
public class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize the dimensions of the box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate the volume of the box
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create an instance of Box
        Box myBox = new Box(10, 20, 15);
        // Calculate and print the volume of the box
        System.out.println("Volume of the box is: " + myBox.volume());
    }
}