<html>
  <HEAD>
    <TITLE>Expression</TITLE>
  </HEAD>
  <BODY>
    
    <H3 ALIGN="CENTER">
      Random number : 
      <FONT COLOR="RED">
        <%= (int) (Math.random() * 10) %>
      </FONT>
    </H3>
    <H4 ALIGN="CENTER">Refresh the page to see if the number changes...</H4>
  <br><a href='expression.jsp'><button>Refresh</button></a>
<br><form action= '/Lab1/logout'method='post'><input type='submit' value='Home'/></form>
  </BODY>
</HTML>