// Import necessary packages for Swing components and event handling
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Define the SwingLogin class that extends JFrame and implements ActionListener
public class SwingLogin extends JFrame implements ActionListener {
    // Declare text fields and button
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    // Constructor to set up the GUI components
    public SwingLogin() {
        // Set the title of the window
        setTitle("Login");
        // Set the size of the window
        setSize(300, 150);
        // Specify the close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout manager to GridLayout with 3 rows and 2 columns
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        // Add a label for the username
        add(new JLabel("Username:"));
        // Create and add a text field for the username
        userField = new JTextField();
        add(userField);

        // Add a label for the password
        add(new JLabel("Password:"));
        // Create and add a password field for the password
        passField = new JPasswordField();
        add(passField);

        // Create and add a login button
        loginButton = new JButton("Login");
        // Register the current object as the event listener for the button
        loginButton.addActionListener(this);
        add(loginButton);
    }

    // Override the actionPerformed method to handle button click events
    public void actionPerformed(ActionEvent e) {
        // Get the username and password entered by the user
        String username = userField.getText();
        String password = new String(passField.getPassword());

        // Check if the username and password match predefined values
        if (username.equals("admin") && password.equals("password")) {
            // Show a success message if the credentials are correct
            JOptionPane.showMessageDialog(this, "Login successful!");
        } else {
            // Show an error message if the credentials are incorrect
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }

    // Main method to create and display the login window
    public static void main(String[] args) {
        // Create an instance of the SwingLogin class
        SwingLogin frame = new SwingLogin();
        // Make the window visible
        frame.setVisible(true);
    }
}