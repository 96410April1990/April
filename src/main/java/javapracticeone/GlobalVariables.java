package javapracticeone;

import week3.WrapperMethods;

public class GlobalVariables extends WrapperProject {

	//Set status	
	public String status;
	public static String PASS = "0";
	public static String WARNING = "1";
	public static String FAIL = "2";	
	
	//Time out
	public static int TIMEOUT_ONE_MILLI_SECOND = 1000;
	public static int TIMEOUT_TWO_MILLI_SECOND = 2000;
	public static int TIMEOUT_THREE_MILLI_SECOND = 3000;
	public static int TIMEOUT_FOUR_MILLI_SECOND = 4000;
	public static int TIMEOUT_FIVE_MILLI_SECOND = 5000;
	public static int TIMEOUT_SIX_MILLI_SECOND = 6000;
	public static int TIMEOUT_SEVEN_MILLI_SECOND = 7000;
	public static int PAUSE_TWO_MILLI_SECOND = 2000;
	public static int PAUSE_THREE_MILLI_SECOND = 3000;
	
	//DB details
	static final String postgresql_Jdbc_Driver = "org.postgresql.Driver";
	static final String postgresql_Db_Url = "jdbc:postgresql://localhost:5432/Rohith_database";
	static final String user_name = "postgres";
	static final String user_password = "rohith27041990";
	
}
