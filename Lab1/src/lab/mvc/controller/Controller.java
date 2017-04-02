package lab.mvc.controller;
import lab.mvc.model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String bday = request.getParameter("bday");
		String gender = request.getParameter("gender");
		
				
		Person bean = new Person();
		bean.setfirstname(firstname);
		bean.setlastname(lastname);
		bean.setbday(bday);
		bean.setgender(gender);
		
		request.setAttribute("bean", bean); 
		
		boolean status=bean.validate();
		
		if(status)
		{
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/young.jsp");
		dispatcher.include(request, response);
		}
		else
		{
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/old.jsp");
			dispatcher.include(request, response);
		}
	}

}
