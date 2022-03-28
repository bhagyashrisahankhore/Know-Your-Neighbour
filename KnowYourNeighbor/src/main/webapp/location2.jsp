   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
    <head>
        
    </head>
    <body>
       <font color="#c7bcbb" size="5" ></font>
        <%=request.getParameter("area")%>
        <%String name=request.getParameter("area");  
        
        
        try
    	{
    		Connection con=null;
    	       
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6147","root", "root");
    		//System.out.println("connection value is "+con);
    		Statement statement=con.createStatement();
    	
    		String query = "SELECT * From stud where area='"+name+"'";
    		
    		ResultSet rs=statement.executeQuery(query);
    		while(rs.next())
    		{
        
        
        
        
        %>
   		<TABLE style="background-color :  #b2d669;" WIDTH="30%">
              <tr width="100%">
                             <tr>
                    <td width="50%">house1</td>
                    <td width="50%"><%=rs.getString(2)%></td>
                </tr>
                <tr>
                    
                    <td width="50%">house2</td>
                    <td width="50%"><%=rs.getString(3)%></td>
                </tr>
                <tr>
                
                    <td width="50%">house3</td>
                    <td width="50%"><%=rs.getString(4)%></td>
                </tr>
                     
                    <tr>
                   <td width="50%">house4</td>
                  <td width="50%"><%=rs.getString(5)%></td>
                </tr>
                  
                  <tr>
                  <td width="50%">house5</td>
                  <td width="50%"><%=rs.getString(6)%></td>
                </tr>
                   
                   <tr>
                  <td width="50%">house6</td>
                  <td width="50%"><%=rs.getString(7)%></td>
                </tr>
                   
                   <tr><td></td><td align="right">
			  <A HREF="location1.jsp">
					<font size="6" color="blue">edit</font></A>
			</td>
	    </tr>
        </table>
        <%
    	}
        
    	}catch(Exception e)
        {
        	System.out.println(e);
        }
        
        
        %>   
    </body>
</html>
</body>
</html>