// This applet uses scrollbars to change the background color of the window.
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class RGBApplet extends Applet implements AdjustmentListener {
    // Declare scrollbars for red, green, and blue color components
    Scrollbar redScrollbar, greenScrollbar, blueScrollbar;
    // Variables to store the current values of red, green, and blue
    int red = 0, green = 0, blue = 0;

    // Initialize the applet
    public void init() {
        // Create scrollbars for red, green, and blue with initial value 0, thumb size 1, and range 0-255
        redScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        greenScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        blueScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);

        // Add adjustment listeners to the scrollbars
        redScrollbar.addAdjustmentListener(this);
        greenScrollbar.addAdjustmentListener(this);
        blueScrollbar.addAdjustmentListener(this);

        // Add the scrollbars to the applet
        add(redScrollbar);
        add(greenScrollbar);
        add(blueScrollbar);
    }

    // Handle scrollbar adjustments
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Get the current values of the scrollbars
        red = redScrollbar.getValue();
        green = greenScrollbar.getValue();
        blue = blueScrollbar.getValue();
        // Set the background color of the applet based on the scrollbar values
        setBackground(new Color(red, green, blue));
        // Repaint the applet to update the display
        repaint();
    }

    // Paint the applet
    public void paint(Graphics g) {
        // Draw the current values of red, green, and blue on the applet
        g.drawString("Red: " + red, 20, 100);
        g.drawString("Green: " + green, 20, 120);
        g.drawString("Blue: " + blue, 20, 140);
    }
}