// This applet demonstrates the use of BorderLayout in an applet.
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;

public class BorderLayoutApplet extends Applet {
    // The init method is called when the applet is first loaded
    public void init() {
        // Set the layout manager for this applet to BorderLayout
        setLayout(new BorderLayout());

        // Add buttons to different regions of the BorderLayout
        // The BorderLayout manager divides the container into five regions:
        // North, South, East, West, and Center.
        
        // Add a button to the North region
        add(new Button("North"), BorderLayout.NORTH);
        
        // Add a button to the South region
        add(new Button("South"), BorderLayout.SOUTH);
        
        // Add a button to the East region
        add(new Button("East"), BorderLayout.EAST);
        
        // Add a button to the West region
        add(new Button("West"), BorderLayout.WEST);
        
        // Add a button to the Center region
        add(new Button("Center"), BorderLayout.CENTER);
    }
}