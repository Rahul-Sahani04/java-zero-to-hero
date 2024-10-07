// Demonstrates the use of the super keyword to call the parent class constructor.
class Parent {
    int value;

    // Constructor to initialize value
    Parent(int value) {
        this.value = value;
        System.out.println("Parent class constructor called. Value: " + value);
    }
}

class Child extends Parent {
    // Constructor to initialize value and call the parent class constructor
    Child(int value) {
        super(value); // Call the parent class constructor
        System.out.println("Child class constructor called. Value: " + value);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child(10);
    }
}