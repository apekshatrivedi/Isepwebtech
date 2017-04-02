<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<html>
<head>
<title>Scriptlet</title>
</head>
<body>
<center>
<h1>Display Current Date & Time and IP Address</h1>
</center>
<li>Current time: <%=new java.util.Date()%><br>
<li>IP Address: <%out.print(  request.getRemoteAddr() ); %><br>
<br><a href='scriptlet.jsp'><button>Refresh</button></a>
<br><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>
</body>
</html>