import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {

            public static void main(String[] args) {
                // Database URL
                String url = "jdbc:mysql://localhost:3306/school";
                String user = "root";
                String password = "root";

                try {
                    // Load the MySQL JDBC driver (optional for JDBC 4.0+)
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Establish connection
                    Connection con = DriverManager.getConnection(url, user, password);

                    // Success message
                    System.out.println("✅ Connected to the database successfully!");
                    System.out.println("connection got successfully ");
                    // Close connection
                    con.close();
                } catch (ClassNotFoundException e) {
                    System.out.println("JDBC Driver not found!");
                    e.printStackTrace();
                } catch (SQLException e) {
                    System.out.println("Database connection failed!");
                    e.printStackTrace();
                }
            }
        }


