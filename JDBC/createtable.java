import java.sql.*;
public class createtable {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
            Statement stmt = conn.createStatement();
            stmt.execute("create  table student(id int(4), name varchar(10), rollno int(4), marks int(4))");
        //  var.execute(create table table_name(table_field_name field_data_type(number_for_input_size)));
            
            System.out.println("table created");

        conn.close();
        }
        catch(Exception e){
            System.out.println("cant connect to database");
        }
    }
}
