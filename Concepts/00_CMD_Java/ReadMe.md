# Java Command Line Cheatsheet

This document provides a quick reference for common Java command line operations.

---

### 1. **Compiling Java Files**
   - **Command:** `javac`
   - **Usage:** To compile a Java source file (with a `.java` extension) into bytecode (with a `.class` extension).
   - **Example:**
     ```bash
     javac MyProgram.java
     ```

### 2. **Running Java Programs**
   - **Command:** `java`
   - **Usage:** To run a compiled Java program (the `.class` file).
   - **Example:**
     ```bash
     java MyProgram
     ```

### 3. **Viewing Help for Commands**
   - **Command:** `javac -help` or `java -help`
   - **Usage:** To get a list of options and usage for the commands.
   - **Example:**
     ```bash
     javac -help
     java -help
     ```

### 4. **Setting the Classpath**
   - **Command:** `-cp` or `-classpath`
   - **Usage:** To specify where to find user-defined classes and packages.
   - **Example:**
     ```bash
     java -cp . MyProgram
     ```

### 5. **Checking Java Version**
   - **Command:** `java -version`
   - **Usage:** To check the installed version of Java.
   - **Example:**
     ```bash
     java -version
     ```

### 6. **Compiling All Java Files**
   - **Command:** `javac *.java`
   - **Usage:** To compile all Java files in the current directory.
   - **Example:**
     ```bash
     javac *.java
     ```

### 7. **Running a JAR File**
   - **Command:** `java -jar`
   - **Usage:** To run a Java application packaged in a JAR file.
   - **Example:**
     ```bash
     java -jar myapp.jar
     ```

---

Start with the [Java Basics](Concepts/01_Basics) to begin your journey!