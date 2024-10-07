# JDBC (Java Database Connectivity)

This section introduces **JDBC**, which allows Java applications to interact with relational databases. You'll learn how to establish a database connection, perform CRUD operations (Create, Read, Update, Delete), and manage data efficiently.

## Topics Covered:
1. **Connecting to a Database** - How to set up a connection using JDBC.
2. **SQL Operations** - How to run SQL queries from Java code.
3. **Database Transactions** - Performing insert, update, and delete operations from Java.

## Example Programs:

1. **`JDBCConnection.java`** - A program that demonstrates how to connect to a database using JDBC.
   - **Concepts**: Establishing a connection using `DriverManager`.

2. **`CreateTable.java`** - A program that creates a table in the connected database.
   - **Concepts**: Executing `CREATE TABLE` SQL statements from Java.

3. **`InsertRecord.java`** - Demonstrates how to insert a new record into a table.
   - **Concepts**: Using `PreparedStatement` to insert data into a database.

4. **`UpdateRecord.java`** - Shows how to update existing records in the database.
   - **Concepts**: Executing `UPDATE` SQL statements.

## Exercises:
1. Write a program to establish a connection to any database of your choice using JDBC.
2. Write a program that creates a table with columns `id`, `name`, and `email`, then insert at least three records.
3. Modify the program to update one of the records and display the updated record.

---

### Moving Forward:
Once you're comfortable with JDBC, explore more advanced topics like transaction management, batch processing, and database connection pools to improve the performance of your database-driven Java applications.

---

## Files

- **JDBCConnection.java**: Demonstrates JDBC connection and SQL statements.
- **InsertRecord.java**: Inserts a record into the database.
- **CreateTable.java**: Creates a table in the database.
- **UpdateRecord.java**: Updates records in the database.
