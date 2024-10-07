// Demonstrates the use of abstract classes and methods.
abstract class Figure {
    double dimension1;
    double dimension2;

    // Constructor to initialize dimensions
    Figure(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    // Abstract method to calculate area
    abstract double area();
}

class Rectangle extends Figure {
    // Constructor to initialize dimensions
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    // Implement the abstract method to calculate area
    double area() {
        return dimension1 * dimension2;
    }
}

class Triangle extends Figure {
    // Constructor to initialize dimensions
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    // Implement the abstract method to calculate area
    double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class AbstractFigure {
    public static void main(String[] args) {
        // Create instances of Rectangle and Triangle
        Figure rectangle = new Rectangle(10, 20);
        Figure triangle = new Triangle(10, 20);

        // Print the area of the rectangle and triangle
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}