<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<h1>Ajax Login</h1>
<br>
<form name="form1" method="GET" action="Ajaxexample" id="form1">
<table>
<tr>
<td>Userid</td><td><input type="text" name="n1"/></td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="n2"/></td>
</tr>
<tr>
<td></td><td><input type="submit" value="Login"/></td>
</tr>
<tr>

<td>Message</td><td><input type="text" value="" id="result"/></td>
</tr>
</table>
</form>
</body>
</html>
<script type="text/javascript" src="jquery-3.2.0.min.js"></script>
<script type="text/javascript">
 
var form = $('#form1');
form.submit(function () {
 
$.ajax({
type: form.attr('method'),
url: form.attr('action'),
data: form.serialize(),
success: function (data) {
var result=data;
$('#result').attr("value",result);
 
}
});
 
return false;
});
</script>