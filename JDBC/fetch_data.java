// Java Program retrieving contents of Table Using JDBC connection
// Importing SQL libraries to create database
import java.sql.*;

public class fetch_data{

	// Step1: Main driver method
	public static void main(String[] args)
	{
		PreparedStatement p = null;
		ResultSet rs = null;

                // Try block to catch exception/s
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
                       
			// SQL command data stored in String datatype
			String sql = "select * from student";
			p = conn.prepareStatement(sql);
			rs = p.executeQuery();

			// Printing ID, name, rollno,marks of students
			// of the SQL command above
			System.out.println("id\t\tname\t\trollno\t\tmarks");

			// Condition check
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				int rollno = rs.getInt("rollno");
				int marks = rs.getInt("marks");

				System.out.println(id + "\t\t" + name
								+ "\t\t" + rollno + "\t\t" + marks);
			}
		}

		// Catch block to handle exception
		catch (SQLException e) {

			// Print exception pop-up on screen
			System.out.println(e);
		}
	}
}
