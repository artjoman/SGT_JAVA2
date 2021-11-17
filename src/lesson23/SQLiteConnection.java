package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

    final String JDBC_CONNECTION = "jdbc:sqlite:spaceships";
    Connection conn = null;

    public SQLiteConnection() throws SQLException {
        conn = DriverManager.getConnection(JDBC_CONNECTION);
    }
}
