
// This program demonstrates how to update existing records in the database using JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Database URL
        String user = "your_username"; // Database username
        String password = "your_password"; // Database password

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // SQL query to update an existing record
            String updateSQL = "UPDATE Users SET email = ? WHERE name = ?";

            // Create a PreparedStatement object to execute the query
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);

            // Set the values for the placeholders
            preparedStatement.setString(1, "new.email@example.com");
            preparedStatement.setString(2, "John Doe");

            // Execute the query
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing record was updated successfully!");
            }

            // Close the PreparedStatement and connection
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error updating record: " + e.getMessage());
        }
    }
}