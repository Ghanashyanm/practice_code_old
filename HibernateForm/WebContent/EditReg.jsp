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
	<form action="RegisterController" method="post">
		<c:forEach items="${sessionScope.regData}" var="i">
First Name :<input type="text" name="fn" value="${i.fn}">
			<br>
Last Name :<input type="text" name="ln" value="${i.ln}">
			<br>
			<input type="hidden" name="id" value="${i.id}">
		</c:forEach>
		<c:forEach items="${sessionScope.loginData}" var="j">
User Name :<input type="text" name="un" value="${j.un}">
			<br>
Password :<input type="password" name="pwd" value="${j.pwd}">
			<br>
			<input type="hidden" name="loginId" value="${j.loginId}">
		</c:forEach>
		<input type="hidden" name="flag" value="updateReg">
		<input type="submit" value="Submit">

	</form>
</body>
</html>