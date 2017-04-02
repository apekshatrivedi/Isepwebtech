<%@page import = "lab.mvc.model.Person"%>
<p> Young View</p>
<%
Person bean = (Person)request.getAttribute("bean");
out.print("FirstName: "+bean.getfirstname()+"<br>");
out.print("LastName: "+bean.getlastname()+"<br>");
out.print("Bday: "+bean.getbday()+"<br>");
out.print("Gender: "+bean.getgender()+"<br>");
out.println("<br><a href='form2.html'><button>Back</button></a><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>");
%>