import java.sql.*;

class createconnection {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            // Connection var =
            // DriverManager.getConnection("jdbc:mysql://localhost:3306","root",""); for
            // connection to sql server
            System.out.println("connection create Successfully");
            conn.close();
        } catch (Exception e) {
            System.out.println("cant connect to database");
        }

    }
}