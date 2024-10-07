// Demonstrates the use of static members.
public class UseStatic {
    static int staticVar = 10; // Static variable
    int instanceVar = 20; // Instance variable

    // Static method to print static variable
    static void staticMethod() {
        System.out.println("Static variable: " + staticVar);
    }

    // Instance method to print instance variable
    void instanceMethod() {
        System.out.println("Instance variable: " + instanceVar);
    }

    // Static block to initialize static variables
    static {
        System.out.println("Static block executed.");
        staticVar = 30;
    }

    public static void main(String[] args) {
        // Call static method
        UseStatic.staticMethod();

        // Create an instance of UseStatic
        UseStatic obj = new UseStatic();
        // Call instance method
        obj.instanceMethod();
    }
}