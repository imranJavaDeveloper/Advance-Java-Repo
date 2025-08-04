
import java.sql.*;

public class CreateSimpleClass {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ///  Note  JDBC 3.0 Version Autoloading is not present
        ///  Note JDBC 4.0 Version Autoloading is present
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st= con.createStatement();

        ResultSet rs= st.executeQuery("select * from student");
        ///  After Execute this query it return all record present in student table
        /// this operation called select query operation

        
        while (rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}

    

