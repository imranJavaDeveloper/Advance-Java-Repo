
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args)  throws Exception{

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        /// load driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        ///  create connection
        Connection con= DriverManager.getConnection(url,user,password);

        /// create statement object
        Statement st=con.createStatement();

        st.executeUpdate("INSERT INTO emp (id, name, sal) VALUES (102, 'imran', 50000.50)");
        System.out.println("   insert value in table  successfully ");

        /// close the connection
        con.close();

    }
}
