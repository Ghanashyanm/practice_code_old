<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
	<table border="1px solid black">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Delete</th>
			<th>Edit</th>
			
		</tr>
		<c:forEach items="${searchList}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.fn}</td>
				<td>${s.ln}</td>
				<td><a href="delete?id=${s.id}">Delete</a></td>
				<td><a href="edit?id=${s.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>