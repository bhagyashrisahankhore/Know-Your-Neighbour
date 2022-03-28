package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Studdata;
import Service.StudDaoImpl;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Request entered");
		StudDaoImpl daoimpl=new StudDaoImpl();
		Studdata studdata=new Studdata();
		studdata.setName(request.getParameter("sname"));
		studdata.setPassword(request.getParameter("password"));
		
		String name=studdata.getName();
		//String password=studdata.getPassword();
		//System.out.println(name);
		
		HttpSession session=null;
		session=request.getSession(true);
		session.setAttribute("sname",name);
		System.out.println("Value="+session.getAttribute("sname").toString());
		boolean test=false;
		test= daoimpl.loginStud(studdata);
		if(test==true)
		{
			response.sendRedirect("login.jsp");
			System.out.println("Login Success");
		}
		else
		{
			response.sendRedirect("passwordMissmatch.html");
			System.out.println("Login Fail");
		}
	}

}
