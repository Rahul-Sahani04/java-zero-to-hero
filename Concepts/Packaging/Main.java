
// File: /path/to/your/project/Main.java
import Shapes.Box;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Box
        Box myBox = new Box(10, 20, 15);
        // Calculate and print the volume of the box
        System.out.println("Volume of the box is: " + myBox.volume());
    }
}