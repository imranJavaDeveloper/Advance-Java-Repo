

import java.sql.*;

public class InsertQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:mysql://localhost:3306/mydb";
        String userName="root";
        String password="root";

        ///  load Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        ///  create connection object
        Connection con= DriverManager.getConnection(url,userName,password);

        ///  create statement object
        Statement st=con.createStatement();

        String query = "INSERT INTO STUDENT VALUES (4, 'imran', 65)";

       int row= st.executeUpdate(query);
        System.out.println("Data inserted successfully "+row);
        System.out.println(" this data inserted :"+query);
        System.out.println(" thanks ");

        /// close the connection
        con.close();
       

    }
}
