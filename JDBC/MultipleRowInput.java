
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MultipleRowInput {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st= con.createStatement();
        Scanner sc= new Scanner(System.in);
        while (true){

            System.out.println("enter emp id");
            int eno= sc.nextInt();

            System.out.println("enter emp name");
            String ename=sc.next();

            System.out.println("enter emp salary ");
            double esal =sc.nextDouble();

            String sqlQuery = String.format("INSERT INTO em VALUES(%d, '%s', %.2f)", eno, ename, esal);
            System.out.println(" data inserted successfully");
            System.out.println("your data "+sqlQuery);

            System.out.println("do you want to store more row [yes /No]");
            String option= sc.next();

            if (option.equalsIgnoreCase("no")){
                System.out.println(" you chose no option ");
                System.out.println("thanks for connect with me ");
                break;
            }

        }
    }
}
