package javapracticeone;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

public class ConnectingToDB {
	
	//JDBC driver and DB URL
	static final String postgresql_Jdbc_Driver = "org.postgresql.Driver";
	static final String postgresql_Db_Url = "jdbc:postgresql://localhost:5432/Rohith_database";
	
	//DB Credentials
	static final String user_name = "postgres";
	static final String user_password = "rohith27041990";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		java.sql.Connection db_Conn = null;
		Statement stmt = null;
				
		try {
			 Class.forName(postgresql_Jdbc_Driver);
			 db_Conn = DriverManager.getConnection(postgresql_Db_Url, user_name, user_password);
			 stmt = db_Conn.createStatement();
			 String sql_query = "SELECT id, first_name, last_name FROM public.users order by id";
			 ResultSet rs_set = stmt.executeQuery(sql_query);
			 
			 //Extracting data from the set
			 while (rs_set.next()) {
				
				 int id = rs_set.getInt("id");
				 String first_name = rs_set.getString("first_name");
				 String last_name = rs_set.getString("last_name");
				 
				 //Display the values
				 System.out.println("The ID is:"+" "+id+", "+"the first name is:"+" "+first_name+" "+"and the last name is:"+" "+last_name);		 
			}
			 rs_set.close();
			 stmt.close();
			 db_Conn.close();			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
