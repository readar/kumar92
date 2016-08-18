<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">

<html>
<head>
<meta charset="ISO-8859-1">
<title>READAR NOVELS</title>
<style>
body{
background-image:url("resources/images/bo3.jpg");
background-repeat:no-repeat;
background-size:cover;
}
td{
font-family:regular;
font-size:20px;

}
</style>
</head>
<body bgcolor="lightblue">
<HR>
<CENTER>
<CENTER>
<CENTER>
<h1 style="color:red;font-family:arial">WELCOME TO REVOLUTIONARY NOVELS</h1>
</CENTER><HR>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<form action="<c:url value="j_spring_security_check" />" method="post">

<table>
<tr>
<td style="color:magenta">USERNAME:</td>
<td><input type="text" name="j_username"/></td>
</tr>
<tr>
<td style="color:magenta">PASSWORD:</td>
<td><input type="password" name="j_password"/></td>
</tr>
<tr>
<td><input type="submit" value="Login"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>
</CENTER>

</body>

</body>
</html>