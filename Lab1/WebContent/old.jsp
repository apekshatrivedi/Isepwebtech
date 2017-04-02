<%@page import = "lab.mvc.model.Person"%>
<p> Old View</p>
<%
Person bean = (Person)request.getAttribute("bean");
out.println("FirstName: "+bean.getfirstname()+"<br>");
out.println("LastName: "+bean.getlastname()+"<br>");
out.println("Bday: "+bean.getbday()+"<br>");
out.println("Gender: "+bean.getgender()+"<br>");
out.println("<br><a href='form2.html'><button>Back</button></a><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>");
%>