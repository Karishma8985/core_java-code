import java.sql.*;

public class add_column{

	// driver code
	public static void main(String[] args) throws Exception
	{

		//Connection con = DriverManager.getConnection();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
		// Create Statement
		Statement stmt = conn.createStatement();


		// Query to be executed
//		String query = "Select * from student ORDER by name";
		String query = "ALTER TABLE student ADD COLUMN age INT";
        
        		// Execute SQL query and store the result in any
		// variable
	    int rs = stmt.executeUpdate(query);

        if (rs > 0)
                System.out.println("new column added.");
            else
                System.out.println(
                    "unable to add a column.");
		// System.out.println("id\tname\trollno\tmarks");
		// while (rs.next()) {
		// 	int id = rs.getInt("id");
		// 	String name = rs.getString("name");
		// 	int rollno = rs.getInt("rollno");
		// 	int marks = rs.getInt("marks");

		// 	System.out.println(id + "\t" + name + "\t" + rollno + "\t" +marks);
		// }

		// close the connection
		conn.close();
	}
}

    

