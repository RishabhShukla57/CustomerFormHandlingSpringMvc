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
  DOB:<br>
  <input type="text" name="date"><br><br>
  Subject:<br>
  <select name="subjects">
  <option value="hindi">Hindi</option>
  <option value="maths">Maths</option>
  <option value="english">English</option>
  <option value="science">Science</option>
</select><br><br>
<table>
<tr>
<td>Country:<input type="text" name="address.country"></td>
<td>State:<input type="text" name="address.state"></td>
<td>City:<input type="text" name="address.city"></td>
<td>Pincode:<input type="text" name="address.pincode"></td>
</tr>
</table>
  <input type="submit" value="Submit">
  
</form>
</body>
</html>