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
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>State</th>
			<th>Country</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		
		<c:forEach items="${sessionScope.stateData}" var="i">
		<tr>
			<td>${i.id}</td>
			<td>${i.stateName}</td>
			<td>${i.countryVO.countryName}</td>
			<td><a href="StateController?flag=deleteState&id=${i.id}">Delete</a></td>
			<td><a href="StateController?flag=editState&id=${i.id}">Edit</a></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>