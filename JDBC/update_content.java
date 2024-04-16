// Java Program to Update contents in a table

import java.sql.*;
public class update_content {

	public static void main(String[] args)
	{

		PreparedStatement p = null;
		
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
			String sql= "update student set name='Yami' where id=2";
			p = conn.prepareStatement(sql);
			p.execute();
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}

