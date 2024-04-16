import java.sql.*;

public class delete_data {
    
	public static void main(String[] args)
	{
		//Connection conn=null;
		PreparedStatement p=null;
		
		try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school1","root","");
            String sql="delete from student where id=1";
			p =conn.prepareStatement(sql);
			p.execute();
		}catch(SQLException e){
			System.out.println(e);
			
		}
	}
	
}


