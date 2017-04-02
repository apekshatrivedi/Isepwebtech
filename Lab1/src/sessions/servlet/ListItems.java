package sessions.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList; 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListItems
 */
@WebServlet("/ListItems")
public class ListItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		  ArrayList previousItems =
		   (ArrayList)session.getAttribute("previousItems");
		  if (previousItems == null) {
		   previousItems = new ArrayList();
		   session.setAttribute("previousItems", previousItems);
		  }
		  String newItem = request.getParameter("newItem");
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String title = "List Items";
		out.println(
		        "<BODY BGCOLOR=\"#FDF5E6\">\n" +
		        "<H1>" + title + "</H1>");
		  synchronized(previousItems) {
		   if (newItem != null) {
		    previousItems.add(newItem);
		   }
		   if (previousItems.size() == 0) {
		    out.println("<I>No items</I>");
		   } else {
		    out.println("<UL>");
		    for(int i=0; i<previousItems.size(); i++) {
		     out.println("<LI>" + (String)previousItems.get(i));
		    }
		    out.println("</UL>");
		   }
		  }
		  out.println("<br><a href='items.html'><button>Back</button></a><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></BODY></HTML>");
		 }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
