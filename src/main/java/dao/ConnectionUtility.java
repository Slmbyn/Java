package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
   public ConnectionUtility() {
   }

   // Static method to get a connection to the SQLite database
   public static Connection getConnection() throws ClassNotFoundException, SQLException {
      // Load SQLite JDBC driver (this is necessary for Java to know which driver to use)
      Class.forName("org.sqlite.JDBC");

      // URL for SQLite database located in the project root directory
      String url = "jdbc:sqlite:database.db";

      // Return a connection to the SQLite database
      return DriverManager.getConnection(url);
   }
}


// package dao;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class ConnectionUtility {
//     public static Connection getConnection() throws ClassNotFoundException, SQLException{
//         Class.forName("oracle.jdbc.OracleDriver");
//         return DriverManager.getConnection("url", "username", "password");
//     }
// }