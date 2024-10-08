
// This applet creates a simple login window with text fields and buttons.
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApplet extends Applet implements ActionListener {
    TextField userField, passField;
    Button loginButton;

    public void init() {
        userField = new TextField(15);
        passField = new TextField(15);
        passField.setEchoChar('*');
        loginButton = new Button("Login");

        add(new Label("Username:"));
        add(userField);
        add(new Label("Password:"));
        add(passField);
        add(loginButton);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = passField.getText();

        // Check if username and password match predefined values
        if (username.equals("admin") && password.equals("password")) {
            showStatus("Login successful!");
        } else {
            showStatus("Invalid username or password.");
        }
    }
}