// This applet allows users to select font name, size, and style using control boxes.
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FontApplet extends Applet implements ItemListener {
    // Declare Choice components for font name, size, and style
    Choice fontName, fontSize, fontStyle;
    // Default font properties
    String name = "Serif";
    int size = 12;
    int style = Font.PLAIN;

    // Initialize the applet
    public void init() {
        // Initialize font name choices
        fontName = new Choice();
        fontName.add("Serif");
        fontName.add("SansSerif");
        fontName.add("Monospaced");
        fontName.addItemListener(this); // Add item listener to handle selection changes

        // Initialize font size choices
        fontSize = new Choice();
        fontSize.add("12");
        fontSize.add("14");
        fontSize.add("16");
        fontSize.add("18");
        fontSize.addItemListener(this); // Add item listener to handle selection changes

        // Initialize font style choices
        fontStyle = new Choice();
        fontStyle.add("Plain");
        fontStyle.add("Bold");
        fontStyle.add("Italic");
        fontStyle.addItemListener(this); // Add item listener to handle selection changes

        // Add the choice components to the applet
        add(fontName);
        add(fontSize);
        add(fontStyle);
    }

    // Handle item state changes
    public void itemStateChanged(ItemEvent e) {
        // Update font name based on user selection
        name = fontName.getSelectedItem();
        // Update font size based on user selection
        size = Integer.parseInt(fontSize.getSelectedItem());
        // Update font style based on user selection
        String styleStr = fontStyle.getSelectedItem();
        if (styleStr.equals("Plain")) {
            style = Font.PLAIN;
        } else if (styleStr.equals("Bold")) {
            style = Font.BOLD;
        } else if (styleStr.equals("Italic")) {
            style = Font.ITALIC;
        }
        // Request a repaint to update the display
        repaint();
    }

    // Paint the applet
    public void paint(Graphics g) {
        // Create a new font with the selected properties
        Font font = new Font(name, style, size);
        // Set the font for the graphics context
        g.setFont(font);
        // Draw the sample text with the selected font
        g.drawString("Sample Text", 50, 100);
    }
}