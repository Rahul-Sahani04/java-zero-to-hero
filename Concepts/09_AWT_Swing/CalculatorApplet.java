// This applet implements a simple calculator with three functions: add, subtract, and multiply.
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplet extends Applet implements ActionListener {
    // Text fields for input numbers and result
    TextField num1, num2, result;
    // Buttons for add, subtract, and multiply operations
    Button addButton, subButton, mulButton;

    // This method initializes the applet and its components
    public void init() {
        // Initialize text fields with a width of 5 and 10 for result
        num1 = new TextField(5);
        num2 = new TextField(5);
        result = new TextField(10);
        result.setEditable(false); // Result field should not be editable

        // Initialize buttons with labels
        addButton = new Button("Add");
        subButton = new Button("Subtract");
        mulButton = new Button("Multiply");

        // Add components to the applet
        add(new Label("Number 1:"));
        add(num1);
        add(new Label("Number 2:"));
        add(num2);
        add(new Label("Result:"));
        add(result);

        add(addButton);
        add(subButton);
        add(mulButton);

        // Register this applet as the event listener for the buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
    }

    // This method handles button click events
    public void actionPerformed(ActionEvent e) {
        // Parse the input numbers from the text fields
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int res = 0;

        // Perform the appropriate operation based on the button clicked
        if (e.getSource() == addButton) {
            res = n1 + n2; // Add numbers
        } else if (e.getSource() == subButton) {
            res = n1 - n2; // Subtract numbers
        } else if (e.getSource() == mulButton) {
            res = n1 * n2; // Multiply numbers
        }

        // Set the result in the result text field
        result.setText(String.valueOf(res));
    }
}