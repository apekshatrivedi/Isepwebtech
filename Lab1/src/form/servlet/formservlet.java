package form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formservlet
 */
@WebServlet(name = "formservlet",urlPatterns={ "/formServlet", "/form_Servlet" })
public class formservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formservlet() {
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
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String bday = request.getParameter("bday");
		String gender = request.getParameter("gender");
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Form details</TITLE></HEAD>");
		out.println("<style>		table, th, td {		    border: 1px solid black;	}		</style>");
		out.println("<BODY>");
		out.println("<H1> Form details </H1>");
		out.println("<table style='width:100%'>");
		out.println("<tr>");
		out.println("<th>Firstname</th>");
		out.println("<th>Lastname</th>");
		out.println("<th>Birthday</th>");
		out.println("<th>Gender</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+firstname+"</td>");
		out.println("<td>"+lastname+"</td>");
		out.println("<td>"+bday+"</td>");
		out.println("<td>"+gender+"</td>");
		
		out.println("</tr>");
		out.println("</table><br><br>");
		out.println("<a href='form.html'><button>Back</button></a>");
		out.println("<form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>");
		out.println("</BODY></HTML>");
		
		out.close();
		
	}

}
