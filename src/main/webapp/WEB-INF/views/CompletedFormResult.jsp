<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${message}</title>
</head>
<body>
<center>
<h1>${message}</h1>
</center>

  Name:<br>
  ${student.name} <br><br>
  Id:<br>
  ${student.id}<br><br>
  DOB:<br>
  ${student.date}<br><br>
  Subject:<br>
  ${student.subjects}<br><br>
  <table>
<tr>
<td>Country:${student.address.country}</td>
<td>State:${student.address.state}</td>
<td>City:${student.address.city}</td>
<td>Pincode:${student.address.pincode}</td>
</tr>
</table>
</body>
</html>