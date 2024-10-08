// This Swing application implements a simple calculator with three functions: add, subtract, and multiply.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCalculator extends JFrame implements ActionListener {
    // Declare text fields for input and result
    JTextField num1, num2, result;
    // Declare buttons for operations
    JButton addButton, subButton, mulButton;

    // Constructor to set up the GUI components and event handling
    public SwingCalculator() {
        // Set the title of the window
        setTitle("Calculator");
        // Set the size of the window
        setSize(300, 200);
        // Specify the close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout manager to GridLayout with 4 rows and 2 columns
        setLayout(new GridLayout(4, 2));

        // Initialize text fields
        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        // Make the result field non-editable
        result.setEditable(false);

        // Initialize buttons
        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");

        // Add components to the frame
        add(new JLabel("Number 1:"));
        add(num1);
        add(new JLabel("Number 2:"));
        add(num2);
        add(new JLabel("Result:"));
        add(result);

        // Add buttons to the frame
        add(addButton);
        add(subButton);
        add(mulButton);

        // Register action listeners for the buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        // Parse input numbers from text fields
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int res = 0;

        // Perform the appropriate operation based on the button clicked
        if (e.getSource() == addButton) {
            res = n1 + n2;
        } else if (e.getSource() == subButton) {
            res = n1 - n2;
        } else if (e.getSource() == mulButton) {
            res = n1 * n2;
        }

        // Set the result in the result text field
        result.setText(String.valueOf(res));
    }

    // Main method to create and display the calculator window
    public static void main(String[] args) {
        SwingCalculator frame = new SwingCalculator();
        frame.setVisible(true);
    }
}