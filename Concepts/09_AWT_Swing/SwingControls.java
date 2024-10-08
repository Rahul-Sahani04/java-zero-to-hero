// This Swing application uses at least five different controls.
import java.awt.FlowLayout; // Importing FlowLayout for arranging components

import javax.swing.JButton; // Importing JButton for button control
import javax.swing.JCheckBox; // Importing JCheckBox for checkbox control
import javax.swing.JComboBox; // Importing JComboBox for combo box control
import javax.swing.JFrame; // Importing JFrame for the main window
import javax.swing.JRadioButton; // Importing JRadioButton for radio button control
import javax.swing.JTextField; // Importing JTextField for text field control

public class SwingControls extends JFrame {
    // Constructor to set up the GUI
    public SwingControls() {
        setTitle("Swing Controls Example"); // Set the title of the window
        setSize(400, 300); // Set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        setLayout(new FlowLayout()); // Set the layout manager to FlowLayout

        // Create and add different controls to the window
        JButton button = new JButton("Button"); // Create a button with the label "Button"
        JTextField textField = new JTextField(15); // Create a text field with 15 columns
        JCheckBox checkBox = new JCheckBox("CheckBox"); // Create a checkbox with the label "CheckBox"
        JRadioButton radioButton = new JRadioButton("RadioButton"); // Create a radio button with the label "RadioButton"
        JComboBox<String> comboBox = new JComboBox<>(new String[] { "Item 1", "Item 2", "Item 3" }); // Create a combo box with three items

        // Add the controls to the window
        add(button);
        add(textField);
        add(checkBox);
        add(radioButton);
        add(comboBox);
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingControls frame = new SwingControls(); // Create an instance of the SwingControls class
        frame.setVisible(true); // Make the window visible
    }
}