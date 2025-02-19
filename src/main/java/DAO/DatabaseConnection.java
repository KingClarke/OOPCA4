package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "mysql://localhost:3306/records";
                String username = "root";
                String password = "";
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
