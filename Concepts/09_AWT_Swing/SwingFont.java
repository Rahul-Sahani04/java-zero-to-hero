// This Swing application allows users to select font name, size, and style using control boxes.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// The main class that extends JFrame and implements ItemListener to handle item events
public class SwingFont extends JFrame implements ItemListener {
    // Declare JComboBox components for font name, size, and style
    JComboBox<String> fontName, fontSize, fontStyle;
    // JLabel to display the sample text with selected font properties
    JLabel sampleText;
    // Default font properties
    String name = "Serif";
    int size = 12;
    int style = Font.PLAIN;

    // Constructor to set up the GUI components
    public SwingFont() {
        // Set the title of the window
        setTitle("Font Selector");
        // Set the size of the window
        setSize(400, 200);
        // Specify the close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout manager for the frame
        setLayout(new FlowLayout());

        // Initialize JComboBox components with font options
        fontName = new JComboBox<>(new String[] { "Serif", "SansSerif", "Monospaced" });
        fontSize = new JComboBox<>(new String[] { "12", "14", "16", "18" });
        fontStyle = new JComboBox<>(new String[] { "Plain", "Bold", "Italic" });

        // Add item listeners to the JComboBox components
        fontName.addItemListener(this);
        fontSize.addItemListener(this);
        fontStyle.addItemListener(this);

        // Initialize the sample text label with default font properties
        sampleText = new JLabel("Sample Text");
        sampleText.setFont(new Font(name, style, size));

        // Add components to the frame
        add(new JLabel("Font:"));
        add(fontName);
        add(new JLabel("Size:"));
        add(fontSize);
        add(new JLabel("Style:"));
        add(fontStyle);
        add(sampleText);
    }

    // Method to handle item state changes
    public void itemStateChanged(ItemEvent e) {
        // Get the selected font name
        name = (String) fontName.getSelectedItem();
        // Get the selected font size and convert it to an integer
        size = Integer.parseInt((String) fontSize.getSelectedItem());
        // Get the selected font style as a string
        String styleStr = (String) fontStyle.getSelectedItem();
        // Determine the font style based on the selected string
        if (styleStr.equals("Plain")) {
            style = Font.PLAIN;
        } else if (styleStr.equals("Bold")) {
            style = Font.BOLD;
        } else if (styleStr.equals("Italic")) {
            style = Font.ITALIC;
        }
        // Update the font of the sample text label
        sampleText.setFont(new Font(name, style, size));
    }

    // Main method to create and display the frame
    public static void main(String[] args) {
        // Create an instance of SwingFont
        SwingFont frame = new SwingFont();
        // Make the frame visible
        frame.setVisible(true);
    }
}