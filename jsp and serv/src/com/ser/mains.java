package com.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ser
 */
public class mains extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public mains() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("anshu");
	//	response.setStatus(1);
		//esponse.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid,password;
		userid=request.getParameter("userid");
		password=request.getParameter("password");
		auth au=new auth();
		au.authenticate(userid, password);
		/*if(result){
			response.sendRedirect("success.jsp");
			return;
		}*/
		response.sendRedirect("index.jsp");
		response.setStatus(1);
		return;
		
	}

}
