import java.sql.*;
import java.util.Scanner;

public class NonSelectAndSelectQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";

        try {
            // Load the MySQL JDBC driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // create statement object
            Statement st= con.createStatement();
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the query");
            String query=sc.nextLine();

            boolean b=st.execute(query);
            if(b==true){

                ResultSet rs= st.getResultSet();
                while (rs.next()){
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
                }
            }  else {
                int rowCount=st.getUpdateCount();
                System.out.println("number of row Affected "+rowCount);
            }

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

