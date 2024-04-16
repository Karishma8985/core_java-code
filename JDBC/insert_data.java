import java.sql.*;
public class insert_data {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into student(id, name, rollno, marks) values(5,'Nilam',16,240), (6,'Nisarg',14,530), (7,'Nina',29,140), (8,'Payal',20,270)") ;
            // VAR.execute(for creating database)
            
            System.out.println("value inserted");

        conn.close();
        }
        catch(Exception e){
            System.out.println("cant connect to database");
        }
    }
}
