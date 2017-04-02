<jsp:useBean id="user" class="isep.lab1.bean.Person" scope="session"/> 
<jsp:setProperty name="user" property="*"/> 
<HTML>
<BODY>
<h1>You entered</h1><BR>
First Name: <%= user.getfirstname() %><BR>
Last Name: <%= user.getlastname() %><BR>
Birthday: <%= user.getbday() %><BR>
Gender: <%= user.getgender() %><BR> 
<br><a href='form-jsp.html'><button>Back</button></a>
<br><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>
</BODY>
</HTML>