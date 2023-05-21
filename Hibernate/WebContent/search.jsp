<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="reg">
		Search: <input type="text" name="keyword">
		<input type="submit" name="opr" value="search">
	</form>
	
	<br>

	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="x"%>
	<x:if test="${param.deletion eq 'true'}">
		<h2>Data Deleted Successfully</h2>
	</x:if>
	<x:if test="${param.updation eq 'true'}">
		<h2>Data Updated Successfully</h2>
	</x:if>
	${sessionScope.opr}
	<x:if test="${sessionScope.opr eq 'Search results'}">
	
	<table border="1px">
	<thead>
		<tr>
			<th>id</th>
			<th>fn</th>
			<th>ln</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<x:forEach items="${sessionScope.list}" var="i">
		<tr>
			<td>${i.id}</td>
			<td>${i.fn}</td>
			<td>${i.ln}</td>
			<td>
				<a href="reg?opr=edit&id=${i.id}">Edit </a> &nbsp;
				<a href="reg?opr=delete&id=${i.id}">Delete </a>
			</td>
		</tr>
		</x:forEach>
	</tbody> 
	</table>
	</x:if>
</body>
</html>