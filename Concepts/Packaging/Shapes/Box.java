package Shapes;

// Demonstrates the creation and use of a simple class.
public class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize the dimensions of the box
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate the volume of the box
    public double volume() {
        return width * height * depth;
    }
}