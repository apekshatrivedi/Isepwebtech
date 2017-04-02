package cookies.servlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookieservlet
 */
@WebServlet("/cookies")
public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookieservlet() {
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
		
		
		PrintWriter out = response.getWriter();
		
		
		// Create cookies for first and last names.      
	      Cookie firstName = new Cookie("first_name",
	                      request.getParameter("firstname"));
	      Cookie lastName = new Cookie("last_name",
	                      request.getParameter("lastname"));
	      Cookie birthday = new Cookie("B_day",
                  request.getParameter("bday"));
	      Cookie Gender = new Cookie("gender",
                  request.getParameter("gender"));


	      // Set expiry date after 24 Hrs for both the cookies.
	      firstName.setMaxAge(60*60*24); 
	      lastName.setMaxAge(60*60*24);
	      birthday.setMaxAge(60*60*24);
	      Gender.setMaxAge(60*60*24);
	      
	      		
	      
	      

	      // Add both the cookies in the response header.
	      response.addCookie( firstName );
	      response.addCookie( lastName );
	      response.addCookie( birthday );
	      response.addCookie( Gender );

		
		
		response.setContentType("text/html");		
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
		out.println("</table>");
		out.println("<a href='/Lab1/readcookie'><button>Read cookie</button></a><a href='/Lab1/visitcounter'><button>Visit counter</button></a>");
		out.println("<br><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form></BODY></HTML>");
		
		out.close();
		
		
	}

}
