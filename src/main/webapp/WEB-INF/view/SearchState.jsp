<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1px solid black">
<tr>
	<th>Id</th>
	<th>StateName</th>
	<th>CountryName</th>
	<th>Action</th>
</tr>
<c:forEach items="${SearchList}" var="p">
<tr>
	<td>${p.id}</td>
	<td>${p.state}</td>
	<td>${p.countryvo.country}</td>	
	<td colspan="2"><a href="deleteState?id=${p.id}">Delete</a>&nbsp;&nbsp;<a href="editState?id=${p.id}">Edit</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>