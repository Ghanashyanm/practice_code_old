<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="x" %>
<table>
	<tr>
	<th>First Name</th>
		<th>Last Name</th>
		<th>USer Name</th>
		<th>Password</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	<x:forEach items="${data}" var="i">
		<tr><td>${i.fn} </td>
		<td>${i.ln} </td>
		<td>${i.loginVO.un} </td>
		<td>${i.loginVO.pwd} </td>
		<td> <a href="delete.html?id=${i.id}" >Delete</a></td>
		<td> <a href="edit.html?id=${i.id}" >Edit</a></td>
		</tr>
	</x:forEach>
</table>
</body>
</html>