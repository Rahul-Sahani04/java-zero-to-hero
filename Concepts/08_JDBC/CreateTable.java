
// This program creates a table in the connected database.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Database URL
        String user = "your_username"; // Database username
        String password = "your_password"; // Database password

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement object to execute SQL queries
            Statement statement = connection.createStatement();

            // SQL query to create a table
            String createTableSQL = "CREATE TABLE Users ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(50), "
                    + "email VARCHAR(50))";

            // Execute the SQL query
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
    }
}