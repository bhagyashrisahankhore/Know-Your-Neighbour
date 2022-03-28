package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entity.Studdata;
import Service.StudDaoImpl;

/**
 * Servlet implementation class registerData
 */
@WebServlet("/registerData")
public class registerData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerData() {
        super();
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
		Studdata studdata=new Studdata();
		studdata.setId(Integer.parseInt(request.getParameter("sid")));
		studdata.setName(request.getParameter("sname"));
		studdata.setMobile(request.getParameter("mob"));
		studdata.setPassword(request.getParameter("pswd"));
		studdata.setCpassword(request.getParameter("cpswd"));
		studdata.setArea(request.getParameter("area"));
		studdata.setAddress(request.getParameter("address"));
		studdata.setCity(request.getParameter("city"));
		studdata.setState(request.getParameter("state"));
		studdata.setCountry(request.getParameter("country"));
		StudDaoImpl daoimpl=new StudDaoImpl();
		daoimpl.addStuddata(studdata);
		System.out.println("Registration Successfully");
	}

}
