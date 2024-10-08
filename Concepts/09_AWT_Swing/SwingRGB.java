
// This Swing application uses scrollbars to change the background color of the window.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

// The main class extends JFrame and implements AdjustmentListener to handle scrollbar events
public class SwingRGB extends JFrame implements AdjustmentListener {
    // Declare scrollbars for red, green, and blue colors
    JScrollBar redScrollbar, greenScrollbar, blueScrollbar;
    // Variables to store the current values of red, green, and blue
    int red = 0, green = 0, blue = 0;

    // Constructor to set up the GUI components
    public SwingRGB() {
        // Set the title of the window
        setTitle("RGB Color Selector");
        // Set the size of the window
        setSize(400, 300);
        // Specify the close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout manager for the frame
        setLayout(new FlowLayout());

        // Initialize the scrollbars with horizontal orientation and range from 0 to 255
        redScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);
        greenScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);
        blueScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);

        // Add adjustment listeners to the scrollbars
        redScrollbar.addAdjustmentListener(this);
        greenScrollbar.addAdjustmentListener(this);
        blueScrollbar.addAdjustmentListener(this);

        // Add labels and scrollbars to the frame
        add(new JLabel("Red:"));
        add(redScrollbar);
        add(new JLabel("Green:"));
        add(greenScrollbar);
        add(new JLabel("Blue:"));
        add(blueScrollbar);
    }

    // Method called when the scrollbar value changes
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Get the current values of the scrollbars
        red = redScrollbar.getValue();
        green = greenScrollbar.getValue();
        blue = blueScrollbar.getValue();
        // Set the background color of the content pane based on the scrollbar values
        getContentPane().setBackground(new Color(red, green, blue));
    }

    // Main method to create and display the frame
    public static void main(String[] args) {
        // Create an instance of the SwingRGB class
        SwingRGB frame = new SwingRGB();
        // Make the frame visible
        frame.setVisible(true);
    }
}