package com.selam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");
                // Path to the SQLite database file
        String url = "jdbc:sqlite:database.db";  // Database will be created here if it doesn't exist

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
                
                // Create a table
                Statement stmt = conn.createStatement();
                String sql = "CREATE TABLE IF NOT EXISTS products (" +
                            "id LONG PRIMARY KEY," +
                            "name TEXT NOT NULL," +
                            "description TEXT NOT NULL);";
                stmt.execute(sql);
                System.out.println("Table 'products' created successfully.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
