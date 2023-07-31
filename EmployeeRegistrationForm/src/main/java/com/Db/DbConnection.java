package com.Db;
import java.sql.*;
public class DbConnection{
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/EMPLOYEE";
	private static String uname="root";
	private static String password="Malegaon@1";
	static Connection con;
	public static Connection getDbConnection()
	{
		
          try {
			Class.forName(driver);
con=DriverManager.getConnection(url,uname,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}


}

