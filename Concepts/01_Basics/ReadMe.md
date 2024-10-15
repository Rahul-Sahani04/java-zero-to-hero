# Introduction to Java

This section provides a foundational understanding of Java programming.  We'll cover basic syntax, data types, and control flow.

## Getting Started

1.  **Setting up your development environment:**  Ensure you have Java Development Kit (JDK) installed.  You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).  Configure your environment variables to access the JDK tools.

2.  **Running your first Java program:** Create a file named `HelloWorld.java` with the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Compile and run the program using the command line:

```bash
javac HelloWorld.java
java HelloWorld
```

This will print "Hello, World!" to the console.

## How It Works:
![Java Basics](https://github.com/Rahul-Sahani04/java-zero-to-hero/blob/main/Assets/Java-CheatSheet.png?raw=true)

## Basic Data Types

Java supports various data types, including:

*   **int:** Integer values
*   **double:** Floating-point numbers
*   **String:** Textual data
*   **boolean:** Boolean values (true or false)

## Control Flow

Java uses control flow statements to control the execution of code:

*   **if-else statements:** Execute different blocks of code based on conditions.
*   **for loops:** Repeat a block of code a specific number of times.
*   **while loops:** Repeat a block of code as long as a condition is true.

## Example: Calculating the area of a circle

```java
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        input.close();
    }
}
```

This program prompts the user for the radius and calculates the area of a circle.

## Further Learning

Explore the other files in this directory to learn more about Java programming.  Each file focuses on a specific concept, building upon the fundamentals covered here.
