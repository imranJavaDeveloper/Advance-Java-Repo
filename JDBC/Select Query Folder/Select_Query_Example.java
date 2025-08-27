
import java.sql.*;
public class Select_Query_Example {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String userName = "root";
        String password = "root";

        // 1. Load and register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Establish Connection
        Connection con = DriverManager.getConnection(url, userName, password);

        // 3. Create statement object
        Statement statement = con.createStatement();

        // 4. Execute query
        ResultSet rs = statement.executeQuery("SELECT * FROM student");

        // 5. Process results
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }

        // 6. Close connection
        con.close();
    }
}
