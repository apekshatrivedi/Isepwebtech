package sessions.servlet;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sessions
 */
@WebServlet("/sessions")
public class ShowSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
	 

	
    public ShowSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Create a session object if it is already not  created.
	      HttpSession session = request.getSession(true);
	      // Get session creation time.
	      Date createTime = new Date(session.getCreationTime());
	      // Get last access time of this web page.
	      Date lastAccessTime = 
	                        new Date(session.getLastAccessedTime());
	      PrintWriter out = response.getWriter();
	      String title = "Welcome Back to my website";
	      Integer visitCount= new Integer(0); ;
	      String visitCountKey = new String("visitCount");
	      String userIDKey = new String("userID");
	      String userID = new String("ABCD");

	      // Check if this is new comer on your web page.
	      if (session.isNew()){
	    	  
	    	  
	         title = "Welcome to my website";
	         session.setAttribute(userIDKey, userID);
	         
	         out.println("<html>");
	         out.println("<head>");
	         out.println("<meta charset='UTF-8'>");
	         
	         out.println("<title>"+title+"</title>");
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<h1>"+title+"</h1>");
	         out.println("<form name = 'myform' method = 'post' action= 'sessions'>");
	         out.println("  First name:<br>");
	         out.println("  <input type='text' name='firstname' required>");
	         out.println("  <br>");
	         out.println("  Last name:<br>");
	         out.println("  <input type='text' name='lastname'required>");
	         out.println("  <br>");
	         out.println("  Birthday:<br>");

	         out.println("<input type='date' name='bday' required placeholder = 'dd-mm-yyyy'>");
	         out.println("  <br>");
	         out.println(" <input type='submit' value='Submit'>");
	         out.println("  </form>");
	         out.println("  <br><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form></body>");
	         out.println("  </html>");
	         
	    	  }
	    	  
	    	  
	    	 
	         
	         
	      else {
	         visitCount = (Integer)session.getAttribute(visitCountKey);
	         visitCount = visitCount + 1;
	         userID = (String)session.getAttribute(userIDKey);
	         
	         
	         String firstname = request.getParameter("firstname");
	 		String lastname = request.getParameter("lastname");
	 		String bday = request.getParameter("bday");
	 		System.out.println(bday);
	 		
	 		
	 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 		LocalDate formatDate = LocalDate.parse(bday,formatter);
	        LocalDate formatDate1= LocalDate.now();
	        LocalDate formatDate2 = formatDate.withYear(formatDate1.getYear());
	 		System.out.println(formatDate.getDayOfMonth());
	 		
	 		if(formatDate2.isBefore(formatDate1)||formatDate2.isEqual(formatDate1))
	 		{
	 			formatDate2= formatDate2.plusYears(1); 
	 		}
	 		
	 		Period p = Period.between(formatDate1, formatDate2);
	 		long p2= ChronoUnit.DAYS.between(formatDate1, formatDate2);
	 		
	 		
	 		response.setContentType("text/html");
			
			out.println("<HTML>");
			out.println("<HEAD><TITLE>Welcome Back to my site</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<H1> Welcome Back to my site </H1>");
			out.println("Hi,"+firstname+" "+ lastname +".<br>There are "+p2+" days to your birthday.<br>No. of visits:"+visitCount);
			out.println("<br><br><form action= '/Lab1/logout'method='post'><input type='submit' value='Logout'/></form></BODY></HTML>");
			out.close();
			 
	      }
	      session.setAttribute(visitCountKey,  visitCount);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
