
// This program demonstrates how to insert a new record into a table using JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Database URL
        String user = "your_username"; // Database username
        String password = "your_password"; // Database password

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // SQL query to insert a new record
            String insertSQL = "INSERT INTO Users (name, email) VALUES (?, ?)";

            // Create a PreparedStatement object to execute the query
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            // Set the values for the placeholders
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setString(2, "john.doe@example.com");

            // Execute the query
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record was inserted successfully!");
            }

            // Close the PreparedStatement and connection
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error inserting record: " + e.getMessage());
        }
    }
}