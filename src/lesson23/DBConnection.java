package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    final String JDBC_CONNECTION = "jdbc:mysql://localhost:3306/elonmusk";
    final String JDBC_USERNAME = "elonmusk";
    final String JDBC_PASSWORD = "qwerty";
    Connection conn = null;

    public DBConnection() throws SQLException {
        conn = DriverManager.getConnection(JDBC_CONNECTION, JDBC_USERNAME, JDBC_PASSWORD);
    }
}
