package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection("url", "username", "password");
    }
}
