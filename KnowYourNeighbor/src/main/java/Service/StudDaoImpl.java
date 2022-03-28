package Service;
import java.sql.*;

//import javax.servlet.http.HttpSession;

import Entity.Studdata;
import dbconnect.Connectionfactory;
public class StudDaoImpl implements StudService

{

	@Override
	public void addStuddata(Studdata studdata) 
	{
		try
		{
	Connection con=null;
   Class.forName("com.mysql.cj.jdbc.Driver");
   System.out.println("1");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6147","root", "root");
	System.out.println("con");
	System.out.println("Connection value is" +con);
	
		Statement statement=con.createStatement();
		System.out.println("Request Arrived="+studdata.getName());
		String query="INSERT INTO `stud`(`id`,`name`,`mobile`,`password`,`cpassword`,`area`,`address`,`city`,`state`,`country`) VALUES('"+studdata.getId()+"','"+studdata.getName()+"','"+studdata.getMobile()+"','"+studdata.getPassword()+"','"+studdata.getCpassword()+"','"+studdata.getArea()+"','"+studdata.getAddress()+"','"+studdata.getCity()+"','"+studdata.getState()+"','"+studdata.getCountry()+"')";
        statement.executeUpdate(query);
		System.out.println("Success");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}


	public boolean loginStud(Studdata studdata) 
	{
		System.out.println("Inside Dao");
        Connection con=null;
	    
		try
		{
			con=Connectionfactory.getconnection();
			Statement statement=con.createStatement();
			System.out.println(studdata.getName());
			System.out.println("inside try");
			//HttpSession session=null;
		String query="SELECT * from stud where `name`='"+studdata.getName()+"' AND `password`='"+studdata.getPassword()+"'";
		ResultSet resultset=statement.executeQuery(query);
		if(resultset.next())
			{
				return true;
			}
		
	}
		catch(Exception e)		
		{
		System.out.println(e);
	}
		return false;
		
	}
	
}


