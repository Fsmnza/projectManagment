package org.example;

import java.sql.*;

public class HRManagementApp {
    // Database connection parameters
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/ass3db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0557";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Step 1: Load and register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish the database connection
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Step 3: Create a statement object to execute SQL queries
            statement = connection.createStatement();

            // Step 4: Execute a sample query to retrieve employee names
            String query = "SELECT name FROM employees";
            resultSet = statement.executeQuery(query);

            // Step 5: Process the query results
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("Employee Name: " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
