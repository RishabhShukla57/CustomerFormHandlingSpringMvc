<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>${message}</title>
</head>
<body>
<center>
<h1>${message}</h1>
</center>
<form action="loginFormCheck.html" method  ="post">
  UserName:<br>
  <input type="text" name="username"><br>
  Password:<br>
  <input type="password" name="password"><br><br>
   <input type="submit" value="Submit">
</form>
</body>
</html>
