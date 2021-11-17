package lesson23;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lesson23Main {

    public static void main(String[] args) {

        try {
            DBConnection db = new DBConnection();

            Statement stmt = db.conn.createStatement();

            // SELECT EXAMPLE

            // Create a query
            String query = "SELECT * from spaceships";

            // Executing the query
            ResultSet rs = stmt.executeQuery(query);

            while ( rs.next() ) {
                System.out.println(rs.getString("name"));
            }


            // INSERT EXAMPLE
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of a spaceship");
            String spaceshipName = scanner.nextLine();

            query = "INSERT INTO spaceships(  type, active, name )  VALUES (  'regular', 1, '" + spaceshipName + "')";

            stmt.execute(query);


            // INSTEAD of regular Statement you should ALWAYS use PreparedStatement
            String preparedQuery = "INSERT INTO spaceships ( type, active, name ) VALUES ( 'regular', ?, ? )";
            PreparedStatement preparedStatement = db.conn.prepareStatement(preparedQuery);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, spaceshipName);

            preparedStatement.execute();

            // SQLITE example
            SQLiteConnection sqlite = new SQLiteConnection();
            Statement stmt2 = sqlite.conn.createStatement();



            stmt2.execute("CREATE TABLE IF NOT EXISTS spaceships (" +
                    "  id integer PRIMARY KEY AUTOINCREMENT," +
                    "  name varchar(250)," +
                    "  type varchar(250) ," +
                    "  active int(1) " +
                    ")");

            stmt2.execute(query);

            query = "SELECT * from spaceships";
            rs = stmt2.executeQuery(query);

            while ( rs.next() ) {
                System.out.println("SQLITE: " + rs.getString("name"));
            }





        } catch (SQLException e) {
            System.out.println("There was a SQL exception" + e);
        }

    }
}
