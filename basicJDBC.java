import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class basicJDBC{
     public static void main(String[] args) throws Exception{
        

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prem_practice", "root", "mysql");
        Statement stmt=con.createStatement();
        String s="INSERT INTO practice VALUES('abc' , '333' ,'hiii')";
        stmt.execute(s);
        con.close();
        System.out.println("query executed...");

    }
}