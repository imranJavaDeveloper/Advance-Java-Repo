package takeinputfromuser;
import java.util.Scanner;

public class UserInput {
    public static void main(String [] args)  {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter emp id");
        int eno= sc.nextInt();

        System.out.println("enter emp name");
        String ename=sc.next();

        System.out.println("enter emp salary ");
        double esal =sc.nextDouble();

        String sqlQuery = String.format("INSERT INTO em VALUES(%d, '%s', %.2f)", eno, ename, esal);
        System.out.println(" data inserted successfully");
        System.out.println("your data "+sqlQuery);
    }
}
