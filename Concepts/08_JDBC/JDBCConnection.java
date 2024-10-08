
// This program demonstrates how to establish a connection to a database using JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Database URL
        String user = "your_username"; // Database username
        String password = "your_password"; // Database password

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}