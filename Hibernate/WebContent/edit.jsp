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
<x:forEach items="${sessionScope.list}" var="i">
	<form action="reg">
		First Name: <input type="text" name="fn_updated" value="${i.fn}"><br><br>
		Last Name: <input type="text" name="ln_updated" value="${i.ln}"><br><br>
		<input type="submit" name="opr" value="update">
	</form>
</x:forEach>
</body>
</html>