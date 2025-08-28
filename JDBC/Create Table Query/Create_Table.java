
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:mysql://localhost:3306/mydb";
        String userName="root";
        String password="root";

        /// load driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        /// create connection
        Connection con= DriverManager.getConnection(url,userName,password);

        /// create statement object
        Statement st=con.createStatement();

        /// create table successfully
        st.executeUpdate("CREATE TABLE student2 (roll INT, name VARCHAR(30), fees FLOAT)");
        System.out.println("table create successfully ");
        
        /// close the connection
        con.close();

        System.out.println(" thanks ");


    }
}
