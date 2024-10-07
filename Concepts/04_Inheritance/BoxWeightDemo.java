// Inherit class Box and add the weight variable.
class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    // Constructor to initialize dimensions and weight
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call the parent class constructor
        weight = m;
    }
}

public class BoxWeightDemo {
    public static void main(String[] args) {
        // Create an instance of BoxWeight
        BoxWeight myBox = new BoxWeight(10, 20, 15, 34.3);

        // Print the volume and weight of the box
        System.out.println("Volume of the box is: " + myBox.volume());
        System.out.println("Weight of the box is: " + myBox.weight);
    }
}