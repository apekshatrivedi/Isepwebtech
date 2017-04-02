package cookies.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class visitcounter
 */
@WebServlet("/visitcounter")
public class visitcounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	private int count;
	
	public void init()
	{
		count=0;
	}
	
	    public visitcounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		
		
		PrintWriter out = response.getWriter(); 
		String c1=String.valueOf(count);
		Cookie c = new Cookie("Hits", c1);
		  c.setMaxAge(60*60*24); 
		  response.addCookie( c );
		  
		  
		  
		  
	      response.setContentType("text/html");
	      
	      
	      String title = "Visits";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	                "<html>\n" +
	                "<head><title>" + title + "</title></head>\n" +
	                "<body bgcolor=\"#f0f0f0\">\n");
	      out.println("<h1>Visits</h1><br>");
	      
	            out.print("Name : " + c.getName( ) + ",  ");
	            out.print("Value: " + c.getValue( )+" <br/>");
	         
	      out.println("<br><br><a href='/Lab1/visitcounter'><button>Refresh</button></a>");
	      out.println("<a href='form1.html'><button>Back</button></a><br>");
	      out.println("<form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>");
	      out.println("</body>");
	      out.println("</html>");
		  
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
