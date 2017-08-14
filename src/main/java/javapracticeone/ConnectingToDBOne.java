package javapracticeone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectingToDBOne {
	
	//JDBC driver and DB URL
	static final String postgresql_Jdbc_Driver = "org.postgresql.Driver";
	static final String postgresql_Db_Url = "jdbc:postgresql://localhost:5432/Rohith_database";
		
	//DB Credentials
	static final String user_name = "postgres";
	static final String user_password = "rohith27041990";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(postgresql_Jdbc_Driver);
			conn = DriverManager.getConnection(postgresql_Db_Url, user_name, user_password);
			
			//Executing a query
			stmt = conn.createStatement();
			String sql = "INSERT INTO public.users(id, first_name, last_name, age, date_of_birth) VALUES(324052, 'Vaibhav', 'Raj', 27, '1989-05-15')";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null) {
					stmt.close();
				} 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}

	}

}
