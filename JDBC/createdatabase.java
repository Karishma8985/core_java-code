import java.sql.*;
public class createdatabase {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            Statement stmt = conn.createStatement();
        //  Statement var = var.createStatement();
            stmt.execute("create database school1");
         // var.execute("create databse database_name");
            
            System.out.println("database created");

        conn.close();
        }
        catch(Exception e){
            System.out.println("cant connect to database");
        }
    }
}
