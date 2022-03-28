<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>


<body>
<h2>Welcome</h2>
<%

	//Connection con=null;
	//try
	//{
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6147","root","root");
		//System.out.println("con");
		//System.out.println("Connection value is"+con);
		//String name=request.getParameter("sname");
		//String password=request.getParameter("password");
		//Statement statement=con.createStatement();
		//ResultSet set=statement.executeQuery("select * from stud where name='"+name+"' and password='"+password+"'");
		//int i=0;
		//if(set.next())
		//{
		//i=1;	
		//}
		//if(i==1)
		//{
		//	response.sendRedirect("");
		//}
	//}
	//catch(Exception e)
	//{
	//	System.out.println(e);
	//}
	
out.println("Value="+session.getAttribute("sname").toString());


%>

</body>
</html>