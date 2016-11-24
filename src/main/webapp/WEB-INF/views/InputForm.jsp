<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>${message}</title>
</head>
<body>
<center>
<h1>${message}</h1>
</center>
<form action="loginSuccess.html" method  ="post">
  Name:<br>
  <input type="text" name="name"><br>
  Id:<br>
  <input type="text" name="id"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>