package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionfactory 
{
	public static Connection getconnection()
	{
		Connection con=null;
		try
		{
			System.out.println("Inside Connection factory");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6147","root","root");
			System.out.println("con");
			System.out.println("Connection value is"+con);
			return con;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	return con;
	}
	}


