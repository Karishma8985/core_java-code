// Java program to Search the contents of a table in JDBC

import java.sql.*;
public class search_data {
	public static void main(String[] args)
	{		
		PreparedStatement p = null;
		ResultSet rs = null;

		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");

            String sql= "select * from student where id= 2";

			p = conn.prepareStatement(sql);
			rs = p.executeQuery();

			// Step 6: Process the results
			System.out.println(
				"id\t\tname\t\trollno\t\tmarks");

			// Condition check using next() method
			// Holds true till there is single element remaining
		// in the object
			if (rs.next()) {
			
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int rollno = rs.getInt("rollno");
			    int marks = rs.getInt("marks");
				
			// Print and display name, emailID and password
			System.out.println(id + "\t\t" + name + "\t\t" + rollno + "\t\t" + marks);
			}
		}

		// Catch block to handle exceptions
		catch (SQLException e) {

			// Print the exception
			System.out.println(e);
		}
	}
}
