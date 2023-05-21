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

<form action="Controller" method="post">
<c:forEach items="${sessionScope.editData}" var="i">
First Name:<input type="text" name="fn1" value="${i.firstname}"><br>
Last Name:<input type="text" name="ln1" value="${i.lastname}"><br>
<input type="hidden" name="id" value="${i.id}">
<input type="hidden" name="flag" value="update">
<input type="Submit" value="Submit">
</c:forEach>
</form>

</body>
</html>