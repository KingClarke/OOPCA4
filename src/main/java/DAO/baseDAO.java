package DAO;
import Exception.DaoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class baseDAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/records";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws DaoException {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to find driver class: " + e.getMessage());
            System.exit(1);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            System.exit(2);
        }
        return connection;
    }

    public void freeConnection(Connection connection) throws DaoException {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Failed to free connection: " + e.getMessage());
            System.exit(1);
        }
    }
}
