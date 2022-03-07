<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>spring MVC Framework</title>
</head>
<body>

<h1>${headerMessage}</h1>
<h3>Congratulations! the engineering college has processed ypur application </h3>
<h2>Details Submitted by you::</h2>

<table>
<tr>
<td>student Name:</td>
<td>${student1.studentName}</td>
</tr>
<tr>
<td>student Hobby:</td>
<td>${student1.studentHobby}</td>
</tr>


</table>


</html>