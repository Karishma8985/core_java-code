import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class usersideinput {

    public static void main(String[] args) throws IOException {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school", "root", "");

            Statement s = con.createStatement();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // query for inserting values in table
            System.out.print("enter  student name, rollno,marks");
            String sname = br.readLine();
            int rollno = Integer.parseInt(br.readLine());
            int marks = Integer.parseInt(br.readLine());

            s.execute(
                    "insert into student(id,name,rollno,marks) VALUES ('" + sname + "','" + rollno + "," + marks + ")");

            s.close(); // close the Statement to let the database know we're done with it

            System.out.println("data inserted successfully");
            con.close(); // close the Connection to let the database know we're done with it

        } catch (SQLException err) {
            System.out.println("Error : " + err);
        } catch (Exception err) {
            System.out.println("ERROR: " + err);
        }

    }

}
