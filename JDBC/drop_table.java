import java.sql.*;
public class drop_table {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school45","root","");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE students");
            // VAR.execute(for creating database)
            
            System.out.println("table deleted");

        conn.close();
        }
        catch(Exception e){
            System.out.println("cant connect to database");
        }
    }
}

